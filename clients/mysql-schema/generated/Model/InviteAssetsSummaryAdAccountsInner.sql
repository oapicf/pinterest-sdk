--
-- Pinterest REST API.
-- Prepared SQL queries for 'InviteAssetsSummary_ad_accounts_inner' definition.
--


--
-- SELECT template for table `InviteAssetsSummary_ad_accounts_inner`
--
SELECT `id`, `permissions` FROM `InviteAssetsSummary_ad_accounts_inner` WHERE 1;

--
-- INSERT template for table `InviteAssetsSummary_ad_accounts_inner`
--
INSERT INTO `InviteAssetsSummary_ad_accounts_inner`(`id`, `permissions`) VALUES (?, ?);

--
-- UPDATE template for table `InviteAssetsSummary_ad_accounts_inner`
--
UPDATE `InviteAssetsSummary_ad_accounts_inner` SET `id` = ?, `permissions` = ? WHERE 1;

--
-- DELETE template for table `InviteAssetsSummary_ad_accounts_inner`
--
DELETE FROM `InviteAssetsSummary_ad_accounts_inner` WHERE 0;

