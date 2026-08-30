--
-- Pinterest REST API.
-- Prepared SQL queries for 'InviteDataResponse' definition.
--


--
-- SELECT template for table `InviteDataResponse`
--
SELECT `invite_expiration`, `invite_status`, `invite_type`, `last_updated_time`, `sent_at` FROM `InviteDataResponse` WHERE 1;

--
-- INSERT template for table `InviteDataResponse`
--
INSERT INTO `InviteDataResponse`(`invite_expiration`, `invite_status`, `invite_type`, `last_updated_time`, `sent_at`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `InviteDataResponse`
--
UPDATE `InviteDataResponse` SET `invite_expiration` = ?, `invite_status` = ?, `invite_type` = ?, `last_updated_time` = ?, `sent_at` = ? WHERE 1;

--
-- DELETE template for table `InviteDataResponse`
--
DELETE FROM `InviteDataResponse` WHERE 0;

