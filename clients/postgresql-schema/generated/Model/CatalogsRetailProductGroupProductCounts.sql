--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsRetailProductGroupProductCounts' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_retail_product_group_product_counts'
--
SELECT catalog_type, in_stock, out_of_stock, preorder, total, videos FROM catalogs_retail_product_group_product_counts WHERE 1=1;

--
-- INSERT template for table 'catalogs_retail_product_group_product_counts'
--
INSERT INTO catalogs_retail_product_group_product_counts (catalog_type, in_stock, out_of_stock, preorder, total, videos) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_retail_product_group_product_counts'
--
UPDATE catalogs_retail_product_group_product_counts SET catalog_type = ?, in_stock = ?, out_of_stock = ?, preorder = ?, total = ?, videos = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_retail_product_group_product_counts'
--
DELETE FROM catalogs_retail_product_group_product_counts WHERE 1=2;

