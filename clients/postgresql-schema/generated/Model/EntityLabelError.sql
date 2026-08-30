--
-- "Pinterest REST API"
-- Prepared SQL queries for 'EntityLabelError' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'entity_label_error'
--
SELECT "data", error_messages FROM entity_label_error WHERE 1=1;

--
-- INSERT template for table 'entity_label_error'
--
INSERT INTO entity_label_error ("data", error_messages) VALUES (?, ?);

--
-- UPDATE template for table 'entity_label_error'
--
UPDATE entity_label_error SET "data" = ?, error_messages = ? WHERE 1=2;

--
-- DELETE template for table 'entity_label_error'
--
DELETE FROM entity_label_error WHERE 1=2;

