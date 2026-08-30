--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignPlanningPointEstimate' definition.
--


--
-- SELECT template for table `CampaignPlanningPointEstimate`
--
SELECT `budget`, `double_y`, `max_y`, `min_y`, `y` FROM `CampaignPlanningPointEstimate` WHERE 1;

--
-- INSERT template for table `CampaignPlanningPointEstimate`
--
INSERT INTO `CampaignPlanningPointEstimate`(`budget`, `double_y`, `max_y`, `min_y`, `y`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignPlanningPointEstimate`
--
UPDATE `CampaignPlanningPointEstimate` SET `budget` = ?, `double_y` = ?, `max_y` = ?, `min_y` = ?, `y` = ? WHERE 1;

--
-- DELETE template for table `CampaignPlanningPointEstimate`
--
DELETE FROM `CampaignPlanningPointEstimate` WHERE 0;

