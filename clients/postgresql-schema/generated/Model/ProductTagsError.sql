--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ProductTagsError' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'product_tags_error'
--
SELECT code, details, message FROM product_tags_error WHERE 1=1;

--
-- INSERT template for table 'product_tags_error'
--
INSERT INTO product_tags_error (code, details, message) VALUES (?, ?, ?);

--
-- UPDATE template for table 'product_tags_error'
--
UPDATE product_tags_error SET code = ?, details = ?, message = ? WHERE 1=2;

--
-- DELETE template for table 'product_tags_error'
--
DELETE FROM product_tags_error WHERE 1=2;

