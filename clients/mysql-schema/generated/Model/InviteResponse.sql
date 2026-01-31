--
-- Pinterest REST API.
-- Prepared SQL queries for 'InviteResponse' definition.
--


--
-- SELECT template for table `InviteResponse`
--
SELECT `id`, `invite_data`, `is_received_invite`, `user`, `assets_summary`, `business_roles`, `created_by_business`, `created_by_user`, `created_time` FROM `InviteResponse` WHERE 1;

--
-- INSERT template for table `InviteResponse`
--
INSERT INTO `InviteResponse`(`id`, `invite_data`, `is_received_invite`, `user`, `assets_summary`, `business_roles`, `created_by_business`, `created_by_user`, `created_time`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `InviteResponse`
--
UPDATE `InviteResponse` SET `id` = ?, `invite_data` = ?, `is_received_invite` = ?, `user` = ?, `assets_summary` = ?, `business_roles` = ?, `created_by_business` = ?, `created_by_user` = ?, `created_time` = ? WHERE 1;

--
-- DELETE template for table `InviteResponse`
--
DELETE FROM `InviteResponse` WHERE 0;

