--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignPlanningConfidenceLevelAlert' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_planning_confidence_level_alert'
--
SELECT description, reason, severity FROM campaign_planning_confidence_level_alert WHERE 1=1;

--
-- INSERT template for table 'campaign_planning_confidence_level_alert'
--
INSERT INTO campaign_planning_confidence_level_alert (description, reason, severity) VALUES (?, ?, ?);

--
-- UPDATE template for table 'campaign_planning_confidence_level_alert'
--
UPDATE campaign_planning_confidence_level_alert SET description = ?, reason = ?, severity = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_planning_confidence_level_alert'
--
DELETE FROM campaign_planning_confidence_level_alert WHERE 1=2;

