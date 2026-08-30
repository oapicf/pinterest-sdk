--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CustomerListCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'customer_list_create'
--
SELECT is_nca, list_type, "name", records, records_v2 FROM customer_list_create WHERE 1=1;

--
-- INSERT template for table 'customer_list_create'
--
INSERT INTO customer_list_create (is_nca, list_type, "name", records, records_v2) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'customer_list_create'
--
UPDATE customer_list_create SET is_nca = ?, list_type = ?, "name" = ?, records = ?, records_v2 = ? WHERE 1=2;

--
-- DELETE template for table 'customer_list_create'
--
DELETE FROM customer_list_create WHERE 1=2;

