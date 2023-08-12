create table accounts (
	id              uuid not null primary key,
	name            varchar (255) not null,
	email           varchar (255) not null,
	created_at      timestamp not null default now(),
    updated_at      timestamp not null default now()
);