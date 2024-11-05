--
-- Pinterest REST API.
-- Prepared SQL queries for 'BaseInviteDataResponse_invite_data' definition.
--


--
-- SELECT template for table `BaseInviteDataResponse_invite_data`
--
SELECT `invite_expiration`, `invite_status`, `invite_type`, `last_updated_time`, `sent_at` FROM `BaseInviteDataResponse_invite_data` WHERE 1;

--
-- INSERT template for table `BaseInviteDataResponse_invite_data`
--
INSERT INTO `BaseInviteDataResponse_invite_data`(`invite_expiration`, `invite_status`, `invite_type`, `last_updated_time`, `sent_at`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `BaseInviteDataResponse_invite_data`
--
UPDATE `BaseInviteDataResponse_invite_data` SET `invite_expiration` = ?, `invite_status` = ?, `invite_type` = ?, `last_updated_time` = ?, `sent_at` = ? WHERE 1;

--
-- DELETE template for table `BaseInviteDataResponse_invite_data`
--
DELETE FROM `BaseInviteDataResponse_invite_data` WHERE 0;

