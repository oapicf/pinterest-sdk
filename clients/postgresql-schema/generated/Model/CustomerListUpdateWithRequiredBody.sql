--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CustomerListUpdateWithRequiredBody' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'customer_list_update_with_required_body'
--
SELECT operation_type, records, records_v2 FROM customer_list_update_with_required_body WHERE 1=1;

--
-- INSERT template for table 'customer_list_update_with_required_body'
--
INSERT INTO customer_list_update_with_required_body (operation_type, records, records_v2) VALUES (?, ?, ?);

--
-- UPDATE template for table 'customer_list_update_with_required_body'
--
UPDATE customer_list_update_with_required_body SET operation_type = ?, records = ?, records_v2 = ? WHERE 1=2;

--
-- DELETE template for table 'customer_list_update_with_required_body'
--
DELETE FROM customer_list_update_with_required_body WHERE 1=2;

