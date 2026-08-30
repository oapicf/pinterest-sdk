--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsRetailProductMetadata' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_retail_product_metadata'
--
SELECT availability, currency, item_group_id, item_id, price, sale_price FROM catalogs_retail_product_metadata WHERE 1=1;

--
-- INSERT template for table 'catalogs_retail_product_metadata'
--
INSERT INTO catalogs_retail_product_metadata (availability, currency, item_group_id, item_id, price, sale_price) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_retail_product_metadata'
--
UPDATE catalogs_retail_product_metadata SET availability = ?, currency = ?, item_group_id = ?, item_id = ?, price = ?, sale_price = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_retail_product_metadata'
--
DELETE FROM catalogs_retail_product_metadata WHERE 1=2;

