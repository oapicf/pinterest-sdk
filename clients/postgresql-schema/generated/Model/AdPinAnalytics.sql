--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdPinAnalytics' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_pin_analytics'
--
SELECT "date", pin_id FROM ad_pin_analytics WHERE 1=1;

--
-- INSERT template for table 'ad_pin_analytics'
--
INSERT INTO ad_pin_analytics ("date", pin_id) VALUES (?, ?);

--
-- UPDATE template for table 'ad_pin_analytics'
--
UPDATE ad_pin_analytics SET "date" = ?, pin_id = ? WHERE 1=2;

--
-- DELETE template for table 'ad_pin_analytics'
--
DELETE FROM ad_pin_analytics WHERE 1=2;

