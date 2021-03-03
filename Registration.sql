create database Registration;
use registration;

create table individuals( ID_pf int, 
first_name varchar(50),last_name varchar(50),
cpf int(12), date_of_birth date, sex char(1),
email varchar(100), password varchar(200),
primary key(ID_pf));

create table legal_entity(ID_pj int, Cnpj varchar(20),
social_reason varchar(400), fancy_name varchar(100),
contact varchar(100), primary key(ID_pj));

create table phones(FK_PHONE_ID_PK int, FK_PHONE_ID_PJ int,phone_ varchar(20),  
foreign key(FK_PHONE_ID_PK) references individuals(ID_pf),
foreign key(FK_PHONE_ID_PJ) references legal_entity(ID_pj));

create table address(FK_ADDRESS_ID_PK int, FK_ADDRESS_ID_PJ int, zip_code int(20),
address varchar(300), residence_number int(10),
neignborhood varchar(200), city varchar(100),
state varchar(40), 
foreign key(FK_ADDRESS_ID_PK) references individuals(ID_pf),
foreign key(FK_ADDRESS_ID_PJ) references legal_entity(ID_pj));

