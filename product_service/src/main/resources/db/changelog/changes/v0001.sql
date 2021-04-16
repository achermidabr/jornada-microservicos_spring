-- public.failed_jobs definition

-- Drop table

-- DROP TABLE public.failed_jobs;

CREATE TABLE public.failed_jobs (
	id uuid NOT NULL,
	"connection" varchar(255) NULL,
	"exception" text NULL,
	failed_at timestamp NULL,
	payload text NULL,
	queue varchar(255) NULL,
	CONSTRAINT failed_jobs_pkey PRIMARY KEY (id)
);


-- public.password_resets definition

-- Drop table

-- DROP TABLE public.password_resets;

CREATE TABLE public.password_resets (
	token varchar(255) NOT NULL,
	email varchar(255) NOT NULL,
	failed_at timestamp NULL,
	CONSTRAINT password_resets_pkey PRIMARY KEY (token)
);
CREATE INDEX idx11fv7c049073v29gp7525a0uc ON public.password_resets USING btree (email);


-- public.products definition

-- Drop table

-- DROP TABLE public.products;

CREATE TABLE public.products (
	id uuid NOT NULL,
	description varchar(255) NOT NULL,
	"name" varchar(255) NOT NULL,
	price numeric(19,2) NOT NULL,
	qtd_available int4 NOT NULL,
	qtd_total int4 NOT NULL,
	"version" timestamp NULL,
	CONSTRAINT products_pkey PRIMARY KEY (id)
);


-- public.users definition

-- Drop table

-- DROP TABLE public.users;

CREATE TABLE public.users (
	id int8 NOT NULL,
	email varchar(255) NOT NULL,
	email_verified_at timestamp NULL,
	"name" varchar(255) NOT NULL,
	"password" varchar(255) NOT NULL,
	"token" varchar(255) NOT NULL,
	"version" timestamp NULL,
	CONSTRAINT uk6dotkott2kjsp8vw4d0m25fb7 UNIQUE (email),
	CONSTRAINT users_pkey PRIMARY KEY (id)
);


-- public.action_events definition

-- Drop table

-- DROP TABLE public.action_events;

CREATE TABLE public.action_events (
	id int8 NOT NULL,
	actionable_id varchar(255) NULL,
	actionable_type varchar(255) NULL,
	batch_id bpchar(1) NOT NULL,
	failed_at timestamp NULL,
	fields text NULL,
	model_id varchar(255) NULL,
	model_type varchar(255) NULL,
	"name" varchar(255) NULL,
	status varchar(255) NULL,
	target_id varchar(255) NULL,
	target_type varchar(255) NULL,
	user_id int8 NULL,
	CONSTRAINT action_events_pkey PRIMARY KEY (id),
	CONSTRAINT fkrb8b2ncngkxrkqe1rulnfkper FOREIGN KEY (user_id) REFERENCES users(id)
);
