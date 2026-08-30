--
-- Pinterest REST API.
-- Prepared SQL queries for 'InviteBusinessRoleBinding' definition.
--


--
-- SELECT template for table `InviteBusinessRoleBinding`
--
SELECT `created_by_business_id`, `created_by_user_id`, `id`, `invite_data`, `is_received_invite`, `user` FROM `InviteBusinessRoleBinding` WHERE 1;

--
-- INSERT template for table `InviteBusinessRoleBinding`
--
INSERT INTO `InviteBusinessRoleBinding`(`created_by_business_id`, `created_by_user_id`, `id`, `invite_data`, `is_received_invite`, `user`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `InviteBusinessRoleBinding`
--
UPDATE `InviteBusinessRoleBinding` SET `created_by_business_id` = ?, `created_by_user_id` = ?, `id` = ?, `invite_data` = ?, `is_received_invite` = ?, `user` = ? WHERE 1;

--
-- DELETE template for table `InviteBusinessRoleBinding`
--
DELETE FROM `InviteBusinessRoleBinding` WHERE 0;

