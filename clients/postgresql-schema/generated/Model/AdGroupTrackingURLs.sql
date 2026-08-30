--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdGroupTrackingURLs' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_group_tracking_urls'
--
SELECT audience_verification, buyable_button, click, engagement, impression FROM ad_group_tracking_urls WHERE 1=1;

--
-- INSERT template for table 'ad_group_tracking_urls'
--
INSERT INTO ad_group_tracking_urls (audience_verification, buyable_button, click, engagement, impression) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ad_group_tracking_urls'
--
UPDATE ad_group_tracking_urls SET audience_verification = ?, buyable_button = ?, click = ?, engagement = ?, impression = ? WHERE 1=2;

--
-- DELETE template for table 'ad_group_tracking_urls'
--
DELETE FROM ad_group_tracking_urls WHERE 1=2;

