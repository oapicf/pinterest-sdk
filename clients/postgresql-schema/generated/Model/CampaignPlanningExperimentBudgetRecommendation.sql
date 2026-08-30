--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignPlanningExperimentBudgetRecommendation' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_planning_experiment_budget_recommendation'
--
SELECT budget_recommendation, lifetime_days_recommendation, point_estimations, version_id FROM campaign_planning_experiment_budget_recommendation WHERE 1=1;

--
-- INSERT template for table 'campaign_planning_experiment_budget_recommendation'
--
INSERT INTO campaign_planning_experiment_budget_recommendation (budget_recommendation, lifetime_days_recommendation, point_estimations, version_id) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'campaign_planning_experiment_budget_recommendation'
--
UPDATE campaign_planning_experiment_budget_recommendation SET budget_recommendation = ?, lifetime_days_recommendation = ?, point_estimations = ?, version_id = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_planning_experiment_budget_recommendation'
--
DELETE FROM campaign_planning_experiment_budget_recommendation WHERE 1=2;

