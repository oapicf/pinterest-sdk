--
-- Pinterest REST API.
-- Prepared SQL queries for 'MembersToDeleteBody_members_inner' definition.
--


--
-- SELECT template for table `MembersToDeleteBody_members_inner`
--
SELECT `business_role`, `member_id` FROM `MembersToDeleteBody_members_inner` WHERE 1;

--
-- INSERT template for table `MembersToDeleteBody_members_inner`
--
INSERT INTO `MembersToDeleteBody_members_inner`(`business_role`, `member_id`) VALUES (?, ?);

--
-- UPDATE template for table `MembersToDeleteBody_members_inner`
--
UPDATE `MembersToDeleteBody_members_inner` SET `business_role` = ?, `member_id` = ? WHERE 1;

--
-- DELETE template for table `MembersToDeleteBody_members_inner`
--
DELETE FROM `MembersToDeleteBody_members_inner` WHERE 0;

