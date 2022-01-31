insert into users values (1, 'hoge');
insert into users values (2, 'fuga');

insert into units (id, name) values (null, 'unit1');
insert into units (id, name) values (null, 'unit2');

insert into pages (id, no, name, unit_id) values (null, 1, 'page1', 1);
insert into pages (id, no, name, unit_id) values (null, 2, 'page2', 1);

insert into pages (id, no, name, unit_id) values (null, 1, 'page11', 2);
insert into pages (id, no, name, unit_id) values (null, 2, 'page22', 2);
