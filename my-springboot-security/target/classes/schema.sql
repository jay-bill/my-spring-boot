create table if not exists securityTest(
	id bigint,
	username varchar(30) not null,
	password varchar(50) not null,
	role varchar(30)
);