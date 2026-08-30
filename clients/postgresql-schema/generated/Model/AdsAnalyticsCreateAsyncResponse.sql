--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdsAnalyticsCreateAsyncResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ads_analytics_create_async_response'
--
SELECT message, report_status, "token" FROM ads_analytics_create_async_response WHERE 1=1;

--
-- INSERT template for table 'ads_analytics_create_async_response'
--
INSERT INTO ads_analytics_create_async_response (message, report_status, "token") VALUES (?, ?, ?);

--
-- UPDATE template for table 'ads_analytics_create_async_response'
--
UPDATE ads_analytics_create_async_response SET message = ?, report_status = ?, "token" = ? WHERE 1=2;

--
-- DELETE template for table 'ads_analytics_create_async_response'
--
DELETE FROM ads_analytics_create_async_response WHERE 1=2;

