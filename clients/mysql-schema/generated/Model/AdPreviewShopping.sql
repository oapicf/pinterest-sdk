--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdPreviewShopping' definition.
--


--
-- SELECT template for table `AdPreviewShopping`
--
SELECT `catalog_product_group_id`, `creative_type`, `customizable_cta_type`, `hero_image_title`, `hero_image_url`, `hero_pin_id`, `image_tag`, `item_id`, `preferred_media_type`, `video_tag` FROM `AdPreviewShopping` WHERE 1;

--
-- INSERT template for table `AdPreviewShopping`
--
INSERT INTO `AdPreviewShopping`(`catalog_product_group_id`, `creative_type`, `customizable_cta_type`, `hero_image_title`, `hero_image_url`, `hero_pin_id`, `image_tag`, `item_id`, `preferred_media_type`, `video_tag`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdPreviewShopping`
--
UPDATE `AdPreviewShopping` SET `catalog_product_group_id` = ?, `creative_type` = ?, `customizable_cta_type` = ?, `hero_image_title` = ?, `hero_image_url` = ?, `hero_pin_id` = ?, `image_tag` = ?, `item_id` = ?, `preferred_media_type` = ?, `video_tag` = ? WHERE 1;

--
-- DELETE template for table `AdPreviewShopping`
--
DELETE FROM `AdPreviewShopping` WHERE 0;

