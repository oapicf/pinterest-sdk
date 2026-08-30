--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LabelUpdateRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'label_update_request'
--
SELECT labels FROM label_update_request WHERE 1=1;

--
-- INSERT template for table 'label_update_request'
--
INSERT INTO label_update_request (labels) VALUES (?);

--
-- UPDATE template for table 'label_update_request'
--
UPDATE label_update_request SET labels = ? WHERE 1=2;

--
-- DELETE template for table 'label_update_request'
--
DELETE FROM label_update_request WHERE 1=2;

