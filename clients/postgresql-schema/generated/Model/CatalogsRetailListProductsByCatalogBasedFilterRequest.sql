--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsRetailListProductsByCatalogBasedFilterRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_retail_list_products_by_catalog_based_filter_request'
--
SELECT catalog_id, catalog_type, country, filters, locale FROM catalogs_retail_list_products_by_catalog_based_filter_request WHERE 1=1;

--
-- INSERT template for table 'catalogs_retail_list_products_by_catalog_based_filter_request'
--
INSERT INTO catalogs_retail_list_products_by_catalog_based_filter_request (catalog_id, catalog_type, country, filters, locale) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_retail_list_products_by_catalog_based_filter_request'
--
UPDATE catalogs_retail_list_products_by_catalog_based_filter_request SET catalog_id = ?, catalog_type = ?, country = ?, filters = ?, locale = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_retail_list_products_by_catalog_based_filter_request'
--
DELETE FROM catalogs_retail_list_products_by_catalog_based_filter_request WHERE 1=2;

