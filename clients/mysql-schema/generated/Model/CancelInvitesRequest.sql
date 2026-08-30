--
-- Pinterest REST API.
-- Prepared SQL queries for 'CancelInvitesRequest' definition.
--


--
-- SELECT template for table `CancelInvitesRequest`
--
SELECT `invite_ids` FROM `CancelInvitesRequest` WHERE 1;

--
-- INSERT template for table `CancelInvitesRequest`
--
INSERT INTO `CancelInvitesRequest`(`invite_ids`) VALUES (?);

--
-- UPDATE template for table `CancelInvitesRequest`
--
UPDATE `CancelInvitesRequest` SET `invite_ids` = ? WHERE 1;

--
-- DELETE template for table `CancelInvitesRequest`
--
DELETE FROM `CancelInvitesRequest` WHERE 0;

