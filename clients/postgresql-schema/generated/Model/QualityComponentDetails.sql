--
-- "Pinterest REST API"
-- Prepared SQL queries for 'QualityComponentDetails' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'quality_component_details'
--
SELECT coverage, issues, overlap FROM quality_component_details WHERE 1=1;

--
-- INSERT template for table 'quality_component_details'
--
INSERT INTO quality_component_details (coverage, issues, overlap) VALUES (?, ?, ?);

--
-- UPDATE template for table 'quality_component_details'
--
UPDATE quality_component_details SET coverage = ?, issues = ?, overlap = ? WHERE 1=2;

--
-- DELETE template for table 'quality_component_details'
--
DELETE FROM quality_component_details WHERE 1=2;

