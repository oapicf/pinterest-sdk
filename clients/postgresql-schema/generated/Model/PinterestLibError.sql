--
-- "Pinterest REST API"
-- Prepared SQL queries for 'Pinterest.Lib.Error' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pinterest/lib/error'
--
SELECT code, message FROM pinterest/lib/error WHERE 1=1;

--
-- INSERT template for table 'pinterest/lib/error'
--
INSERT INTO pinterest/lib/error (code, message) VALUES (?, ?);

--
-- UPDATE template for table 'pinterest/lib/error'
--
UPDATE pinterest/lib/error SET code = ?, message = ? WHERE 1=2;

--
-- DELETE template for table 'pinterest/lib/error'
--
DELETE FROM pinterest/lib/error WHERE 1=2;

