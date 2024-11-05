--
-- Pinterest REST API.
-- Prepared SQL queries for 'AuthRespondInvitesBody_invites_inner' definition.
--


--
-- SELECT template for table `AuthRespondInvitesBody_invites_inner`
--
SELECT `action`, `invite_id` FROM `AuthRespondInvitesBody_invites_inner` WHERE 1;

--
-- INSERT template for table `AuthRespondInvitesBody_invites_inner`
--
INSERT INTO `AuthRespondInvitesBody_invites_inner`(`action`, `invite_id`) VALUES (?, ?);

--
-- UPDATE template for table `AuthRespondInvitesBody_invites_inner`
--
UPDATE `AuthRespondInvitesBody_invites_inner` SET `action` = ?, `invite_id` = ? WHERE 1;

--
-- DELETE template for table `AuthRespondInvitesBody_invites_inner`
--
DELETE FROM `AuthRespondInvitesBody_invites_inner` WHERE 0;

