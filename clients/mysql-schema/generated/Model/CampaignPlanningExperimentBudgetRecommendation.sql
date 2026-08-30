--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignPlanningExperimentBudgetRecommendation' definition.
--


--
-- SELECT template for table `CampaignPlanningExperimentBudgetRecommendation`
--
SELECT `budget_recommendation`, `lifetime_days_recommendation`, `point_estimations`, `version_id` FROM `CampaignPlanningExperimentBudgetRecommendation` WHERE 1;

--
-- INSERT template for table `CampaignPlanningExperimentBudgetRecommendation`
--
INSERT INTO `CampaignPlanningExperimentBudgetRecommendation`(`budget_recommendation`, `lifetime_days_recommendation`, `point_estimations`, `version_id`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CampaignPlanningExperimentBudgetRecommendation`
--
UPDATE `CampaignPlanningExperimentBudgetRecommendation` SET `budget_recommendation` = ?, `lifetime_days_recommendation` = ?, `point_estimations` = ?, `version_id` = ? WHERE 1;

--
-- DELETE template for table `CampaignPlanningExperimentBudgetRecommendation`
--
DELETE FROM `CampaignPlanningExperimentBudgetRecommendation` WHERE 0;

