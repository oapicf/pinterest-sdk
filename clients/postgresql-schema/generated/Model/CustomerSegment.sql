--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CustomerSegment' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'customer_segment'
--
SELECT ad_account_id, audience_ids, created_time, "id", "name", status, updated_time FROM customer_segment WHERE 1=1;

--
-- INSERT template for table 'customer_segment'
--
INSERT INTO customer_segment (ad_account_id, audience_ids, created_time, "id", "name", status, updated_time) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'customer_segment'
--
UPDATE customer_segment SET ad_account_id = ?, audience_ids = ?, created_time = ?, "id" = ?, "name" = ?, status = ?, updated_time = ? WHERE 1=2;

--
-- DELETE template for table 'customer_segment'
--
DELETE FROM customer_segment WHERE 1=2;

