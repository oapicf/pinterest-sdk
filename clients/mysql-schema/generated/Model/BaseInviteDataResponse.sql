--
-- Pinterest REST API.
-- Prepared SQL queries for 'BaseInviteDataResponse' definition.
--


--
-- SELECT template for table `BaseInviteDataResponse`
--
SELECT `id`, `invite_data`, `is_received_invite`, `user` FROM `BaseInviteDataResponse` WHERE 1;

--
-- INSERT template for table `BaseInviteDataResponse`
--
INSERT INTO `BaseInviteDataResponse`(`id`, `invite_data`, `is_received_invite`, `user`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `BaseInviteDataResponse`
--
UPDATE `BaseInviteDataResponse` SET `id` = ?, `invite_data` = ?, `is_received_invite` = ?, `user` = ? WHERE 1;

--
-- DELETE template for table `BaseInviteDataResponse`
--
DELETE FROM `BaseInviteDataResponse` WHERE 0;

