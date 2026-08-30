--
-- Pinterest REST API.
-- Prepared SQL queries for 'AuthRespondInvitesBodyItem' definition.
--


--
-- SELECT template for table `AuthRespondInvitesBodyItem`
--
SELECT `action`, `invite_id` FROM `AuthRespondInvitesBodyItem` WHERE 1;

--
-- INSERT template for table `AuthRespondInvitesBodyItem`
--
INSERT INTO `AuthRespondInvitesBodyItem`(`action`, `invite_id`) VALUES (?, ?);

--
-- UPDATE template for table `AuthRespondInvitesBodyItem`
--
UPDATE `AuthRespondInvitesBodyItem` SET `action` = ?, `invite_id` = ? WHERE 1;

--
-- DELETE template for table `AuthRespondInvitesBodyItem`
--
DELETE FROM `AuthRespondInvitesBodyItem` WHERE 0;

