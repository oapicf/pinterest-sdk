--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsProductGroupUpdateManyRequestItemsOneOfItems0' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_product_group_update_many_request_items_one_of_items0'
--
SELECT description, filters, is_featured, "name", "id" FROM catalogs_product_group_update_many_request_items_one_of_items0 WHERE 1=1;

--
-- INSERT template for table 'catalogs_product_group_update_many_request_items_one_of_items0'
--
INSERT INTO catalogs_product_group_update_many_request_items_one_of_items0 (description, filters, is_featured, "name", "id") VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_product_group_update_many_request_items_one_of_items0'
--
UPDATE catalogs_product_group_update_many_request_items_one_of_items0 SET description = ?, filters = ?, is_featured = ?, "name" = ?, "id" = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_product_group_update_many_request_items_one_of_items0'
--
DELETE FROM catalogs_product_group_update_many_request_items_one_of_items0 WHERE 1=2;

