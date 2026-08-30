--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AvailabilityFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'availability_filter'
--
SELECT availability FROM availability_filter WHERE 1=1;

--
-- INSERT template for table 'availability_filter'
--
INSERT INTO availability_filter (availability) VALUES (?);

--
-- UPDATE template for table 'availability_filter'
--
UPDATE availability_filter SET availability = ? WHERE 1=2;

--
-- DELETE template for table 'availability_filter'
--
DELETE FROM availability_filter WHERE 1=2;

