--
-- Pinterest REST API.
-- Prepared SQL queries for 'InviteBusinessRoleBinding' definition.
--


--
-- SELECT template for table `InviteBusinessRoleBinding`
--
SELECT `created_by_business_id`, `created_by_user_id`, `user`, `id`, `invite_data`, `is_received_invite` FROM `InviteBusinessRoleBinding` WHERE 1;

--
-- INSERT template for table `InviteBusinessRoleBinding`
--
INSERT INTO `InviteBusinessRoleBinding`(`created_by_business_id`, `created_by_user_id`, `user`, `id`, `invite_data`, `is_received_invite`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `InviteBusinessRoleBinding`
--
UPDATE `InviteBusinessRoleBinding` SET `created_by_business_id` = ?, `created_by_user_id` = ?, `user` = ?, `id` = ?, `invite_data` = ?, `is_received_invite` = ? WHERE 1;

--
-- DELETE template for table `InviteBusinessRoleBinding`
--
DELETE FROM `InviteBusinessRoleBinding` WHERE 0;

