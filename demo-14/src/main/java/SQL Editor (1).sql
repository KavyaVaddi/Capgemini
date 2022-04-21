select * from inpatient;
insert into inpatient values (22001, '21-12, STM street', '2006-05-10', 32, 'Godavari', '1990-01-01', 'Male', 'Sridhar', 'Andhra Pradesh', 61001, 'General');
insert into inpatient values (22002, '1a-12, JK street', '2008-05-10', 52, 'Nellore', '1970-05-21', 'Female', 'Seema', 'Andhra Pradesh', 61002, 'Causality');
insert into inpatient values (22003, '11-90, LM street', '2010-05-10', 29, 'Chennai', '1993-06-11', 'Male', 'Simon', 'Tamil Nadu', 61003, 'Special Ward');
alter table inpatient add column wardType varchar(20);
alter table inpatient add column wardNo numeric(10);
update inpatient set wardtype = 'General Ward' where inphid = 22001;
update inpatient set wardid = 61002 where inphid = 22002;
update inpatient set wardid = 61003 where inphid = 22003;
update inpatient set inpgender = 'Female' where inphid = 22004;
alter table inpatient add column wardid numeric(10);
drop table inpatient;


delete from inpatient_bill where bill_no = 31005;
select * from inpatient where inphid = 22004;


select * from staff;

alter table inpatient_bill drop column date;
alter table inpatient_bill drop column lab;
alter table inpatient_bill drop column rent;
select * from inpatient_bill;
delete from inpatient_bill where bill_no = 31005;
update inpatient_bill set amount = 22000 where bill_no = 31004;
insert into inpatient_bill values (31001, '2006-05-10', 150000, '2006-05-28', 'Sai Meghan', 22001, 'Sridhar');
insert into inpatient_bill values (31002, '2008-05-10', 50000, '2008-05-15', 'Kiara Hydari', 22002, 'Seema');
insert into inpatient_bill values (31003, '2010-05-10', 200000, '2006-06-05', 'Rekha Swarupa', 22003, 'Simon');
