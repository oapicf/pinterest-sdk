--
-- Pinterest REST API.
-- Prepared SQL queries for 'DeleteBusinessMembershipMember' definition.
--


--
-- SELECT template for table `DeleteBusinessMembershipMember`
--
SELECT `business_role`, `member_id` FROM `DeleteBusinessMembershipMember` WHERE 1;

--
-- INSERT template for table `DeleteBusinessMembershipMember`
--
INSERT INTO `DeleteBusinessMembershipMember`(`business_role`, `member_id`) VALUES (?, ?);

--
-- UPDATE template for table `DeleteBusinessMembershipMember`
--
UPDATE `DeleteBusinessMembershipMember` SET `business_role` = ?, `member_id` = ? WHERE 1;

--
-- DELETE template for table `DeleteBusinessMembershipMember`
--
DELETE FROM `DeleteBusinessMembershipMember` WHERE 0;

