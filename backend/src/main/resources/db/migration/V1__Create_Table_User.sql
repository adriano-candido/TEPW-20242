CREATE TABLE public.tb_user (
	id int8 GENERATED BY DEFAULT AS IDENTITY( INCREMENT BY 1 MINVALUE 1 MAXVALUE 9223372036854775807 START 1 CACHE 1 NO CYCLE) NOT NULL,
	email varchar(255) NULL,
	login varchar(255) NULL,
	"name" varchar(150) NOT NULL,
	"password" varchar(255) NULL,
	CONSTRAINT tb_user_pkey PRIMARY KEY (id),
	CONSTRAINT ukqht682qvopcx5f41dc2rbs5jf UNIQUE (login)
);