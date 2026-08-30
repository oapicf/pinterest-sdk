--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LabelBulkCreateRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'label_bulk_create_request'
--
SELECT labels, parent_id FROM label_bulk_create_request WHERE 1=1;

--
-- INSERT template for table 'label_bulk_create_request'
--
INSERT INTO label_bulk_create_request (labels, parent_id) VALUES (?, ?);

--
-- UPDATE template for table 'label_bulk_create_request'
--
UPDATE label_bulk_create_request SET labels = ?, parent_id = ? WHERE 1=2;

--
-- DELETE template for table 'label_bulk_create_request'
--
DELETE FROM label_bulk_create_request WHERE 1=2;

