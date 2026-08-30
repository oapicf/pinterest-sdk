--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ProductTagsBulkDeleteRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'product_tags_bulk_delete_request'
--
SELECT product_tags FROM product_tags_bulk_delete_request WHERE 1=1;

--
-- INSERT template for table 'product_tags_bulk_delete_request'
--
INSERT INTO product_tags_bulk_delete_request (product_tags) VALUES (?);

--
-- UPDATE template for table 'product_tags_bulk_delete_request'
--
UPDATE product_tags_bulk_delete_request SET product_tags = ? WHERE 1=2;

--
-- DELETE template for table 'product_tags_bulk_delete_request'
--
DELETE FROM product_tags_bulk_delete_request WHERE 1=2;

