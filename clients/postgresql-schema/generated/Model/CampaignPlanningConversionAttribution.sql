--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignPlanningConversionAttribution' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_planning_conversion_attribution'
--
SELECT click_window_days, engagement_window_days, view_window_days FROM campaign_planning_conversion_attribution WHERE 1=1;

--
-- INSERT template for table 'campaign_planning_conversion_attribution'
--
INSERT INTO campaign_planning_conversion_attribution (click_window_days, engagement_window_days, view_window_days) VALUES (?, ?, ?);

--
-- UPDATE template for table 'campaign_planning_conversion_attribution'
--
UPDATE campaign_planning_conversion_attribution SET click_window_days = ?, engagement_window_days = ?, view_window_days = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_planning_conversion_attribution'
--
DELETE FROM campaign_planning_conversion_attribution WHERE 1=2;

