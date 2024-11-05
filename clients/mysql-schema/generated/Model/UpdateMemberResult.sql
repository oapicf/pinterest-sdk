--
-- Pinterest REST API.
-- Prepared SQL queries for 'UpdateMemberResult' definition.
--


--
-- SELECT template for table `UpdateMemberResult`
--
SELECT `business_role`, `member_id` FROM `UpdateMemberResult` WHERE 1;

--
-- INSERT template for table `UpdateMemberResult`
--
INSERT INTO `UpdateMemberResult`(`business_role`, `member_id`) VALUES (?, ?);

--
-- UPDATE template for table `UpdateMemberResult`
--
UPDATE `UpdateMemberResult` SET `business_role` = ?, `member_id` = ? WHERE 1;

--
-- DELETE template for table `UpdateMemberResult`
--
DELETE FROM `UpdateMemberResult` WHERE 0;

