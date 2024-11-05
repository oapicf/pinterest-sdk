--
-- Pinterest REST API.
-- Prepared SQL queries for 'BusinessMemberAssetsSummary' definition.
--


--
-- SELECT template for table `BusinessMemberAssetsSummary`
--
SELECT `ad_accounts`, `profiles` FROM `BusinessMemberAssetsSummary` WHERE 1;

--
-- INSERT template for table `BusinessMemberAssetsSummary`
--
INSERT INTO `BusinessMemberAssetsSummary`(`ad_accounts`, `profiles`) VALUES (?, ?);

--
-- UPDATE template for table `BusinessMemberAssetsSummary`
--
UPDATE `BusinessMemberAssetsSummary` SET `ad_accounts` = ?, `profiles` = ? WHERE 1;

--
-- DELETE template for table `BusinessMemberAssetsSummary`
--
DELETE FROM `BusinessMemberAssetsSummary` WHERE 0;

