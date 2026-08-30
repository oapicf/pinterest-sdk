--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CustomerListUpload' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'customer_list_upload'
--
SELECT ad_account_id, creation_time, customer_list_id, error_counts, "id", operation, record_counts, "state", updated_time FROM customer_list_upload WHERE 1=1;

--
-- INSERT template for table 'customer_list_upload'
--
INSERT INTO customer_list_upload (ad_account_id, creation_time, customer_list_id, error_counts, "id", operation, record_counts, "state", updated_time) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'customer_list_upload'
--
UPDATE customer_list_upload SET ad_account_id = ?, creation_time = ?, customer_list_id = ?, error_counts = ?, "id" = ?, operation = ?, record_counts = ?, "state" = ?, updated_time = ? WHERE 1=2;

--
-- DELETE template for table 'customer_list_upload'
--
DELETE FROM customer_list_upload WHERE 1=2;

