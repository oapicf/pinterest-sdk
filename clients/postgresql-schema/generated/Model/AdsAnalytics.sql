--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdsAnalytics' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ads_analytics'
--
SELECT ad_id, "date" FROM ads_analytics WHERE 1=1;

--
-- INSERT template for table 'ads_analytics'
--
INSERT INTO ads_analytics (ad_id, "date") VALUES (?, ?);

--
-- UPDATE template for table 'ads_analytics'
--
UPDATE ads_analytics SET ad_id = ?, "date" = ? WHERE 1=2;

--
-- DELETE template for table 'ads_analytics'
--
DELETE FROM ads_analytics WHERE 1=2;

