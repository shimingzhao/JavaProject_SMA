/* create tables */
DROP TABLE PackageT CASCADE CONSTRAINTS;
DROP TABLE employeeT CASCADE CONSTRAINTS;
DROP TABLE clientT CASCADE CONSTRAINTS;

DROP TABLE PackageCategory CASCADE CONSTRAINTS;
DROP TABLE ShippingCategory CASCADE CONSTRAINTS;
DROP TABLE Location CASCADE CONSTRAINTS;


CREATE TABLE employeeT 
	(EmployeeId NUMBER (3),
     Lname		VARCHAR2 (15) CONSTRAINT employeeT_Lname_nn NOT NULL,
	 Fname 		VARCHAR2 (15) CONSTRAINT employeeT_Fname_nn NOT NULL, 
	 Telephone	VARCHAR2 (15),
	 Email		VARCHAR2 (50),
	CONSTRAINT employeeT_employeeid_pk 
		PRIMARY KEY (EmployeeId));
		
CREATE TABLE clientT
	(ClientId   NUMBER (3),
	 Lname		VARCHAR2 (15) CONSTRAINT clientT_Lname_nn NOT NULL,
	 Fname 		VARCHAR2 (15) CONSTRAINT clientT_Fname_nn NOT NULL, 
	 Telephone	VARCHAR2 (15),
	 Email		VARCHAR2 (30),
	 Address	VARCHAR2 (30),
	 EmployeeId NUMBER (3),
	 PackageId	NUMBER(10),
	CONSTRAINT clientT_ClientId_pk PRIMARY KEY (ClientId));  
		
CREATE TABLE PackageCategory
	(PackageCategoryId	NUMBER (3),
	 PackageDesc		VARCHAR2 (50),
	 PackagePrice		NUMBER (8),
	CONSTRAINT position_PackageCategoryId_pk PRIMARY KEY (PackageCategoryId));

CREATE TABLE ShippingCategory
	(ShippingCategoryId	NUMBER (3),
	 ShippingDesc		VARCHAR2 (30),
	 ShippingPrice		NUMBER (8),
	CONSTRAINT position_ShippingCategoryId_pk PRIMARY KEY (ShippingCategoryId));
	
CREATE TABLE LocationT
	(LocationId	NUMBER (3),
	 LocationDesc		VARCHAR2 (30),
	 LocationPrice		NUMBER (8),
	CONSTRAINT position_LocationId_pk PRIMARY KEY (LocationId));

CREATE TABLE PackageT 
	(PackageId NUMBER (10),
	 Name VARCHAR2 (15) CONSTRAINT PackageT_Name_nn NOT NULL,
	 PackageCategoryId NUMBER (3),
	 Weight NUMBER (8),
	 ReceiverName VARCHAR2 (15),
	 Destination VARCHAR2 (30),
	 LocationId NUMBER (3),
	 ShippingCategoryId NUMBER (3),
	 Telephone VARCHAR2 (15),
	 TotalCharge NUMBER (7),
	 ClientId NUMBER(6),
	 EmployeeId NUMBER (3),
	CONSTRAINT PackageT_PackageId_pk PRIMARY KEY (PackageId),
	CONSTRAINT PackageT_PackageCategoryId_fk FOREIGN KEY (PackageCategoryId)
		REFERENCES PackageCategory (PackageCategoryId),
	CONSTRAINT PackageT_LocationId_fk FOREIGN KEY (LocationId)
		REFERENCES LocationT (LocationId),
	CONSTRAINT PackageT_ShippingCategoryId_fk FOREIGN KEY (ShippingCategoryId)
		REFERENCES ShippingCategory (ShippingCategoryId),
	CONSTRAINT PackageT_ClientId_fk FOREIGN KEY (ClientId)
		REFERENCES ClientT (ClientId),
	CONSTRAINT PackageT_EmployeeId_fk FOREIGN KEY (EmployeeId)
		REFERENCES EmployeeT (EmployeeId));
			
desc employeeT
desc clientT
desc PackageCategory
desc ShippingCategory
desc LocationT
desc PackageT