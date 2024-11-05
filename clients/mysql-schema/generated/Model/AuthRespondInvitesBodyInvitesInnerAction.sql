--
-- Pinterest REST API.
-- Prepared SQL queries for 'AuthRespondInvitesBody_invites_inner_action' definition.
--


--
-- SELECT template for table `AuthRespondInvitesBody_invites_inner_action`
--
SELECT `accept_invite`, `asset_id_to_permissions` FROM `AuthRespondInvitesBody_invites_inner_action` WHERE 1;

--
-- INSERT template for table `AuthRespondInvitesBody_invites_inner_action`
--
INSERT INTO `AuthRespondInvitesBody_invites_inner_action`(`accept_invite`, `asset_id_to_permissions`) VALUES (?, ?);

--
-- UPDATE template for table `AuthRespondInvitesBody_invites_inner_action`
--
UPDATE `AuthRespondInvitesBody_invites_inner_action` SET `accept_invite` = ?, `asset_id_to_permissions` = ? WHERE 1;

--
-- DELETE template for table `AuthRespondInvitesBody_invites_inner_action`
--
DELETE FROM `AuthRespondInvitesBody_invites_inner_action` WHERE 0;

