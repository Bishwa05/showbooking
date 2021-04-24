
INSERT INTO Theater VALUES (1, 'PVR', 'Bangalore', 20, 'N');
INSERT INTO Theater VALUES (2, 'INOX', 'Bangalore', 15, 'N');
INSERT INTO Theater VALUES (3, 'REX', 'Bangalore', 10, 'N');
INSERT INTO Theater VALUES (4, 'PVR', 'Hyderabad', 15, 'N');
INSERT INTO Theater VALUES (5, 'INOX', 'Hyderabad', 10, 'N');
INSERT INTO Theater VALUES (6, 'NAT', 'Hyderabad', 5, 'N');
INSERT INTO Theater VALUES (7, 'PVR', 'Kolkata', 15, 'N');
INSERT INTO Theater VALUES (8, 'INOX', 'Kolkata', 10, 'N');
INSERT INTO Theater VALUES (9, 'THE', 'Kolkata', 5, 'N');


INSERT INTO Screen VALUES (1,'Star', 50, 'Y');
INSERT INTO Screen VALUES (2, 'Earth', 30, 'N');
INSERT INTO Screen VALUES (3, 'Sun', 100, 'N');
INSERT INTO Screen VALUES (4, 'Moon', 25, 'Y');
INSERT INTO Screen VALUES (5, 'Asteriod', 35, 'Y');

INSERT INTO Theater_Screen_Mapping VALUES (100, 1, 1,'Y');
INSERT INTO Theater_Screen_Mapping VALUES (101, 1, 2,'Y');
INSERT INTO Theater_Screen_Mapping VALUES (102, 2, 3,'Y');
INSERT INTO Theater_Screen_Mapping VALUES (103, 2, 4,'Y');
INSERT INTO Theater_Screen_Mapping VALUES (104, 4, 5,'Y');
INSERT INTO Theater_Screen_Mapping VALUES (200, 4, 1,'Y');
INSERT INTO Theater_Screen_Mapping VALUES (201, 7, 2,'Y');
INSERT INTO Theater_Screen_Mapping VALUES (202, 7, 3,'Y');


INSERT INTO Seat VALUES (1,100,'A',1, 'Y', 1);
INSERT INTO Seat VALUES (2,100,'A',2, 'Y', 1);
INSERT INTO Seat VALUES (3,100,'A',3, 'Y', 1);
INSERT INTO Seat VALUES (4,100,'A',4, 'Y', 1);
INSERT INTO Seat VALUES (5,100,'B',1, 'Y', 1);
INSERT INTO Seat VALUES (6,100,'B',2, 'Y', 1);
INSERT INTO Seat VALUES (7,100,'B',3, 'Y', 1);
INSERT INTO Seat VALUES (8,100,'B',4, 'Y', 1);
INSERT INTO Seat VALUES (9,100,'C',1, 'Y', 1);
INSERT INTO Seat VALUES (10,100,'C',2, 'Y', 1);
INSERT INTO Seat VALUES (11,100,'C',3, 'Y', 1);
INSERT INTO Seat VALUES (12,100,'C',4, 'Y', 1);
INSERT INTO Seat VALUES (13,102,'A',1, 'Y', 1);
INSERT INTO Seat VALUES (14,102,'A',2, 'Y', 1);
INSERT INTO Seat VALUES (15,102,'A',3, 'Y', 1);
INSERT INTO Seat VALUES (16,102,'A',4, 'Y', 1);
INSERT INTO Seat VALUES (17,102,'B',1, 'Y', 1);
INSERT INTO Seat VALUES (18,102,'B',2, 'Y', 1);
INSERT INTO Seat VALUES (19,102,'B',3, 'Y', 1);
INSERT INTO Seat VALUES (20,102,'B',4, 'Y', 1);
INSERT INTO Seat VALUES (21,102,'C',1, 'Y', 1);
INSERT INTO Seat VALUES (22,102,'C',2, 'Y', 1);
INSERT INTO Seat VALUES (23,102,'C',3, 'Y', 1);
INSERT INTO Seat VALUES (24,102,'C',4, 'Y', 1);
INSERT INTO Seat VALUES (1,101,'A',1, 'Y', 1);
INSERT INTO Seat VALUES (2,101,'A',2, 'Y', 1);
INSERT INTO Seat VALUES (3,101,'A',3, 'Y', 1);
INSERT INTO Seat VALUES (4,101,'A',4, 'Y', 1);
INSERT INTO Seat VALUES (5,101,'B',1, 'Y', 1);
INSERT INTO Seat VALUES (6,101,'B',2, 'Y', 1);
INSERT INTO Seat VALUES (7,101,'B',3, 'Y', 1);
INSERT INTO Seat VALUES (8,101,'B',4, 'Y', 1);
INSERT INTO Seat VALUES (9,101,'C',1, 'Y', 1);
INSERT INTO Seat VALUES (10,101,'C',2, 'Y', 1);
INSERT INTO Seat VALUES (11,101,'C',3, 'Y', 1);
INSERT INTO Seat VALUES (12,101,'C',4, 'Y', 1);


INSERT INTO Show VALUES (1,'Harry Porter', 120, 8.5, 'N', 'U',1);
INSERT INTO Show VALUES (2,'Godzilla', 120, 8.5, 'N', 'U',1);
INSERT INTO Show VALUES (3,'Hercules', 110, 8.5, 'N', 'U',1);
INSERT INTO Show VALUES (4,'Snow Queen', 110, 8.5, 'N', 'U',1);
INSERT INTO Show VALUES (5,'The Piper', 110, 8.5, 'N', 'U',1);


INSERT INTO Show_Seat_Mapping VALUES (1001, 1, 100, 'Y', 1, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1002, 1, 100, 'Y', 2, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1003, 1, 100, 'Y', 3, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1004, 1, 100, 'Y', 4, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1005, 1, 100, 'Y', 5, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1006, 1, 100, 'Y', 6, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1007, 1, 100, 'Y', 7, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1008, 1, 100, 'Y', 8, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1009, 1, 100, 'Y', 9, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1010, 1, 100, 'Y', 10, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');

INSERT INTO Show_Seat_Mapping VALUES (1011, 2, 100, 'Y', 1, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1012, 2, 100, 'Y', 2, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1013, 2, 100, 'Y', 3, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1014, 2, 100, 'Y', 4, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1015, 2, 100, 'Y', 5, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1016, 2, 100, 'Y', 6, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1017, 2, 100, 'Y', 7, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1018, 2, 100, 'Y', 8, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1019, 2, 100, 'Y', 9, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1020, 2, 100, 'Y', 10, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');



INSERT INTO Show_Seat_Mapping VALUES (1021, 3, 102, 'Y', 1, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1022, 3, 102, 'Y', 2, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1023, 3, 102, 'Y', 3, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1024, 3, 102, 'Y', 4, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1025, 3, 102, 'Y', 5, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1026, 3, 102, 'Y', 6, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1027, 3, 102, 'Y', 7, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1028, 3, 102, 'Y', 8, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1029, 3, 102, 'Y', 9, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1030, 3, 102, 'Y', 10, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');

INSERT INTO Show_Seat_Mapping VALUES (1031, 3, 102, 'Y', 1, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1032, 3, 102, 'Y', 2, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1033, 3, 102, 'Y', 3, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1034, 3, 102, 'Y', 4, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1035, 3, 102, 'Y', 5, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1036, 3, 102, 'Y', 6, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1037, 3, 102, 'Y', 7, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1038, 3, 102, 'Y', 8, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1039, 3, 102, 'Y', 9, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1040, 3, 102, 'Y', 10, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');


INSERT INTO Show_Seat_Mapping VALUES (1041, 4, 101, 'Y', 1, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1042, 4, 101, 'Y', 2, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1043, 4, 101, 'Y', 3, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1044, 4, 101, 'Y', 4, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1045, 4, 101, 'Y', 5, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1046, 4, 101, 'Y', 6, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1047, 4, 101, 'Y', 7, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1048, 4, 101, 'Y', 8, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1049, 4, 101, 'Y', 9, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1050, 4, 101, 'Y', 10, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');

INSERT INTO Show_Seat_Mapping VALUES (1051, 3, 101, 'Y', 1, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1052, 3, 101, 'Y', 2, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1053, 3, 101, 'Y', 3, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1054, 3, 101, 'Y', 4, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1055, 3, 101, 'Y', 5, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1056, 3, 101, 'Y', 6, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1057, 3, 101, 'Y', 7, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1058, 3, 101, 'Y', 8, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1059, 3, 101, 'Y', 9, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');
INSERT INTO Show_Seat_Mapping VALUES (1060, 3, 101, 'Y', 10, 'N', 'Y', TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS'), TO_DATE('10/04/2021 15:00:00','DD/MM/YYYY HH24:MI:SS'),'N');




TO_DATE('10/04/2021 12:00:00','DD/MM/YYYY HH24:MI:SS')







