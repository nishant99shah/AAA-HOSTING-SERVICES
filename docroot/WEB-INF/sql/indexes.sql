create index IX_AF469830 on DM_Customer (groupId);
create index IX_368476BA on DM_Customer (uuid_);
create index IX_A5C1F52E on DM_Customer (uuid_, companyId);
create unique index IX_D801EF30 on DM_Customer (uuid_, groupId);

create index IX_73DCA45D on DM_Dservice (groupId);
create index IX_EB99AA27 on DM_Dservice (uuid_);
create index IX_C224BA1 on DM_Dservice (uuid_, companyId);
create unique index IX_AF5B4663 on DM_Dservice (uuid_, groupId);