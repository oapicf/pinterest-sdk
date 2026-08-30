--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignPlanningCurveEstimate' definition.
--


--
-- SELECT template for table `CampaignPlanningCurveEstimate`
--
SELECT `estimation_type`, `points` FROM `CampaignPlanningCurveEstimate` WHERE 1;

--
-- INSERT template for table `CampaignPlanningCurveEstimate`
--
INSERT INTO `CampaignPlanningCurveEstimate`(`estimation_type`, `points`) VALUES (?, ?);

--
-- UPDATE template for table `CampaignPlanningCurveEstimate`
--
UPDATE `CampaignPlanningCurveEstimate` SET `estimation_type` = ?, `points` = ? WHERE 1;

--
-- DELETE template for table `CampaignPlanningCurveEstimate`
--
DELETE FROM `CampaignPlanningCurveEstimate` WHERE 0;

