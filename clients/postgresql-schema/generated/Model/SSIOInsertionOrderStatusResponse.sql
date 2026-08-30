--
-- "Pinterest REST API"
-- Prepared SQL queries for 'SSIOInsertionOrderStatusResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ssio_insertion_order_status_response'
--
SELECT creation_time, pin_order_id, status FROM ssio_insertion_order_status_response WHERE 1=1;

--
-- INSERT template for table 'ssio_insertion_order_status_response'
--
INSERT INTO ssio_insertion_order_status_response (creation_time, pin_order_id, status) VALUES (?, ?, ?);

--
-- UPDATE template for table 'ssio_insertion_order_status_response'
--
UPDATE ssio_insertion_order_status_response SET creation_time = ?, pin_order_id = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'ssio_insertion_order_status_response'
--
DELETE FROM ssio_insertion_order_status_response WHERE 1=2;

