--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ItemValidationEvent' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_validation_event'
--
SELECT "attribute", code, message FROM item_validation_event WHERE 1=1;

--
-- INSERT template for table 'item_validation_event'
--
INSERT INTO item_validation_event ("attribute", code, message) VALUES (?, ?, ?);

--
-- UPDATE template for table 'item_validation_event'
--
UPDATE item_validation_event SET "attribute" = ?, code = ?, message = ? WHERE 1=2;

--
-- DELETE template for table 'item_validation_event'
--
DELETE FROM item_validation_event WHERE 1=2;

