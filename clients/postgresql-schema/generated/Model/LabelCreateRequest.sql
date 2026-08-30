--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LabelCreateRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'label_create_request'
--
SELECT labels FROM label_create_request WHERE 1=1;

--
-- INSERT template for table 'label_create_request'
--
INSERT INTO label_create_request (labels) VALUES (?);

--
-- UPDATE template for table 'label_create_request'
--
UPDATE label_create_request SET labels = ? WHERE 1=2;

--
-- DELETE template for table 'label_create_request'
--
DELETE FROM label_create_request WHERE 1=2;

