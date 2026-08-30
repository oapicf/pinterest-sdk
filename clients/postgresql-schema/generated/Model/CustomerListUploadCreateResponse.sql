--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CustomerListUploadCreateResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'customer_list_upload_create_response'
--
SELECT customer_list_upload, s3_multipart_upload_data FROM customer_list_upload_create_response WHERE 1=1;

--
-- INSERT template for table 'customer_list_upload_create_response'
--
INSERT INTO customer_list_upload_create_response (customer_list_upload, s3_multipart_upload_data) VALUES (?, ?);

--
-- UPDATE template for table 'customer_list_upload_create_response'
--
UPDATE customer_list_upload_create_response SET customer_list_upload = ?, s3_multipart_upload_data = ? WHERE 1=2;

--
-- DELETE template for table 'customer_list_upload_create_response'
--
DELETE FROM customer_list_upload_create_response WHERE 1=2;

