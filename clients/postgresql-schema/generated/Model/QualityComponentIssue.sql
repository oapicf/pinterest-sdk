--
-- "Pinterest REST API"
-- Prepared SQL queries for 'QualityComponentIssue' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'quality_component_issue'
--
SELECT "id", "name", reason FROM quality_component_issue WHERE 1=1;

--
-- INSERT template for table 'quality_component_issue'
--
INSERT INTO quality_component_issue ("id", "name", reason) VALUES (?, ?, ?);

--
-- UPDATE template for table 'quality_component_issue'
--
UPDATE quality_component_issue SET "id" = ?, "name" = ?, reason = ? WHERE 1=2;

--
-- DELETE template for table 'quality_component_issue'
--
DELETE FROM quality_component_issue WHERE 1=2;

