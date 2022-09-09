create database doorstep2admin_login;
use doorstep2;

CREATE TABLE `Admin_Login`(
    `username` VARCHAR(255) NOT NULL,
    `password` VARCHAR(255) NOT NULL
);
ALTER TABLE
    `Admin_Login` ADD PRIMARY KEY `admin_login_username_primary`(`username`);
    
desc Admin_Login;
create table address(
id int primary key auto_increment,
city varchar(20) not null,
landmark varchar(50),
pincode varchar(50),
state varchar(20)
);

desc address;

create table customers(
id int primary key auto_increment,
first_name varchar(15) not null,
last_name varchar(15) not null,
emailId varchar(30) not null unique,
password varchar(20) not null,
mobile int not null,
address_id int,
foreign key(address_id) references address(id)
);

desc customers;

CREATE TABLE `profession`(
    id INT primary key auto_increment,
    prof_name VARCHAR(30) NOT NULL,
    basic_charges DOUBLE NOT NULL
);

desc profession;

create table service_provider(
id int primary key auto_increment,
first_name varchar(20) not null,
last_name varchar(20) not null,
emailId varchar(30) not null unique,
password varchar(20) not null,
license int not null,
serAddrs INT NOT NULL,
foreign key(serAddrs) references address(id),
prof_id INT NOT NULL,
foreign key(prof_id) references profession(id)
);

CREATE TABLE orders(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT primary key,
    amount DOUBLE NOT NULL,
    orderDate date,
    service_name VARCHAR(30) NOT NULL,
    service_id INT NOT NULL,
    cust_id INT NOT NULL,
    FOREIGN KEY(cust_id) REFERENCES customers(id),
    FOREIGN KEY(`service_id`) REFERENCES `service_provider`(`id`)
);

CREATE TABLE `feedback`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT primary key,
    `cust_name` VARCHAR(30) NOT NULL,
    `feedback` VARCHAR(500) NOT NULL,
    `rating` VARCHAR(255) NOT NULL,
    `service_id` INT NOT NULL,
    FOREIGN KEY(`service_id`) REFERENCES `service_provider`(`id`)
);

