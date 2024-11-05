--
-- Pinterest REST API.
-- Prepared SQL queries for 'InviteAssetsSummary' definition.
--


--
-- SELECT template for table `InviteAssetsSummary`
--
SELECT `ad_accounts`, `profiles` FROM `InviteAssetsSummary` WHERE 1;

--
-- INSERT template for table `InviteAssetsSummary`
--
INSERT INTO `InviteAssetsSummary`(`ad_accounts`, `profiles`) VALUES (?, ?);

--
-- UPDATE template for table `InviteAssetsSummary`
--
UPDATE `InviteAssetsSummary` SET `ad_accounts` = ?, `profiles` = ? WHERE 1;

--
-- DELETE template for table `InviteAssetsSummary`
--
DELETE FROM `InviteAssetsSummary` WHERE 0;

