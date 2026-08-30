--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignPlanningAdGroupAudienceSize' definition.
--


--
-- SELECT template for table `CampaignPlanningAdGroupAudienceSize`
--
SELECT `count_lower`, `count_upper` FROM `CampaignPlanningAdGroupAudienceSize` WHERE 1;

--
-- INSERT template for table `CampaignPlanningAdGroupAudienceSize`
--
INSERT INTO `CampaignPlanningAdGroupAudienceSize`(`count_lower`, `count_upper`) VALUES (?, ?);

--
-- UPDATE template for table `CampaignPlanningAdGroupAudienceSize`
--
UPDATE `CampaignPlanningAdGroupAudienceSize` SET `count_lower` = ?, `count_upper` = ? WHERE 1;

--
-- DELETE template for table `CampaignPlanningAdGroupAudienceSize`
--
DELETE FROM `CampaignPlanningAdGroupAudienceSize` WHERE 0;

