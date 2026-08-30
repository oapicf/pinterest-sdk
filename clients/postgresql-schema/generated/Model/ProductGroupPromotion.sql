--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ProductGroupPromotion' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'product_group_promotion'
--
SELECT ad_group_id, bid_in_micro_currency, catalog_product_group_id, catalog_product_group_name, collections_header_type, collections_hero_destination_url, collections_hero_pin_id, creative_type, customizable_cta_type, definition, grid_click_type, "id", included, is_generate_background, is_image_auto_resizing, is_mdl, parent_id, preferred_media_type, relative_definition, selected_image_tag, selected_video_tag, slideshow_collections_description, slideshow_collections_title, status, tracking_url FROM product_group_promotion WHERE 1=1;

--
-- INSERT template for table 'product_group_promotion'
--
INSERT INTO product_group_promotion (ad_group_id, bid_in_micro_currency, catalog_product_group_id, catalog_product_group_name, collections_header_type, collections_hero_destination_url, collections_hero_pin_id, creative_type, customizable_cta_type, definition, grid_click_type, "id", included, is_generate_background, is_image_auto_resizing, is_mdl, parent_id, preferred_media_type, relative_definition, selected_image_tag, selected_video_tag, slideshow_collections_description, slideshow_collections_title, status, tracking_url) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'product_group_promotion'
--
UPDATE product_group_promotion SET ad_group_id = ?, bid_in_micro_currency = ?, catalog_product_group_id = ?, catalog_product_group_name = ?, collections_header_type = ?, collections_hero_destination_url = ?, collections_hero_pin_id = ?, creative_type = ?, customizable_cta_type = ?, definition = ?, grid_click_type = ?, "id" = ?, included = ?, is_generate_background = ?, is_image_auto_resizing = ?, is_mdl = ?, parent_id = ?, preferred_media_type = ?, relative_definition = ?, selected_image_tag = ?, selected_video_tag = ?, slideshow_collections_description = ?, slideshow_collections_title = ?, status = ?, tracking_url = ? WHERE 1=2;

--
-- DELETE template for table 'product_group_promotion'
--
DELETE FROM product_group_promotion WHERE 1=2;

