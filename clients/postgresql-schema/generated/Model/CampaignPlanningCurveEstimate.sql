--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignPlanningCurveEstimate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_planning_curve_estimate'
--
SELECT estimation_type, points FROM campaign_planning_curve_estimate WHERE 1=1;

--
-- INSERT template for table 'campaign_planning_curve_estimate'
--
INSERT INTO campaign_planning_curve_estimate (estimation_type, points) VALUES (?, ?);

--
-- UPDATE template for table 'campaign_planning_curve_estimate'
--
UPDATE campaign_planning_curve_estimate SET estimation_type = ?, points = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_planning_curve_estimate'
--
DELETE FROM campaign_planning_curve_estimate WHERE 1=2;

