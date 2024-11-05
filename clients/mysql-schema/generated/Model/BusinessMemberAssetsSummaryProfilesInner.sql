--
-- Pinterest REST API.
-- Prepared SQL queries for 'BusinessMemberAssetsSummary_profiles_inner' definition.
--


--
-- SELECT template for table `BusinessMemberAssetsSummary_profiles_inner`
--
SELECT `id`, `permissions` FROM `BusinessMemberAssetsSummary_profiles_inner` WHERE 1;

--
-- INSERT template for table `BusinessMemberAssetsSummary_profiles_inner`
--
INSERT INTO `BusinessMemberAssetsSummary_profiles_inner`(`id`, `permissions`) VALUES (?, ?);

--
-- UPDATE template for table `BusinessMemberAssetsSummary_profiles_inner`
--
UPDATE `BusinessMemberAssetsSummary_profiles_inner` SET `id` = ?, `permissions` = ? WHERE 1;

--
-- DELETE template for table `BusinessMemberAssetsSummary_profiles_inner`
--
DELETE FROM `BusinessMemberAssetsSummary_profiles_inner` WHERE 0;

