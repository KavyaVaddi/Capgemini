select * from staff;
create table staff (s_hid int4 not null, doj timestamp, s_addr varchar(255), s_age int4 not null, s_email_id varchar(255), s_gender varchar(255), s_name varchar(255), s_phone varchar(255), s_role varchar(255), salary float8 not null, primary key (s_hid))
insert into staff values (1001, '2002-10-01', '1-12,Gandhi Street,Vijayawada,AndhraPradesh', 52, 'anandgowtham@gmail.com', 'Male', 'Anand Gowtham', '9012347892', 'Doctor, Cardiologist', 1000000);
insert into staff values (1002, '2010-05-11', '11-22,Raja Street,Vijayawada,AndhraPradesh', 35, 'rekhaSwarupa@gmail.com', 'Female', 'Rekha Swarupa', '9912009987', 'Doctor, Neurologist', 200000);
insert into staff values (1003, '2003-02-19', '12-12, Street,Vijayawada,AndhraPradesh', 49, 'shreyasri@gmail.com', 'Female', 'Shreya Sri', '9667894440', 'Nurse', 30000);
insert into staff values (1004, '2004-08-22', '01-01,Teresa Street,Vijayawada,AndhraPradesh',48, 'maheshsam@gmail.com', 'Male', 'Mahesh Sam', '9000043288', 'Doctor, Dentist', 150000);
insert into staff values (1005, '2005-11-21', '01-22,Gandhi Street,Vijayawada,AndhraPradesh', 47, 'jhonyjhony@gmail.com', 'Male', 'Jhony Saga', '9330900911', 'Doctor, Dermatologist', 100000);
insert into staff values (1006, '2006-12-06', '1A-89,Teresa Street,Vijayawada,AndhraPradesh', 46, 'reshmamilani@gmail.com', 'Female', 'Reshma Milani', '9991110008', 'Nurse', 30000);
insert into staff values (1007, '2007-09-01', '3C-25,Raja Street,Vijayawada,AndhraPradesh', 45, 'kiarahydari@gmail.com', 'Female', 'Kiara Hydari', '9883455672', 'Doctor, psychiatrist', 100000);
insert into staff values (1008, '2008-06-15', '80-11,Raja Street,Vijayawada,AndhraPradesh', 44, 'saimeghan@gmail.com', 'Male', 'Sai Meghan', '9908768900', 'Doctor, Surgeon', 3000000);
insert into staff values (1009, '2009-01-20', '1A-20,Gandhi Street,Vijayawada,AndhraPradesh', 43, 'jashriaz@gmail.com', 'Male', 'Jash Riaz', '9119097899', 'Doctor, Neurologist', 200000);
insert into staff values (1010, '2010-09-11', '2H-32,Teresa Street,Vijayawada,AndhraPradesh', 42, 'sonakshisandy@gmail.com', 'Female', 'Sonakshi Sandy', '9111224567', 'Nurse', 30000);
insert into staff values (1011, '2001-03-10', '2H-52,Gandhi Street,Vijayawada,AndhraPradesh', 53, 'sharadasinoli@gmail.com', 'Female', 'Sharada Sinoli', '9011233467', 'Doctor,Internal Medicine pecialist', 100000);
update staff set salary = 30000 where s_hid = 1006;
update staff set salary = 30000 where s_hid = 1010;
insert into staff values (1012, '1998-03-10', '12-52,Raja Street,Vijayawada,AndhraPradesh', 58, 'rajeshsidh@gmail.com', 'Male', 'Rajesh Sidh', '9889666432', 'Admin', 100000);
insert into staff values (1013, '2005-05-05', '9G-92,Teresa Street,Vijayawada,AndhraPradesh', 48, 'harshithasindhu@gmail.com', 'Female', 'Harshitha Sindhu', '9089666102', 'Admin', 800000);
