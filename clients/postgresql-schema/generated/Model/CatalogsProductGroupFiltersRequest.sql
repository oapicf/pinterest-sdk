--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsProductGroupFiltersRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_product_group_filters_request'
--
SELECT any_of, all_of FROM catalogs_product_group_filters_request WHERE 1=1;

--
-- INSERT template for table 'catalogs_product_group_filters_request'
--
INSERT INTO catalogs_product_group_filters_request (any_of, all_of) VALUES (?, ?);

--
-- UPDATE template for table 'catalogs_product_group_filters_request'
--
UPDATE catalogs_product_group_filters_request SET any_of = ?, all_of = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_product_group_filters_request'
--
DELETE FROM catalogs_product_group_filters_request WHERE 1=2;

