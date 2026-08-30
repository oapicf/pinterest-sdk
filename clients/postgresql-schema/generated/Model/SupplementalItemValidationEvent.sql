--
-- "Pinterest REST API"
-- Prepared SQL queries for 'SupplementalItemValidationEvent' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'supplemental_item_validation_event'
--
SELECT "attribute", code, message FROM supplemental_item_validation_event WHERE 1=1;

--
-- INSERT template for table 'supplemental_item_validation_event'
--
INSERT INTO supplemental_item_validation_event ("attribute", code, message) VALUES (?, ?, ?);

--
-- UPDATE template for table 'supplemental_item_validation_event'
--
UPDATE supplemental_item_validation_event SET "attribute" = ?, code = ?, message = ? WHERE 1=2;

--
-- DELETE template for table 'supplemental_item_validation_event'
--
DELETE FROM supplemental_item_validation_event WHERE 1=2;

