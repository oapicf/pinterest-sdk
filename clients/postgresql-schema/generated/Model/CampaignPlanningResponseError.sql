--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignPlanningResponseError' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_planning_response_error'
--
SELECT code, message FROM campaign_planning_response_error WHERE 1=1;

--
-- INSERT template for table 'campaign_planning_response_error'
--
INSERT INTO campaign_planning_response_error (code, message) VALUES (?, ?);

--
-- UPDATE template for table 'campaign_planning_response_error'
--
UPDATE campaign_planning_response_error SET code = ?, message = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_planning_response_error'
--
DELETE FROM campaign_planning_response_error WHERE 1=2;

