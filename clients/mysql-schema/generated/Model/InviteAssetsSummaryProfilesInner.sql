--
-- Pinterest REST API.
-- Prepared SQL queries for 'InviteAssetsSummary_profiles_inner' definition.
--


--
-- SELECT template for table `InviteAssetsSummary_profiles_inner`
--
SELECT `id`, `permissions` FROM `InviteAssetsSummary_profiles_inner` WHERE 1;

--
-- INSERT template for table `InviteAssetsSummary_profiles_inner`
--
INSERT INTO `InviteAssetsSummary_profiles_inner`(`id`, `permissions`) VALUES (?, ?);

--
-- UPDATE template for table `InviteAssetsSummary_profiles_inner`
--
UPDATE `InviteAssetsSummary_profiles_inner` SET `id` = ?, `permissions` = ? WHERE 1;

--
-- DELETE template for table `InviteAssetsSummary_profiles_inner`
--
DELETE FROM `InviteAssetsSummary_profiles_inner` WHERE 0;

