--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ProductGroupPromotionCreateRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'product_group_promotion_create_request'
--
SELECT ad_group_id, product_group_promotion FROM product_group_promotion_create_request WHERE 1=1;

--
-- INSERT template for table 'product_group_promotion_create_request'
--
INSERT INTO product_group_promotion_create_request (ad_group_id, product_group_promotion) VALUES (?, ?);

--
-- UPDATE template for table 'product_group_promotion_create_request'
--
UPDATE product_group_promotion_create_request SET ad_group_id = ?, product_group_promotion = ? WHERE 1=2;

--
-- DELETE template for table 'product_group_promotion_create_request'
--
DELETE FROM product_group_promotion_create_request WHERE 1=2;

