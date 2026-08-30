--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LabelBulkUpdateRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'label_bulk_update_request'
--
SELECT "id", parent_id, status FROM label_bulk_update_request WHERE 1=1;

--
-- INSERT template for table 'label_bulk_update_request'
--
INSERT INTO label_bulk_update_request ("id", parent_id, status) VALUES (?, ?, ?);

--
-- UPDATE template for table 'label_bulk_update_request'
--
UPDATE label_bulk_update_request SET "id" = ?, parent_id = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'label_bulk_update_request'
--
DELETE FROM label_bulk_update_request WHERE 1=2;

