--
-- Pinterest REST API.
-- Prepared SQL queries for 'AuthRespondInviteAction' definition.
--


--
-- SELECT template for table `AuthRespondInviteAction`
--
SELECT `accept_invite`, `asset_id_to_permissions` FROM `AuthRespondInviteAction` WHERE 1;

--
-- INSERT template for table `AuthRespondInviteAction`
--
INSERT INTO `AuthRespondInviteAction`(`accept_invite`, `asset_id_to_permissions`) VALUES (?, ?);

--
-- UPDATE template for table `AuthRespondInviteAction`
--
UPDATE `AuthRespondInviteAction` SET `accept_invite` = ?, `asset_id_to_permissions` = ? WHERE 1;

--
-- DELETE template for table `AuthRespondInviteAction`
--
DELETE FROM `AuthRespondInviteAction` WHERE 0;

