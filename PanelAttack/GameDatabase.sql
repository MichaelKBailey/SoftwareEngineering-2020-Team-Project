drop table if exists GameUsers;

CREATE TABLE GameUsers
        (Username        varchar (25),
        Password          blob);


alter table GameUsers
 add constraint User_Username_pk primary key(Username);

alter table GameUsers
      modify password blob not null;


insert into GameUsers values('jsmith@uca.edu', aes_encrypt('hello123','key'));
insert into GameUsers values('msmith@uca.edu', aes_encrypt('pass123','key'));
insert into GameUsers values('tjones@yahoo.com', aes_encrypt('123456','key'));
insert into GameUsers values('jjones@yahoo.com', aes_encrypt('hello1234','key'));


select *, aes_decrypt(Password, 'key') from GameUsers;