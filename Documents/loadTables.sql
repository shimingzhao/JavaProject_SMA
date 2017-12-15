/* load tables and update */
INSERT INTO employeeT VALUES (001, 'Bryant','Kobe','514-1234567','kobe@gmail.com');
INSERT INTO employeeT VALUES (002, 'Iverson','Allen','514-2345678','allen@gmail.com');
INSERT INTO employeeT VALUES (003, 'Nash','Steve','514-3456789','steve@gmail.com');


INSERT INTO clientT VALUES (000001, 'James','Lebron','514-9876543','Lebron@gmail.com','Canada',002,0000000002);
INSERT INTO clientT VALUES (000002, 'Anthony','Camelo','514-8765432','Camelo@gmail.com','USA',003,0000000003);
INSERT INTO clientT VALUES (000003, 'Bosh','Chris','514-7654321','Chris@gmail.com','China',001,0000000001);
INSERT INTO clientT VALUES (000004, 'Fort','TJ','514-6543210','TJ@gmail.com','Bresil',002,0000000004);

INSERT INTO PackageCategory VALUES (1, 'Milk powder,food,toys,carseat,stroller',5);
INSERT INTO PackageCategory VALUES (2, 'clothes, shoes, hats, cases',6);
INSERT INTO PackageCategory VALUES (3, 'electronics, watches, jewellery',15);

INSERT INTO LocationT VALUES (001, 'Canada Wide', 0);
INSERT INTO LocationT VALUES (002, 'USA',12);
INSERT INTO LocationT VALUES (003, 'International', 30);

INSERT INTO ShippingCategory VALUES (1, 'Standard', 0);
INSERT INTO ShippingCategory VALUES (2, 'Express(within 7 days)',5);
INSERT INTO ShippingCategory VALUES (3, 'Next Day', 10);

INSERT INTO PackageT VALUES (1001100001, 'SC1', 1, 3, 'John', '1234 young street,QC,CA', 001, 1, '438-1234567', 39.50, 000004,001);
INSERT INTO PackageT VALUES (2001100001, 'EC1', 1, 5, 'Wade', '352 king street,ON,CA', 001, 2, '416-2345678',42.00,000001,001);
INSERT INTO PackageT VALUES (3001100001, 'NC1', 1, 2, 'Derrick', '100 queen street,ON,CA', 001, 3, '416-9874563',50.00,000001,001);
INSERT INTO PackageT VALUES (1002100001, 'SU1', 1, 4, 'Williams', '230 queen street,NY,US', 002, 1, '506-9874563',123.20,000002,002);
INSERT INTO PackageT VALUES (1003100001, 'SI1', 1, 3, 'Paul', '300 tianjin street,LN,CH', 003, 1, '507-9874563',234.00,000003,003);
INSERT INTO PackageT VALUES (2001200001, 'EC2', 2, 3, 'Derrick', '36 hill ave,ON', 001, 2, '416-9874563',123.80,000002,003);
INSERT INTO PackageT VALUES (2001300001, 'EC3', 3, 3, 'Derrick', '42 queen street,ON', 001, 2, '416-9874563',345.60,000003,001);


