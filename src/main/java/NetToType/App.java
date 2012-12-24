package NetToType;

import com.sun.org.apache.xpath.internal.axes.WalkingIteratorSorted;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        new App();
    }

    private final Robot robot;

    public App() throws Exception {
        robot = new Robot();
        startServer();
        System.out.println("Server started. Waiting for keys...");
    }

    private void startServer() throws Exception {
        Handler handler = new AbstractHandler() {
            @Override
            public void handle(String s, Request request, HttpServletRequest httpServletRequest, HttpServletResponse rsp) throws IOException, ServletException {

                rsp.setContentType("text/html");
                rsp.setStatus(HttpServletResponse.SC_OK);

                ArrayList<Integer> keys = new ArrayList<Integer>();
                for (String st : request.getParameterMap().keySet()) {
                    try {
                        int key = Integer.parseInt(st);
                        if (isCorrectKey(key)) {
                            keys.add(key);
                        } else {
                            throw new NumberFormatException();
                        }
                    } catch (NumberFormatException ex) {
                        rsp.getWriter().println("<b>Incorrect key:</b> " + st);
                    }
                }

                if (keys.isEmpty()) {
                    rsp.getWriter().println("<h1>Hello</h1><br><table>");
                    for (int i = 0; i < 65536; i++) {
                        String text = KeyEvent.getKeyText(i);
                        if (isCorrectKey(i)) {
                            rsp.getWriter().println("<tr><td>" + text + "</td><td>" + i + "</td></tr>");
                        }
                    }
                    rsp.getWriter().println("</table>");
                } else {
                    rsp.getWriter().println("Pressing keys: <br>");
                    for (Integer i : keys) {
                        rsp.getWriter().println(KeyEvent.getKeyText(i) + "<br>");
                    }
                    pressEndRelease(keys);
                }
                request.setHandled(true);
            }
        };

        Server server = new Server(80);
        server.setHandler(handler);
        server.start();
    }

    protected boolean isCorrectKey(int keyNum) {
        String text = KeyEvent.getKeyText(keyNum);
        return !text.toUpperCase().startsWith("UNKNOWN");
    }

    public void pressEndRelease(Iterable<Integer> keys) {
        for (int k : keys) {
            robot.keyPress(k);
        }

        for (int k : keys) {
            robot.keyRelease(k);
        }
    }
}
