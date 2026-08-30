--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TimeSeries' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'time_series'
--
SELECT "date" FROM time_series WHERE 1=1;

--
-- INSERT template for table 'time_series'
--
INSERT INTO time_series ("date") VALUES (?);

--
-- UPDATE template for table 'time_series'
--
UPDATE time_series SET "date" = ? WHERE 1=2;

--
-- DELETE template for table 'time_series'
--
DELETE FROM time_series WHERE 1=2;

