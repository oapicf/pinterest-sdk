--
-- Pinterest REST API.
-- Prepared SQL queries for 'CancelInviteResult' definition.
--


--
-- SELECT template for table `CancelInviteResult`
--
SELECT `id`, `invite_data`, `is_received_invite`, `user` FROM `CancelInviteResult` WHERE 1;

--
-- INSERT template for table `CancelInviteResult`
--
INSERT INTO `CancelInviteResult`(`id`, `invite_data`, `is_received_invite`, `user`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CancelInviteResult`
--
UPDATE `CancelInviteResult` SET `id` = ?, `invite_data` = ?, `is_received_invite` = ?, `user` = ? WHERE 1;

--
-- DELETE template for table `CancelInviteResult`
--
DELETE FROM `CancelInviteResult` WHERE 0;

