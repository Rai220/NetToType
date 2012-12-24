NetToType
=========

Java key press simulator with network control.

Позволяет эмулировать нажатия горячих клавиш. Управляется по сети через Http-запросы.

Запускает локальный веб-сервер на 80-ом порту. Чтобы эмулировать нажатия клавиш, надо передать их коды get-запросом.

Например, чтобы имитировать нажатие CTRL+ALT+E нужно обратиться к URL'у: http://адрес_сервера/?16&17&76

Справка по идентификаторам кнопок возвращается по адресу http://адрес_сервера/

Поддерживаемые клавиши и их коды:

Cancel  3
Backspace	8
Tab	9
Enter	10
Clear	12
Shift	16
Ctrl	17
Alt	18
Pause	19
Caps Lock	20
Kana	21
Final	24
Kanji	25
Escape	27
Convert	28
No Convert	29
Accept	30
Mode Change	31
Space	32
Page Up	33
Page Down	34
End	35
Home	36
Left	37
Up	38
Right	39
Down	40
Comma	44
Minus	45
Period	46
Slash	47
0	48
1	49
2	50
3	51
4	52
5	53
6	54
7	55
8	56
9	57
Semicolon	59
Equals	61
A	65
B	66
C	67
D	68
E	69
F	70
G	71
H	72
I	73
J	74
K	75
L	76
M	77
N	78
O	79
P	80
Q	81
R	82
S	83
T	84
U	85
V	86
W	87
X	88
Y	89
Z	90
Open Bracket	91
Back Slash	92
Close Bracket	93
NumPad-0	96
NumPad-1	97
NumPad-2	98
NumPad-3	99
NumPad-4	100
NumPad-5	101
NumPad-6	102
NumPad-7	103
NumPad-8	104
NumPad-9	105
NumPad *	106
NumPad +	107
NumPad ,	108
NumPad -	109
NumPad .	110
NumPad /	111
F1	112
F2	113
F3	114
F4	115
F5	116
F6	117
F7	118
F8	119
F9	120
F10	121
F11	122
F12	123
Delete	127
Dead Grave	128
Dead Acute	129
Dead Circumflex	130
Dead Tilde	131
Dead Macron	132
Dead Breve	133
Dead Above Dot	134
Dead Diaeresis	135
Dead Above Ring	136
Dead Double Acute	137
Dead Caron	138
Dead Cedilla	139
Dead Ogonek	140
Dead Iota	141
Dead Voiced Sound	142
Dead Semivoiced Sound	143
Num Lock	144
Scroll Lock	145
Ampersand	150
Asterisk	151
Double Quote	152
Less	153
Print Screen	154
Insert	155
Help	156
Meta	157
Greater	160
Left Brace	161
Right Brace	162
Back Quote	192
Quote	222
Up	224
Down	225
Left	226
Right	227
Alphanumeric	240
Katakana	241
Hiragana	242
Full-Width	243
Half-Width	244
Roman Characters	245
All Candidates	256
Previous Candidate	257
Code Input	258
Japanese Katakana	259
Japanese Hiragana	260
Japanese Roman	261
Kana Lock	262
Input Method On/Off	263
At	512
Colon	513
Circumflex	514
Dollar	515
Euro	516
Exclamation Mark	517
Inverted Exclamation Mark	518
Left Parenthesis	519
Number Sign	520
Plus	521
Right Parenthesis	522
Underscore	523
Windows	524
Context Menu	525
F13	61440
F14	61441
F15	61442
F16	61443
F17	61444
F18	61445
F19	61446
F20	61447
F21	61448
F22	61449
F23	61450
F24	61451
Compose	65312
Begin	65368
Alt Graph	65406
Stop	65480
Again	65481
Props	65482
Undo	65483
Copy	65485
Paste	65487
Find	65488
Cut	65489
