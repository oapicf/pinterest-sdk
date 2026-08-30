--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdPreviewShopping' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_preview_shopping'
--
SELECT catalog_product_group_id, creative_type, customizable_cta_type, hero_image_title, hero_image_url, hero_pin_id, image_tag, item_id, preferred_media_type, show_promotion, video_tag FROM ad_preview_shopping WHERE 1=1;

--
-- INSERT template for table 'ad_preview_shopping'
--
INSERT INTO ad_preview_shopping (catalog_product_group_id, creative_type, customizable_cta_type, hero_image_title, hero_image_url, hero_pin_id, image_tag, item_id, preferred_media_type, show_promotion, video_tag) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ad_preview_shopping'
--
UPDATE ad_preview_shopping SET catalog_product_group_id = ?, creative_type = ?, customizable_cta_type = ?, hero_image_title = ?, hero_image_url = ?, hero_pin_id = ?, image_tag = ?, item_id = ?, preferred_media_type = ?, show_promotion = ?, video_tag = ? WHERE 1=2;

--
-- DELETE template for table 'ad_preview_shopping'
--
DELETE FROM ad_preview_shopping WHERE 1=2;

