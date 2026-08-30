--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LabelErrorData' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'label_error_data'
--
SELECT "id", label_type, status, "value" FROM label_error_data WHERE 1=1;

--
-- INSERT template for table 'label_error_data'
--
INSERT INTO label_error_data ("id", label_type, status, "value") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'label_error_data'
--
UPDATE label_error_data SET "id" = ?, label_type = ?, status = ?, "value" = ? WHERE 1=2;

--
-- DELETE template for table 'label_error_data'
--
DELETE FROM label_error_data WHERE 1=2;

