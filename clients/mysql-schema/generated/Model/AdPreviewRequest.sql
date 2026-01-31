--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdPreviewRequest' definition.
--


--
-- SELECT template for table `AdPreviewRequest`
--
SELECT `image_url`, `title`, `pin_id`, `catalog_product_group_id`, `creative_type`, `customizable_cta_type`, `hero_image_title`, `hero_image_url`, `hero_pin_id`, `image_tag`, `item_id`, `preferred_media_type`, `video_tag` FROM `AdPreviewRequest` WHERE 1;

--
-- INSERT template for table `AdPreviewRequest`
--
INSERT INTO `AdPreviewRequest`(`image_url`, `title`, `pin_id`, `catalog_product_group_id`, `creative_type`, `customizable_cta_type`, `hero_image_title`, `hero_image_url`, `hero_pin_id`, `image_tag`, `item_id`, `preferred_media_type`, `video_tag`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdPreviewRequest`
--
UPDATE `AdPreviewRequest` SET `image_url` = ?, `title` = ?, `pin_id` = ?, `catalog_product_group_id` = ?, `creative_type` = ?, `customizable_cta_type` = ?, `hero_image_title` = ?, `hero_image_url` = ?, `hero_pin_id` = ?, `image_tag` = ?, `item_id` = ?, `preferred_media_type` = ?, `video_tag` = ? WHERE 1;

--
-- DELETE template for table `AdPreviewRequest`
--
DELETE FROM `AdPreviewRequest` WHERE 0;

