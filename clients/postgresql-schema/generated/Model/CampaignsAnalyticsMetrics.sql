--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignsAnalyticsMetrics' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaigns_analytics_metrics'
--
SELECT campaign_id, "date" FROM campaigns_analytics_metrics WHERE 1=1;

--
-- INSERT template for table 'campaigns_analytics_metrics'
--
INSERT INTO campaigns_analytics_metrics (campaign_id, "date") VALUES (?, ?);

--
-- UPDATE template for table 'campaigns_analytics_metrics'
--
UPDATE campaigns_analytics_metrics SET campaign_id = ?, "date" = ? WHERE 1=2;

--
-- DELETE template for table 'campaigns_analytics_metrics'
--
DELETE FROM campaigns_analytics_metrics WHERE 1=2;

