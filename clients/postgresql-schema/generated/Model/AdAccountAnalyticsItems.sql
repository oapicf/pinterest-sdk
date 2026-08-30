--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdAccountAnalyticsItems' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_account_analytics_items'
--
SELECT ad_account_id, "date" FROM ad_account_analytics_items WHERE 1=1;

--
-- INSERT template for table 'ad_account_analytics_items'
--
INSERT INTO ad_account_analytics_items (ad_account_id, "date") VALUES (?, ?);

--
-- UPDATE template for table 'ad_account_analytics_items'
--
UPDATE ad_account_analytics_items SET ad_account_id = ?, "date" = ? WHERE 1=2;

--
-- DELETE template for table 'ad_account_analytics_items'
--
DELETE FROM ad_account_analytics_items WHERE 1=2;

