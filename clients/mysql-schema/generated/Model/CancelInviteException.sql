--
-- Pinterest REST API.
-- Prepared SQL queries for 'CancelInviteException' definition.
--


--
-- SELECT template for table `CancelInviteException`
--
SELECT `invite_id`, `message` FROM `CancelInviteException` WHERE 1;

--
-- INSERT template for table `CancelInviteException`
--
INSERT INTO `CancelInviteException`(`invite_id`, `message`) VALUES (?, ?);

--
-- UPDATE template for table `CancelInviteException`
--
UPDATE `CancelInviteException` SET `invite_id` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `CancelInviteException`
--
DELETE FROM `CancelInviteException` WHERE 0;

