--
-- Pinterest REST API.
-- Prepared SQL queries for 'AuthRespondInvitesBody' definition.
--


--
-- SELECT template for table `AuthRespondInvitesBody`
--
SELECT `invites` FROM `AuthRespondInvitesBody` WHERE 1;

--
-- INSERT template for table `AuthRespondInvitesBody`
--
INSERT INTO `AuthRespondInvitesBody`(`invites`) VALUES (?);

--
-- UPDATE template for table `AuthRespondInvitesBody`
--
UPDATE `AuthRespondInvitesBody` SET `invites` = ? WHERE 1;

--
-- DELETE template for table `AuthRespondInvitesBody`
--
DELETE FROM `AuthRespondInvitesBody` WHERE 0;

