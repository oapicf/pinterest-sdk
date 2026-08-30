--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ProductGroupPromotionsUpdateWithRequiredBody' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'product_group_promotions_update_with_required_body'
--
SELECT ad_group_id, product_group_promotion FROM product_group_promotions_update_with_required_body WHERE 1=1;

--
-- INSERT template for table 'product_group_promotions_update_with_required_body'
--
INSERT INTO product_group_promotions_update_with_required_body (ad_group_id, product_group_promotion) VALUES (?, ?);

--
-- UPDATE template for table 'product_group_promotions_update_with_required_body'
--
UPDATE product_group_promotions_update_with_required_body SET ad_group_id = ?, product_group_promotion = ? WHERE 1=2;

--
-- DELETE template for table 'product_group_promotions_update_with_required_body'
--
DELETE FROM product_group_promotions_update_with_required_body WHERE 1=2;

