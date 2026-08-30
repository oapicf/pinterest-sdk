--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsItemValidationIssues' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_item_validation_issues'
--
SELECT errors, item_id, item_number, warnings FROM catalogs_item_validation_issues WHERE 1=1;

--
-- INSERT template for table 'catalogs_item_validation_issues'
--
INSERT INTO catalogs_item_validation_issues (errors, item_id, item_number, warnings) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_item_validation_issues'
--
UPDATE catalogs_item_validation_issues SET errors = ?, item_id = ?, item_number = ?, warnings = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_item_validation_issues'
--
DELETE FROM catalogs_item_validation_issues WHERE 1=2;

