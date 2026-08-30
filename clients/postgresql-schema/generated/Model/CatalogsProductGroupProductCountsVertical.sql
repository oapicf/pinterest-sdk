--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsProductGroupProductCountsVertical' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_product_group_product_counts_vertical'
--
SELECT catalog_type, in_stock, out_of_stock, preorder, total, videos, app_links, images FROM catalogs_product_group_product_counts_vertical WHERE 1=1;

--
-- INSERT template for table 'catalogs_product_group_product_counts_vertical'
--
INSERT INTO catalogs_product_group_product_counts_vertical (catalog_type, in_stock, out_of_stock, preorder, total, videos, app_links, images) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_product_group_product_counts_vertical'
--
UPDATE catalogs_product_group_product_counts_vertical SET catalog_type = ?, in_stock = ?, out_of_stock = ?, preorder = ?, total = ?, videos = ?, app_links = ?, images = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_product_group_product_counts_vertical'
--
DELETE FROM catalogs_product_group_product_counts_vertical WHERE 1=2;

