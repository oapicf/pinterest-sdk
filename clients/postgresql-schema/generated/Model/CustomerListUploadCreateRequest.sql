--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CustomerListUploadCreateRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'customer_list_upload_create_request'
--
SELECT operation, total_parts FROM customer_list_upload_create_request WHERE 1=1;

--
-- INSERT template for table 'customer_list_upload_create_request'
--
INSERT INTO customer_list_upload_create_request (operation, total_parts) VALUES (?, ?);

--
-- UPDATE template for table 'customer_list_upload_create_request'
--
UPDATE customer_list_upload_create_request SET operation = ?, total_parts = ? WHERE 1=2;

--
-- DELETE template for table 'customer_list_upload_create_request'
--
DELETE FROM customer_list_upload_create_request WHERE 1=2;

