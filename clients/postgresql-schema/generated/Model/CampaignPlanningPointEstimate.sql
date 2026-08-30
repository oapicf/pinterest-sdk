--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignPlanningPointEstimate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_planning_point_estimate'
--
SELECT budget, double_y, max_y, min_y, y FROM campaign_planning_point_estimate WHERE 1=1;

--
-- INSERT template for table 'campaign_planning_point_estimate'
--
INSERT INTO campaign_planning_point_estimate (budget, double_y, max_y, min_y, y) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'campaign_planning_point_estimate'
--
UPDATE campaign_planning_point_estimate SET budget = ?, double_y = ?, max_y = ?, min_y = ?, y = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_planning_point_estimate'
--
DELETE FROM campaign_planning_point_estimate WHERE 1=2;

