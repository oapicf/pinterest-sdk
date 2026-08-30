--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CustomerSegmentCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'customer_segment_create'
--
SELECT audience_ids, "name" FROM customer_segment_create WHERE 1=1;

--
-- INSERT template for table 'customer_segment_create'
--
INSERT INTO customer_segment_create (audience_ids, "name") VALUES (?, ?);

--
-- UPDATE template for table 'customer_segment_create'
--
UPDATE customer_segment_create SET audience_ids = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'customer_segment_create'
--
DELETE FROM customer_segment_create WHERE 1=2;

