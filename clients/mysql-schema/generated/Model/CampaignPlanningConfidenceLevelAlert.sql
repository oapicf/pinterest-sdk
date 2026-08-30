--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignPlanningConfidenceLevelAlert' definition.
--


--
-- SELECT template for table `CampaignPlanningConfidenceLevelAlert`
--
SELECT `description`, `reason`, `severity` FROM `CampaignPlanningConfidenceLevelAlert` WHERE 1;

--
-- INSERT template for table `CampaignPlanningConfidenceLevelAlert`
--
INSERT INTO `CampaignPlanningConfidenceLevelAlert`(`description`, `reason`, `severity`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CampaignPlanningConfidenceLevelAlert`
--
UPDATE `CampaignPlanningConfidenceLevelAlert` SET `description` = ?, `reason` = ?, `severity` = ? WHERE 1;

--
-- DELETE template for table `CampaignPlanningConfidenceLevelAlert`
--
DELETE FROM `CampaignPlanningConfidenceLevelAlert` WHERE 0;

