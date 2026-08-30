--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AppsflyerAudienceCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'appsflyer_audience_create'
--
SELECT "name", platform FROM appsflyer_audience_create WHERE 1=1;

--
-- INSERT template for table 'appsflyer_audience_create'
--
INSERT INTO appsflyer_audience_create ("name", platform) VALUES (?, ?);

--
-- UPDATE template for table 'appsflyer_audience_create'
--
UPDATE appsflyer_audience_create SET "name" = ?, platform = ? WHERE 1=2;

--
-- DELETE template for table 'appsflyer_audience_create'
--
DELETE FROM appsflyer_audience_create WHERE 1=2;

