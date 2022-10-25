INSERT INTO classicmodels.employees
(employeeNumber,lastName,firstName,extension,email,officeCode,reportsTo,jobTitle)
VALUES
(1801,'Wang','Bob','0x12345','bob@test.com','2',1056,'Sales Rep'),
(1802,'Chou','Cindy','0x56789','cindy@test.com','3',1056,'Sales Rep'),
(1803,'Wu','Danny','0x13579','danny@test.com','4',1056,'Sales Rep');


select * 
from classicmodels.employees as emps
inner join classicmodels.customers as cst
on emps.employeeNumber=cst.salesRepEmployeeNumber
where emps.employeeNumber=1165

select *
from classicmodels.offices as ofc
inner join classicmodels.employees as emps
on ofc.officeCode=emps.officeCode


select * 
from classicmodels.customers as c
inner join classicmodels.orders as o
on c.customerNumber=o.customerNumber
inner join classicmodels.orderdetails as d
on o.orderNumber=d.orderNumber


set autocommit=0;

UPDATE classicmodels.employees
SET
extension = '0x2468',
officeCode = '5',
reportsTo = 1076,
jobTitle = 'Marketing'
WHERE employeeNumber = 1803;

rollback;
commit;
set autocommit=1;