--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PerformancePlusCampaignSettings' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'performance_plus_campaign_settings'
--
SELECT boost_prospecting_ad_group_bid, pinner_list_exclusions FROM performance_plus_campaign_settings WHERE 1=1;

--
-- INSERT template for table 'performance_plus_campaign_settings'
--
INSERT INTO performance_plus_campaign_settings (boost_prospecting_ad_group_bid, pinner_list_exclusions) VALUES (?, ?);

--
-- UPDATE template for table 'performance_plus_campaign_settings'
--
UPDATE performance_plus_campaign_settings SET boost_prospecting_ad_group_bid = ?, pinner_list_exclusions = ? WHERE 1=2;

--
-- DELETE template for table 'performance_plus_campaign_settings'
--
DELETE FROM performance_plus_campaign_settings WHERE 1=2;

