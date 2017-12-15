/* load tables and update */
INSERT INTO employeeT VALUES (001, 'Bryant','Kobe','514-1234567','kobe@gmail.com',000003,0000000001);
INSERT INTO employeeT VALUES (002, 'Iverson','Allen','514-2345678','allen@gmail.com',000001,0000000002);
INSERT INTO employeeT VALUES (003, 'Nash','Steve','514-3456789','steve@gmail.com',000002,0000000003);


INSERT INTO clientT VALUES (000001, 'James','Lebron','514-9876543','Lebron@gmail.com','Canada',002,0000000002);
INSERT INTO clientT VALUES (000002, 'Anthony','Camelo','514-8765432','Camelo@gmail.com','USA',003,0000000003);
INSERT INTO clientT VALUES (000003, 'Bosh','Chris','514-7654321','Chris@gmail.com','China',001,0000000001);
INSERT INTO clientT VALUES (000004, 'Fort','TJ','514-6543210','TJ@gmail.com','Bresil',002,0000000004);

INSERT INTO PackageCategory VALUES (1, 'Milk powder,food,toys,carseat,stroller',5);
INSERT INTO PackageCategory VALUES (2, 'clothes, shoes, hats, cases',6);
INSERT INTO PackageCategory VALUES (3, 'electronics, watches, jewellery',15);

INSERT INTO Location VALUES (001, 'Canada Wide', 0);
INSERT INTO Location VALUES (002, 'USA',12);
INSERT INTO Location VALUES (003, 'International', 30);

INSERT INTO ShippingCategory VALUES (1, 'Standard', 0);
INSERT INTO ShippingCategory VALUES (2, 'Express(within 7 days)',5);
INSERT INTO ShippingCategory VALUES (3, 'Next Day', 10);

INSERT INTO employee VALUES (111, 'Smith', 'John', 1, NULL, 
	TO_DATE ('04/15/1960', 'mm/dd/yyyy'), 265000, 35000, 10, 1);
INSERT INTO employee VALUES (246, 'Houston', 'Larry', 2, 111, 
	TO_DATE ('05/19/1967', 'mm/dd/yyyy'), 150000, 10000, 40, 2);
INSERT INTO employee VALUES (123, 'Roberts', 'Sandi', 2, 111, 
	TO_DATE ('12/02/1991', 'mm/dd/yyyy'), 75000, NULL, 10, 2);
INSERT INTO employee VALUES (433, 'McCall', 'Alex', 3, 543, 
	TO_DATE ('05/10/1997', 'mm/dd/yyyy'), 66500, NULL, 20, 4);
INSERT INTO employee VALUES (543, 'Dev', 'Derek', 2, 111, 
	TO_DATE ('03/15/1995', 'mm/dd/yyyy'), 80000, 20000, 20, 1);
INSERT INTO employee VALUES (200, 'Shaw', 'Jinku', 5, 135, 
	TO_DATE ('01/03/00', 'mm/dd/yy'), 24500, 3000, 30, NULL);
INSERT INTO employee VALUES (135, 'Garner', 'Stanley', 2, 111, 
	TO_DATE ('02/29/1996', 'mm/dd/yyyy'), 45000, 5000, 30, 5);
INSERT INTO employee VALUES (222, 'Chen', 'Sunny', 4, 123, 
	TO_DATE ('08/15/1999', 'mm/dd/yyyy'), 35000, NULL, 10, 3);
