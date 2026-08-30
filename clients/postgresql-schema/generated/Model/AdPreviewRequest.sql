--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdPreviewRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_preview_request'
--
SELECT image_url, promotion_id, title, creative_type, pin_id, catalog_product_group_id, customizable_cta_type, hero_image_title, hero_image_url, hero_pin_id, image_tag, item_id, preferred_media_type, show_promotion, video_tag FROM ad_preview_request WHERE 1=1;

--
-- INSERT template for table 'ad_preview_request'
--
INSERT INTO ad_preview_request (image_url, promotion_id, title, creative_type, pin_id, catalog_product_group_id, customizable_cta_type, hero_image_title, hero_image_url, hero_pin_id, image_tag, item_id, preferred_media_type, show_promotion, video_tag) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ad_preview_request'
--
UPDATE ad_preview_request SET image_url = ?, promotion_id = ?, title = ?, creative_type = ?, pin_id = ?, catalog_product_group_id = ?, customizable_cta_type = ?, hero_image_title = ?, hero_image_url = ?, hero_pin_id = ?, image_tag = ?, item_id = ?, preferred_media_type = ?, show_promotion = ?, video_tag = ? WHERE 1=2;

--
-- DELETE template for table 'ad_preview_request'
--
DELETE FROM ad_preview_request WHERE 1=2;

