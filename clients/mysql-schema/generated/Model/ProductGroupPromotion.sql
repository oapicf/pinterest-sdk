--
-- Pinterest REST API.
-- Prepared SQL queries for 'ProductGroupPromotion' definition.
--


--
-- SELECT template for table `ProductGroupPromotion`
--
SELECT `ad_group_id`, `bid_in_micro_currency`, `catalog_product_group_id`, `catalog_product_group_name`, `collections_header_type`, `collections_hero_destination_url`, `collections_hero_pin_id`, `creative_type`, `customizable_cta_type`, `definition`, `grid_click_type`, `id`, `included`, `is_generate_background`, `is_image_auto_resizing`, `is_mdl`, `parent_id`, `preferred_media_type`, `relative_definition`, `selected_image_tag`, `selected_video_tag`, `slideshow_collections_description`, `slideshow_collections_title`, `status`, `tracking_url` FROM `ProductGroupPromotion` WHERE 1;

--
-- INSERT template for table `ProductGroupPromotion`
--
INSERT INTO `ProductGroupPromotion`(`ad_group_id`, `bid_in_micro_currency`, `catalog_product_group_id`, `catalog_product_group_name`, `collections_header_type`, `collections_hero_destination_url`, `collections_hero_pin_id`, `creative_type`, `customizable_cta_type`, `definition`, `grid_click_type`, `id`, `included`, `is_generate_background`, `is_image_auto_resizing`, `is_mdl`, `parent_id`, `preferred_media_type`, `relative_definition`, `selected_image_tag`, `selected_video_tag`, `slideshow_collections_description`, `slideshow_collections_title`, `status`, `tracking_url`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ProductGroupPromotion`
--
UPDATE `ProductGroupPromotion` SET `ad_group_id` = ?, `bid_in_micro_currency` = ?, `catalog_product_group_id` = ?, `catalog_product_group_name` = ?, `collections_header_type` = ?, `collections_hero_destination_url` = ?, `collections_hero_pin_id` = ?, `creative_type` = ?, `customizable_cta_type` = ?, `definition` = ?, `grid_click_type` = ?, `id` = ?, `included` = ?, `is_generate_background` = ?, `is_image_auto_resizing` = ?, `is_mdl` = ?, `parent_id` = ?, `preferred_media_type` = ?, `relative_definition` = ?, `selected_image_tag` = ?, `selected_video_tag` = ?, `slideshow_collections_description` = ?, `slideshow_collections_title` = ?, `status` = ?, `tracking_url` = ? WHERE 1;

--
-- DELETE template for table `ProductGroupPromotion`
--
DELETE FROM `ProductGroupPromotion` WHERE 0;

