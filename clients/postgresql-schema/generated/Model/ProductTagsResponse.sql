--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ProductTagsResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'product_tags_response'
--
SELECT product_tags FROM product_tags_response WHERE 1=1;

--
-- INSERT template for table 'product_tags_response'
--
INSERT INTO product_tags_response (product_tags) VALUES (?);

--
-- UPDATE template for table 'product_tags_response'
--
UPDATE product_tags_response SET product_tags = ? WHERE 1=2;

--
-- DELETE template for table 'product_tags_response'
--
DELETE FROM product_tags_response WHERE 1=2;

