--
-- "Pinterest REST API"
-- Prepared SQL queries for 'product_group_promotions_list_200_response' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'product_group_promotions_list_200_response'
--
SELECT bookmark, items FROM product_group_promotions_list_200_response WHERE 1=1;

--
-- INSERT template for table 'product_group_promotions_list_200_response'
--
INSERT INTO product_group_promotions_list_200_response (bookmark, items) VALUES (?, ?);

--
-- UPDATE template for table 'product_group_promotions_list_200_response'
--
UPDATE product_group_promotions_list_200_response SET bookmark = ?, items = ? WHERE 1=2;

--
-- DELETE template for table 'product_group_promotions_list_200_response'
--
DELETE FROM product_group_promotions_list_200_response WHERE 1=2;

