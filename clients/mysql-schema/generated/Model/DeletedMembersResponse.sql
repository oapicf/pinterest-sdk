--
-- Pinterest REST API.
-- Prepared SQL queries for 'DeletedMembersResponse' definition.
--


--
-- SELECT template for table `DeletedMembersResponse`
--
SELECT `deleted_members` FROM `DeletedMembersResponse` WHERE 1;

--
-- INSERT template for table `DeletedMembersResponse`
--
INSERT INTO `DeletedMembersResponse`(`deleted_members`) VALUES (?);

--
-- UPDATE template for table `DeletedMembersResponse`
--
UPDATE `DeletedMembersResponse` SET `deleted_members` = ? WHERE 1;

--
-- DELETE template for table `DeletedMembersResponse`
--
DELETE FROM `DeletedMembersResponse` WHERE 0;

