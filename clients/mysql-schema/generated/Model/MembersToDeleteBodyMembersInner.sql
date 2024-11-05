--
-- Pinterest REST API.
-- Prepared SQL queries for 'MembersToDeleteBody_members_inner' definition.
--


--
-- SELECT template for table `MembersToDeleteBody_members_inner`
--
SELECT `member_id`, `business_role` FROM `MembersToDeleteBody_members_inner` WHERE 1;

--
-- INSERT template for table `MembersToDeleteBody_members_inner`
--
INSERT INTO `MembersToDeleteBody_members_inner`(`member_id`, `business_role`) VALUES (?, ?);

--
-- UPDATE template for table `MembersToDeleteBody_members_inner`
--
UPDATE `MembersToDeleteBody_members_inner` SET `member_id` = ?, `business_role` = ? WHERE 1;

--
-- DELETE template for table `MembersToDeleteBody_members_inner`
--
DELETE FROM `MembersToDeleteBody_members_inner` WHERE 0;

