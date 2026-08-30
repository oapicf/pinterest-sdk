--
-- "Pinterest REST API"
-- Prepared SQL queries for 'SSIOInsertionOrder' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ssio_insertion_order'
--
SELECT pin_order_id FROM ssio_insertion_order WHERE 1=1;

--
-- INSERT template for table 'ssio_insertion_order'
--
INSERT INTO ssio_insertion_order (pin_order_id) VALUES (?);

--
-- UPDATE template for table 'ssio_insertion_order'
--
UPDATE ssio_insertion_order SET pin_order_id = ? WHERE 1=2;

--
-- DELETE template for table 'ssio_insertion_order'
--
DELETE FROM ssio_insertion_order WHERE 1=2;

