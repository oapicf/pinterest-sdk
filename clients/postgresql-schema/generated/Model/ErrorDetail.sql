--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ErrorDetail' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'error_detail'
--
SELECT "count", error_code, message FROM error_detail WHERE 1=1;

--
-- INSERT template for table 'error_detail'
--
INSERT INTO error_detail ("count", error_code, message) VALUES (?, ?, ?);

--
-- UPDATE template for table 'error_detail'
--
UPDATE error_detail SET "count" = ?, error_code = ?, message = ? WHERE 1=2;

--
-- DELETE template for table 'error_detail'
--
DELETE FROM error_detail WHERE 1=2;

