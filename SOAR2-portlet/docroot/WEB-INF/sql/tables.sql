create table SOAR_REGISTRATION (
	ID LONG not null primary key,
	student_id VARCHAR(75) null
);

create table SOAR_REGISTRATION_LIFERAY (
	ID LONG not null primary key,
	student_id VARCHAR(75) null,
	companyId LONG,
	groupId LONG,
	Name VARCHAR(75) null
);

create table SOAR_Registration (
	ID LONG not null primary key,
	student_id VARCHAR(75) null
);