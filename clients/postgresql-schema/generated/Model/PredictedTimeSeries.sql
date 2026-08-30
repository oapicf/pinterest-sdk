--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PredictedTimeSeries' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'predicted_time_series'
--
SELECT "date" FROM predicted_time_series WHERE 1=1;

--
-- INSERT template for table 'predicted_time_series'
--
INSERT INTO predicted_time_series ("date") VALUES (?);

--
-- UPDATE template for table 'predicted_time_series'
--
UPDATE predicted_time_series SET "date" = ? WHERE 1=2;

--
-- DELETE template for table 'predicted_time_series'
--
DELETE FROM predicted_time_series WHERE 1=2;

