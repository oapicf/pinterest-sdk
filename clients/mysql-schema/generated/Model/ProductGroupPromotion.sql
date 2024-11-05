--
-- Pinterest REST API.
-- Prepared SQL queries for 'ProductGroupPromotion' definition.
--


--
-- SELECT template for table `ProductGroupPromotion`
--
SELECT `id`, `ad_group_id`, `bid_in_micro_currency`, `included`, `definition`, `relative_definition`, `parent_id`, `slideshow_collections_title`, `slideshow_collections_description`, `is_mdl`, `status`, `tracking_url`, `catalog_product_group_id`, `catalog_product_group_name`, `collections_hero_pin_id`, `collections_hero_destination_url`, `grid_click_type` FROM `ProductGroupPromotion` WHERE 1;

--
-- INSERT template for table `ProductGroupPromotion`
--
INSERT INTO `ProductGroupPromotion`(`id`, `ad_group_id`, `bid_in_micro_currency`, `included`, `definition`, `relative_definition`, `parent_id`, `slideshow_collections_title`, `slideshow_collections_description`, `is_mdl`, `status`, `tracking_url`, `catalog_product_group_id`, `catalog_product_group_name`, `collections_hero_pin_id`, `collections_hero_destination_url`, `grid_click_type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ProductGroupPromotion`
--
UPDATE `ProductGroupPromotion` SET `id` = ?, `ad_group_id` = ?, `bid_in_micro_currency` = ?, `included` = ?, `definition` = ?, `relative_definition` = ?, `parent_id` = ?, `slideshow_collections_title` = ?, `slideshow_collections_description` = ?, `is_mdl` = ?, `status` = ?, `tracking_url` = ?, `catalog_product_group_id` = ?, `catalog_product_group_name` = ?, `collections_hero_pin_id` = ?, `collections_hero_destination_url` = ?, `grid_click_type` = ? WHERE 1;

--
-- DELETE template for table `ProductGroupPromotion`
--
DELETE FROM `ProductGroupPromotion` WHERE 0;

