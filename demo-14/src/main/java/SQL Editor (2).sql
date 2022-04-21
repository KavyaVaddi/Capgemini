select * from staff;

select * from outpatient;
alter table outpatient add column date Date;
insert into outpatient values (41001, '23-33, GIL street', 50, 'Tirupathi', '1972-09-10', 'Female', 'Neha Somani', 'Andhra Pradesh');
insert into outpatient values (41002, '1A-33, JB street', 39, 'Vijayawad', '1983-11-06', 'Female', 'Sriya Sandy', 'Andhra Pradesh');
insert into outpatient values (41003, '23B-33, JH street', 12, 'Godavari', '2010-12-23', 'Male', 'Sandhu Riaz', 'Andhra Pradesh');
update outpatient set date = '2022-03-09' where outp_hid = 41001;
update outpatient set date = '2022-02-19' where outp_hid = 41002;
update outpatient set date = '2022-01-11' where outp_hid = 41003;
update outpatient set reg_date = '2022-03-09' where outp_hid = 41001;
update outpatient set reg_date = '2022-02-19' where outp_hid = 41002;
update outpatient set reg_date = '2022-01-11' where outp_hid = 41003;
alter table outpatient drop column date; 


select * from outpatient_bill;
alter table outpatient_bill add column disease varchar(20);
insert into outpatient_bill values (51001, 2000, 'Sharada Sinoli', 41001, 'Neha Somani', '2022-03-09', 'Fever');
insert into outpatient_bill values (51002, 1000, 'Sharada Sinoli', 41002, 'Sriya Sandy', '2022-02-19', 'Cough');
insert into outpatient_bill values (51003, 2500, 'Sharada Sinoli', 41003, 'Sandhu Riaz', '2022-01-11', 'Headache');


select * from inpatient;
update inpatient_bill set discharged_date = '2010-06-05' where bill_no = 31003;
select * from inpatient_bill;
select * from ward;
insert into ward values (22001, '2006-05-10', '2006-05-28', 31001, 'Sridhar', 'causality', 1);
insert into ward values (22002, '2008-05-10', '2008-05-15', 31002, 'Seema', 'generalward', 3);
insert into ward values (22003, '2010-05-10', '2010-05-05', 31003, 'Simon', 'specialward', 2);
delete from inpatient where inphid = 20004;


select * from ward;
drop table ward;
create table ward (wardId int4 not null, wardType varchar(255), wardno int4 not null, totalavailbeds  int not null, primary key (wardId))
insert into ward values (61001, 'General Ward', 20, 200);
insert into ward values (61002, 'Causality', 10, 100);
insert into ward values (61003, 'Special Ward', 16, 54);
insert into ward values (61004, 'Semispecial Room', 10, 20);
insert into ward values (61005, 'deluxroom', 20 , 20);
insert into ward values (61006, 'ccu', 11, 121);
alter table ward drop column ward_type;
update ward set wardtype = 'General Ward' where wardid = 61001;
update ward set wardtype = 'Causality' where wardid = 61002;
update ward set wardtype = 'Special Ward' where wardid = 61003;
update ward set wardtype = 'Semispecial Room' where wardid = 61004;
update ward set wardtype = 'deluxroom' where wardid = 61005;
update ward set wardtype = 'ccu' where wardid = 61006;


