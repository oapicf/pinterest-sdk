--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignPlanningBudgetRecommendation' definition.
--


--
-- SELECT template for table `CampaignPlanningBudgetRecommendation`
--
SELECT `budget_recommendation`, `experiment_campaign_budget_recommendation`, `lifetime_days_recommendation`, `point_estimations` FROM `CampaignPlanningBudgetRecommendation` WHERE 1;

--
-- INSERT template for table `CampaignPlanningBudgetRecommendation`
--
INSERT INTO `CampaignPlanningBudgetRecommendation`(`budget_recommendation`, `experiment_campaign_budget_recommendation`, `lifetime_days_recommendation`, `point_estimations`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CampaignPlanningBudgetRecommendation`
--
UPDATE `CampaignPlanningBudgetRecommendation` SET `budget_recommendation` = ?, `experiment_campaign_budget_recommendation` = ?, `lifetime_days_recommendation` = ?, `point_estimations` = ? WHERE 1;

--
-- DELETE template for table `CampaignPlanningBudgetRecommendation`
--
DELETE FROM `CampaignPlanningBudgetRecommendation` WHERE 0;

