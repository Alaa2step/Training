select id, name from students where supervisorId=5 order by id; 
update students set name="Ali" where id=1;

select name,id from students where id>10;
SELECT * FROM students;
select count(id)from students where coursesId>30;

select id,name from students where name like 'al%';

select id,name,supervisorId,coursesId from students 
where id in(select id from students where coursesId>30) order by id; 

select id, name, age from teacher where age between 40 and 50;
select count(name) from students where name between "a" and "z";
select id as myID, name as B_names from students where name like'b%';

/* join */

select students.coursesId,students.name,courses.id  from students inner join courses on 
 students.coursesId=courses.id;
 update students set coursesId=150 where id=50;
 select count(students.name) from students right join courses on 
 students.coursesId=courses.id;
/* full join is not supported 
select students.name from students full  join courses on 
 students.coursesId=courses.id; 
 */
 /*
select count(Name) from(
select students.name  as Name from students left join courses on 
students.coursesId=courses.id union  select students.name as Name from students right join courses on 
students.coursesId=courses.id);
*/
/* self join --> get the students have the same supervisor */
select A.name , B.name from students A , students B 
where A.supervisorId=B.supervisorId and A.id <>B.id; 
select count(id),supervisorId from students group by supervisorId;
select count(id),supervisorId from students group by supervisorId having count(id)>6;

select count from students where exists (select name from teacher where age>57); 
