Delimiter //
Create procedure GetEmpInOffice
(
   officename varchar(50) ,
   out num int

)
BEGIN
    select count(*)
	into num
    from employees
    where employees.officecode=(select officecode from offices where city=officename) ;

END //
