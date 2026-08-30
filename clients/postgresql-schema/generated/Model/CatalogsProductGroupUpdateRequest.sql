--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsProductGroupUpdateRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_product_group_update_request'
--
SELECT description, filters, is_featured, "name" FROM catalogs_product_group_update_request WHERE 1=1;

--
-- INSERT template for table 'catalogs_product_group_update_request'
--
INSERT INTO catalogs_product_group_update_request (description, filters, is_featured, "name") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_product_group_update_request'
--
UPDATE catalogs_product_group_update_request SET description = ?, filters = ?, is_featured = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_product_group_update_request'
--
DELETE FROM catalogs_product_group_update_request WHERE 1=2;

