--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignPlanningBudgetRecommendationPoint' definition.
--


--
-- SELECT template for table `CampaignPlanningBudgetRecommendationPoint`
--
SELECT `estimation_type`, `point_estimate` FROM `CampaignPlanningBudgetRecommendationPoint` WHERE 1;

--
-- INSERT template for table `CampaignPlanningBudgetRecommendationPoint`
--
INSERT INTO `CampaignPlanningBudgetRecommendationPoint`(`estimation_type`, `point_estimate`) VALUES (?, ?);

--
-- UPDATE template for table `CampaignPlanningBudgetRecommendationPoint`
--
UPDATE `CampaignPlanningBudgetRecommendationPoint` SET `estimation_type` = ?, `point_estimate` = ? WHERE 1;

--
-- DELETE template for table `CampaignPlanningBudgetRecommendationPoint`
--
DELETE FROM `CampaignPlanningBudgetRecommendationPoint` WHERE 0;

