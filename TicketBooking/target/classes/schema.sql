DROP TABLE Theater;

CREATE TABLE Theater (
  theaterId INT  PRIMARY KEY,
  theaterName VARCHAR(50) NOT NULL,
  city VARCHAR(30) NOT NULL,
  totalScreens INT NOT NULL,
  isMaintainance CHAR(1)
);

DROP TABLE Screen;

CREATE TABLE Screen (
  screen_Id INT PRIMARY KEY,
  screen_Name VARCHAR(50) NOT NULL,
  capacity INT NOT NULL,
  is_3D CHAR(1)
);


DROP TABLE Seat;

CREATE TABLE Seat (
  seat_Id INT NOT NULL,
  mapping_Id INT NOT NULL,
  seat_Row CHAR(1) NOT NULL,
  seat_Col INT NOT NULL,
  is_Avialble CHAR(1),
  category INT NOT NULL
);



DROP TABLE Booking;


CREATE TABLE Booking (
  booking_Id VARCHAR2(40) NOT NULL,
  user_Id INT NOT NULL,
  theater_Id INT NOT NULL,
  screen_Id INT NOT NULL,
  seat_Ids VARCHAR(100),
  amount FLOAT,
  booking_Date TIMESTAMP,
  show_Time TIMESTAMP
);

DROP TABLE BookingUser;

CREATE TABLE BookingUser (
  user_Id INT NOT NULL,
  user_Name VARCHAR(25) NOT NULL,
  date_Of_Birth Date NOT NULL,
  mobile_No INT NOT NULL,
  amount Decimal,
  email_Id VARCHAR(50) NULL,
  password VARCHAR(50) NULL,
  user_role INT NOT NULL
);




DROP TABLE Show;
#Interval is not considered
CREATE TABLE Show (
  show_Id INT PRIMARY KEY,
  show_name VARCHAR(20) NULL,
  duration INT NOT NULL,
  imdb_Rating Decimal NOT NULL,
  is_Subsidized CHAR(1),
  content_Rating VARCHAR(3) NULL,
  status INT NOT NULL
);


DROP TABLE Theater_Screen_Mapping;

# If a screen closes temporarily in a theater, we just need to change a flag
CREATE TABLE Theater_Screen_Mapping (
  mapping_Id INT PRIMARY KEY,
  theater_Id INT NOT NULL,
  screen_Id INT NOT NULL,
  is_Visible CHAR(1) default 'Y'
);


DROP TABLE  Show_Seat_Mapping;

CREATE TABLE Show_Seat_Mapping (
  id INT NOT NULL,
  show_Id INT NOT NULL,
  mapping_Id INT NOT NULL,
  is_Running CHAR(1),
  seat_Id INT NOT NULL,
  is_Seat_Locked CHAR(1),
  is_Seat_Available CHAR(1),
  start_Time TIMESTAMP NOT NULL,
  end_Time TIMESTAMP NOT NULL,
  is_finished CHAR(1)
);


GRANT create session TO my_schema;
GRANT create table TO my_schema;
GRANT create view TO my_schema;
GRANT create any trigger TO my_schema;
GRANT create any procedure TO my_schema;
GRANT create sequence TO my_schema;
GRANT create synonym TO my_schema;