--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LabelError' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'label_error'
--
SELECT "data", error_messages FROM label_error WHERE 1=1;

--
-- INSERT template for table 'label_error'
--
INSERT INTO label_error ("data", error_messages) VALUES (?, ?);

--
-- UPDATE template for table 'label_error'
--
UPDATE label_error SET "data" = ?, error_messages = ? WHERE 1=2;

--
-- DELETE template for table 'label_error'
--
DELETE FROM label_error WHERE 1=2;

