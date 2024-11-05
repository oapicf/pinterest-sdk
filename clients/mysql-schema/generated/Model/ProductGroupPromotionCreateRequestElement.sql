--
-- Pinterest REST API.
-- Prepared SQL queries for 'ProductGroupPromotionCreateRequestElement' definition.
--


--
-- SELECT template for table `ProductGroupPromotionCreateRequestElement`
--
SELECT `id`, `ad_group_id`, `bid_in_micro_currency`, `included`, `definition`, `relative_definition`, `parent_id`, `slideshow_collections_title`, `slideshow_collections_description`, `is_mdl`, `status`, `tracking_url`, `catalog_product_group_id`, `catalog_product_group_name`, `collections_hero_pin_id`, `collections_hero_destination_url`, `grid_click_type`, `creative_type` FROM `ProductGroupPromotionCreateRequestElement` WHERE 1;

--
-- INSERT template for table `ProductGroupPromotionCreateRequestElement`
--
INSERT INTO `ProductGroupPromotionCreateRequestElement`(`id`, `ad_group_id`, `bid_in_micro_currency`, `included`, `definition`, `relative_definition`, `parent_id`, `slideshow_collections_title`, `slideshow_collections_description`, `is_mdl`, `status`, `tracking_url`, `catalog_product_group_id`, `catalog_product_group_name`, `collections_hero_pin_id`, `collections_hero_destination_url`, `grid_click_type`, `creative_type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ProductGroupPromotionCreateRequestElement`
--
UPDATE `ProductGroupPromotionCreateRequestElement` SET `id` = ?, `ad_group_id` = ?, `bid_in_micro_currency` = ?, `included` = ?, `definition` = ?, `relative_definition` = ?, `parent_id` = ?, `slideshow_collections_title` = ?, `slideshow_collections_description` = ?, `is_mdl` = ?, `status` = ?, `tracking_url` = ?, `catalog_product_group_id` = ?, `catalog_product_group_name` = ?, `collections_hero_pin_id` = ?, `collections_hero_destination_url` = ?, `grid_click_type` = ?, `creative_type` = ? WHERE 1;

--
-- DELETE template for table `ProductGroupPromotionCreateRequestElement`
--
DELETE FROM `ProductGroupPromotionCreateRequestElement` WHERE 0;

