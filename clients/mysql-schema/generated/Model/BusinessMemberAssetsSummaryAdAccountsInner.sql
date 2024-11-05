--
-- Pinterest REST API.
-- Prepared SQL queries for 'BusinessMemberAssetsSummary_ad_accounts_inner' definition.
--


--
-- SELECT template for table `BusinessMemberAssetsSummary_ad_accounts_inner`
--
SELECT `id`, `permissions` FROM `BusinessMemberAssetsSummary_ad_accounts_inner` WHERE 1;

--
-- INSERT template for table `BusinessMemberAssetsSummary_ad_accounts_inner`
--
INSERT INTO `BusinessMemberAssetsSummary_ad_accounts_inner`(`id`, `permissions`) VALUES (?, ?);

--
-- UPDATE template for table `BusinessMemberAssetsSummary_ad_accounts_inner`
--
UPDATE `BusinessMemberAssetsSummary_ad_accounts_inner` SET `id` = ?, `permissions` = ? WHERE 1;

--
-- DELETE template for table `BusinessMemberAssetsSummary_ad_accounts_inner`
--
DELETE FROM `BusinessMemberAssetsSummary_ad_accounts_inner` WHERE 0;

