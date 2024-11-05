--
-- Pinterest REST API.
-- Prepared SQL queries for 'CreateMembershipOrPartnershipInvitesBody' definition.
--


--
-- SELECT template for table `CreateMembershipOrPartnershipInvitesBody`
--
SELECT `business_role`, `invite_type`, `members`, `partners` FROM `CreateMembershipOrPartnershipInvitesBody` WHERE 1;

--
-- INSERT template for table `CreateMembershipOrPartnershipInvitesBody`
--
INSERT INTO `CreateMembershipOrPartnershipInvitesBody`(`business_role`, `invite_type`, `members`, `partners`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CreateMembershipOrPartnershipInvitesBody`
--
UPDATE `CreateMembershipOrPartnershipInvitesBody` SET `business_role` = ?, `invite_type` = ?, `members` = ?, `partners` = ? WHERE 1;

--
-- DELETE template for table `CreateMembershipOrPartnershipInvitesBody`
--
DELETE FROM `CreateMembershipOrPartnershipInvitesBody` WHERE 0;

