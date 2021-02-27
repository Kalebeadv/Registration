create database Registration;
use registration;

create table individuals( ID_pf int, 
first_name varchar(50),last_name varchar(50),
cpf int(11), date_of_birth date, sex char(1),
email varchar(100), password varchar(200),
primary key(ID_pf));

create table legal_entity(ID_pj int, Cnpj varchar(20),
social_reason varchar(400), fancy_name varchar(100),
contact varchar(100), primary key(ID_pj));

create table phone_address(ID int,ID_pf int, ID_pj int, 
primary key(ID),
foreign key(ID_pf) references individuals(ID_pf),
foreign key(ID_pj) references legal_entity(ID_pj));

create table phone(ID int,phone_one varchar(20), 
phone_two varchar(20), 
foreign key(ID) references phone_address(ID));

create table adrress(ID int, zip_code int(20),
address varchar(300), residence_number int(10),
neignborhood varchar(200), city varchar(100),
state varchar(40), 
foreign key(ID) references phone_address(ID));

