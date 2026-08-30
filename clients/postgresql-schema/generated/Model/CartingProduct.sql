--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CartingProduct' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'carting_product'
--
SELECT carting_product_id, display_preferred_retailers_only, display_product_price, preferred_retailers, randomize_preferred_retailers FROM carting_product WHERE 1=1;

--
-- INSERT template for table 'carting_product'
--
INSERT INTO carting_product (carting_product_id, display_preferred_retailers_only, display_product_price, preferred_retailers, randomize_preferred_retailers) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'carting_product'
--
UPDATE carting_product SET carting_product_id = ?, display_preferred_retailers_only = ?, display_product_price = ?, preferred_retailers = ?, randomize_preferred_retailers = ? WHERE 1=2;

--
-- DELETE template for table 'carting_product'
--
DELETE FROM carting_product WHERE 1=2;

