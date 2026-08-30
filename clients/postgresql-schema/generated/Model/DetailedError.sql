--
-- "Pinterest REST API"
-- Prepared SQL queries for 'DetailedError' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'detailed_error'
--
SELECT code, details, message FROM detailed_error WHERE 1=1;

--
-- INSERT template for table 'detailed_error'
--
INSERT INTO detailed_error (code, details, message) VALUES (?, ?, ?);

--
-- UPDATE template for table 'detailed_error'
--
UPDATE detailed_error SET code = ?, details = ?, message = ? WHERE 1=2;

--
-- DELETE template for table 'detailed_error'
--
DELETE FROM detailed_error WHERE 1=2;

