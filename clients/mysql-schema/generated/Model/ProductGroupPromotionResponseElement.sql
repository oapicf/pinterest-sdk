--
-- Pinterest REST API.
-- Prepared SQL queries for 'ProductGroupPromotionResponseElement' definition.
--


--
-- SELECT template for table `ProductGroupPromotionResponseElement`
--
SELECT `id`, `ad_group_id`, `bid_in_micro_currency`, `included`, `definition`, `relative_definition`, `parent_id`, `slideshow_collections_title`, `slideshow_collections_description`, `is_mdl`, `status`, `tracking_url`, `catalog_product_group_id`, `catalog_product_group_name`, `collections_hero_pin_id`, `collections_hero_destination_url`, `grid_click_type`, `creative_type` FROM `ProductGroupPromotionResponseElement` WHERE 1;

--
-- INSERT template for table `ProductGroupPromotionResponseElement`
--
INSERT INTO `ProductGroupPromotionResponseElement`(`id`, `ad_group_id`, `bid_in_micro_currency`, `included`, `definition`, `relative_definition`, `parent_id`, `slideshow_collections_title`, `slideshow_collections_description`, `is_mdl`, `status`, `tracking_url`, `catalog_product_group_id`, `catalog_product_group_name`, `collections_hero_pin_id`, `collections_hero_destination_url`, `grid_click_type`, `creative_type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ProductGroupPromotionResponseElement`
--
UPDATE `ProductGroupPromotionResponseElement` SET `id` = ?, `ad_group_id` = ?, `bid_in_micro_currency` = ?, `included` = ?, `definition` = ?, `relative_definition` = ?, `parent_id` = ?, `slideshow_collections_title` = ?, `slideshow_collections_description` = ?, `is_mdl` = ?, `status` = ?, `tracking_url` = ?, `catalog_product_group_id` = ?, `catalog_product_group_name` = ?, `collections_hero_pin_id` = ?, `collections_hero_destination_url` = ?, `grid_click_type` = ?, `creative_type` = ? WHERE 1;

--
-- DELETE template for table `ProductGroupPromotionResponseElement`
--
DELETE FROM `ProductGroupPromotionResponseElement` WHERE 0;

