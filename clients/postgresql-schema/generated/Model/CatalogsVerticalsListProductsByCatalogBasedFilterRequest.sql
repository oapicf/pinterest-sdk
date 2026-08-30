--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsVerticalsListProductsByCatalogBasedFilterRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_verticals_list_products_by_catalog_based_filter_reques'
--
SELECT catalog_id, catalog_type, country, filters, locale FROM catalogs_verticals_list_products_by_catalog_based_filter_reques WHERE 1=1;

--
-- INSERT template for table 'catalogs_verticals_list_products_by_catalog_based_filter_reques'
--
INSERT INTO catalogs_verticals_list_products_by_catalog_based_filter_reques (catalog_id, catalog_type, country, filters, locale) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_verticals_list_products_by_catalog_based_filter_reques'
--
UPDATE catalogs_verticals_list_products_by_catalog_based_filter_reques SET catalog_id = ?, catalog_type = ?, country = ?, filters = ?, locale = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_verticals_list_products_by_catalog_based_filter_reques'
--
DELETE FROM catalogs_verticals_list_products_by_catalog_based_filter_reques WHERE 1=2;

