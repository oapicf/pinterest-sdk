--
-- Pinterest REST API.
-- Prepared SQL queries for 'InviteBusinessRoleBinding' definition.
--


--
-- SELECT template for table `InviteBusinessRoleBinding`
--
SELECT `id`, `invite_data`, `is_received_invite`, `user`, `created_by_business_id`, `created_by_user_id` FROM `InviteBusinessRoleBinding` WHERE 1;

--
-- INSERT template for table `InviteBusinessRoleBinding`
--
INSERT INTO `InviteBusinessRoleBinding`(`id`, `invite_data`, `is_received_invite`, `user`, `created_by_business_id`, `created_by_user_id`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `InviteBusinessRoleBinding`
--
UPDATE `InviteBusinessRoleBinding` SET `id` = ?, `invite_data` = ?, `is_received_invite` = ?, `user` = ?, `created_by_business_id` = ?, `created_by_user_id` = ? WHERE 1;

--
-- DELETE template for table `InviteBusinessRoleBinding`
--
DELETE FROM `InviteBusinessRoleBinding` WHERE 0;

