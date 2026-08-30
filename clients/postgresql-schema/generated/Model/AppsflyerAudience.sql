--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AppsflyerAudience' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'appsflyer_audience'
--
SELECT container_id, "name", platform FROM appsflyer_audience WHERE 1=1;

--
-- INSERT template for table 'appsflyer_audience'
--
INSERT INTO appsflyer_audience (container_id, "name", platform) VALUES (?, ?, ?);

--
-- UPDATE template for table 'appsflyer_audience'
--
UPDATE appsflyer_audience SET container_id = ?, "name" = ?, platform = ? WHERE 1=2;

--
-- DELETE template for table 'appsflyer_audience'
--
DELETE FROM appsflyer_audience WHERE 1=2;

