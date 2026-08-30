--
-- "Pinterest REST API"
-- Prepared SQL queries for 'SSIOInsertionOrderStatus' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ssio_insertion_order_status'
--
SELECT creation_time, pin_order_id, status FROM ssio_insertion_order_status WHERE 1=1;

--
-- INSERT template for table 'ssio_insertion_order_status'
--
INSERT INTO ssio_insertion_order_status (creation_time, pin_order_id, status) VALUES (?, ?, ?);

--
-- UPDATE template for table 'ssio_insertion_order_status'
--
UPDATE ssio_insertion_order_status SET creation_time = ?, pin_order_id = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'ssio_insertion_order_status'
--
DELETE FROM ssio_insertion_order_status WHERE 1=2;

