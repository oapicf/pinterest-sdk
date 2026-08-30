--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CustomerList' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'customer_list'
--
SELECT ad_account_id, created_time, exceptions, "id", is_nca, "name", num_batches, num_removed_user_records, num_uploaded_user_records, status, "type", updated_time FROM customer_list WHERE 1=1;

--
-- INSERT template for table 'customer_list'
--
INSERT INTO customer_list (ad_account_id, created_time, exceptions, "id", is_nca, "name", num_batches, num_removed_user_records, num_uploaded_user_records, status, "type", updated_time) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'customer_list'
--
UPDATE customer_list SET ad_account_id = ?, created_time = ?, exceptions = ?, "id" = ?, is_nca = ?, "name" = ?, num_batches = ?, num_removed_user_records = ?, num_uploaded_user_records = ?, status = ?, "type" = ?, updated_time = ? WHERE 1=2;

--
-- DELETE template for table 'customer_list'
--
DELETE FROM customer_list WHERE 1=2;

