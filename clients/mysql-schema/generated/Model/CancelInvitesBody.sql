--
-- Pinterest REST API.
-- Prepared SQL queries for 'CancelInvitesBody' definition.
--


--
-- SELECT template for table `CancelInvitesBody`
--
SELECT `invite_ids` FROM `CancelInvitesBody` WHERE 1;

--
-- INSERT template for table `CancelInvitesBody`
--
INSERT INTO `CancelInvitesBody`(`invite_ids`) VALUES (?);

--
-- UPDATE template for table `CancelInvitesBody`
--
UPDATE `CancelInvitesBody` SET `invite_ids` = ? WHERE 1;

--
-- DELETE template for table `CancelInvitesBody`
--
DELETE FROM `CancelInvitesBody` WHERE 0;

