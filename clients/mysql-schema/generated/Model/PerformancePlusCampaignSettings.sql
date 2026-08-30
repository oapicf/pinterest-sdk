--
-- Pinterest REST API.
-- Prepared SQL queries for 'PerformancePlusCampaignSettings' definition.
--


--
-- SELECT template for table `PerformancePlusCampaignSettings`
--
SELECT `boost_prospecting_ad_group_bid`, `pinner_list_exclusions` FROM `PerformancePlusCampaignSettings` WHERE 1;

--
-- INSERT template for table `PerformancePlusCampaignSettings`
--
INSERT INTO `PerformancePlusCampaignSettings`(`boost_prospecting_ad_group_bid`, `pinner_list_exclusions`) VALUES (?, ?);

--
-- UPDATE template for table `PerformancePlusCampaignSettings`
--
UPDATE `PerformancePlusCampaignSettings` SET `boost_prospecting_ad_group_bid` = ?, `pinner_list_exclusions` = ? WHERE 1;

--
-- DELETE template for table `PerformancePlusCampaignSettings`
--
DELETE FROM `PerformancePlusCampaignSettings` WHERE 0;

