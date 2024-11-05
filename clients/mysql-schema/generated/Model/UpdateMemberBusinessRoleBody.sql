--
-- Pinterest REST API.
-- Prepared SQL queries for 'UpdateMemberBusinessRoleBody' definition.
--


--
-- SELECT template for table `UpdateMemberBusinessRoleBody`
--
SELECT `business_role`, `member_id` FROM `UpdateMemberBusinessRoleBody` WHERE 1;

--
-- INSERT template for table `UpdateMemberBusinessRoleBody`
--
INSERT INTO `UpdateMemberBusinessRoleBody`(`business_role`, `member_id`) VALUES (?, ?);

--
-- UPDATE template for table `UpdateMemberBusinessRoleBody`
--
UPDATE `UpdateMemberBusinessRoleBody` SET `business_role` = ?, `member_id` = ? WHERE 1;

--
-- DELETE template for table `UpdateMemberBusinessRoleBody`
--
DELETE FROM `UpdateMemberBusinessRoleBody` WHERE 0;

