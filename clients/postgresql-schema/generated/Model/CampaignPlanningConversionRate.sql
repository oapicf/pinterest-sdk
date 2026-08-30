--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignPlanningConversionRate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_planning_conversion_rate'
--
SELECT attribution_windows, conversion_event, conversion_rate FROM campaign_planning_conversion_rate WHERE 1=1;

--
-- INSERT template for table 'campaign_planning_conversion_rate'
--
INSERT INTO campaign_planning_conversion_rate (attribution_windows, conversion_event, conversion_rate) VALUES (?, ?, ?);

--
-- UPDATE template for table 'campaign_planning_conversion_rate'
--
UPDATE campaign_planning_conversion_rate SET attribution_windows = ?, conversion_event = ?, conversion_rate = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_planning_conversion_rate'
--
DELETE FROM campaign_planning_conversion_rate WHERE 1=2;

