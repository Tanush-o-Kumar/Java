Create 2 tables in MySQL database:

Restaurant : Columns: Id (Primary Key), Name, Address
MenuItem : Columns: Id (Primary Key), Name, Price, ResId (Foreign Key to Restaurant table)
Write a Java Program using JDBC to perform all CRUD operations on the tables as follows:

Insert 10 records in each table.
Select all records from MenuItem table where price <=100
Select all records from MenuItem table which are available in Restaurant named "Cafe Java".
Update all records from MenuItem table where price <= 100 to price = 200
Delete all records from MenuItem table where name starts with P.
Print the results of each operation using ResultSet object in tabular format.
