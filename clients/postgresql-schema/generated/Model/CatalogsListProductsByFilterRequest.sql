--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsListProductsByFilterRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_list_products_by_filter_request'
--
SELECT feed_id, filters, catalog_id, catalog_type, country, locale FROM catalogs_list_products_by_filter_request WHERE 1=1;

--
-- INSERT template for table 'catalogs_list_products_by_filter_request'
--
INSERT INTO catalogs_list_products_by_filter_request (feed_id, filters, catalog_id, catalog_type, country, locale) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_list_products_by_filter_request'
--
UPDATE catalogs_list_products_by_filter_request SET feed_id = ?, filters = ?, catalog_id = ?, catalog_type = ?, country = ?, locale = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_list_products_by_filter_request'
--
DELETE FROM catalogs_list_products_by_filter_request WHERE 1=2;

