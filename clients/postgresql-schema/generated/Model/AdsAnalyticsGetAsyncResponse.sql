--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdsAnalyticsGetAsyncResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ads_analytics_get_async_response'
--
SELECT report_status, "size", url FROM ads_analytics_get_async_response WHERE 1=1;

--
-- INSERT template for table 'ads_analytics_get_async_response'
--
INSERT INTO ads_analytics_get_async_response (report_status, "size", url) VALUES (?, ?, ?);

--
-- UPDATE template for table 'ads_analytics_get_async_response'
--
UPDATE ads_analytics_get_async_response SET report_status = ?, "size" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'ads_analytics_get_async_response'
--
DELETE FROM ads_analytics_get_async_response WHERE 1=2;

