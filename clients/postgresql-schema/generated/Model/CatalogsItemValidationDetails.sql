--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsItemValidationDetails' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_item_validation_details'
--
SELECT attribute_name, provided_value FROM catalogs_item_validation_details WHERE 1=1;

--
-- INSERT template for table 'catalogs_item_validation_details'
--
INSERT INTO catalogs_item_validation_details (attribute_name, provided_value) VALUES (?, ?);

--
-- UPDATE template for table 'catalogs_item_validation_details'
--
UPDATE catalogs_item_validation_details SET attribute_name = ?, provided_value = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_item_validation_details'
--
DELETE FROM catalogs_item_validation_details WHERE 1=2;

