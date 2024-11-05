--
-- Pinterest REST API.
-- Prepared SQL queries for 'UserBusinessRoleBinding' definition.
--


--
-- SELECT template for table `UserBusinessRoleBinding`
--
SELECT `assets_summary`, `business_roles`, `created_by_business`, `created_by_user`, `created_time`, `id`, `is_shared_partner`, `user` FROM `UserBusinessRoleBinding` WHERE 1;

--
-- INSERT template for table `UserBusinessRoleBinding`
--
INSERT INTO `UserBusinessRoleBinding`(`assets_summary`, `business_roles`, `created_by_business`, `created_by_user`, `created_time`, `id`, `is_shared_partner`, `user`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `UserBusinessRoleBinding`
--
UPDATE `UserBusinessRoleBinding` SET `assets_summary` = ?, `business_roles` = ?, `created_by_business` = ?, `created_by_user` = ?, `created_time` = ?, `id` = ?, `is_shared_partner` = ?, `user` = ? WHERE 1;

--
-- DELETE template for table `UserBusinessRoleBinding`
--
DELETE FROM `UserBusinessRoleBinding` WHERE 0;

