--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignPlanningBudgetRecommendationPoint' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_planning_budget_recommendation_point'
--
SELECT estimation_type, point_estimate FROM campaign_planning_budget_recommendation_point WHERE 1=1;

--
-- INSERT template for table 'campaign_planning_budget_recommendation_point'
--
INSERT INTO campaign_planning_budget_recommendation_point (estimation_type, point_estimate) VALUES (?, ?);

--
-- UPDATE template for table 'campaign_planning_budget_recommendation_point'
--
UPDATE campaign_planning_budget_recommendation_point SET estimation_type = ?, point_estimate = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_planning_budget_recommendation_point'
--
DELETE FROM campaign_planning_budget_recommendation_point WHERE 1=2;

