--
-- Pinterest REST API.
-- Prepared SQL queries for 'BusinessMembershipMember' definition.
--


--
-- SELECT template for table `BusinessMembershipMember`
--
SELECT `business_role`, `member_id` FROM `BusinessMembershipMember` WHERE 1;

--
-- INSERT template for table `BusinessMembershipMember`
--
INSERT INTO `BusinessMembershipMember`(`business_role`, `member_id`) VALUES (?, ?);

--
-- UPDATE template for table `BusinessMembershipMember`
--
UPDATE `BusinessMembershipMember` SET `business_role` = ?, `member_id` = ? WHERE 1;

--
-- DELETE template for table `BusinessMembershipMember`
--
DELETE FROM `BusinessMembershipMember` WHERE 0;

