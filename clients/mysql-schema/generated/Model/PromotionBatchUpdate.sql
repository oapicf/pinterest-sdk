--
-- Pinterest REST API.
-- Prepared SQL queries for 'PromotionBatchUpdate' definition.
--


--
-- SELECT template for table `PromotionBatchUpdate`
--
SELECT `discount_status`, `end_time`, `external_id`, `id`, `platform_type`, `promotion_code`, `promotion_custom_id`, `promotion_title`, `promotion_type`, `start_time`, `template_values` FROM `PromotionBatchUpdate` WHERE 1;

--
-- INSERT template for table `PromotionBatchUpdate`
--
INSERT INTO `PromotionBatchUpdate`(`discount_status`, `end_time`, `external_id`, `id`, `platform_type`, `promotion_code`, `promotion_custom_id`, `promotion_title`, `promotion_type`, `start_time`, `template_values`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PromotionBatchUpdate`
--
UPDATE `PromotionBatchUpdate` SET `discount_status` = ?, `end_time` = ?, `external_id` = ?, `id` = ?, `platform_type` = ?, `promotion_code` = ?, `promotion_custom_id` = ?, `promotion_title` = ?, `promotion_type` = ?, `start_time` = ?, `template_values` = ? WHERE 1;

--
-- DELETE template for table `PromotionBatchUpdate`
--
DELETE FROM `PromotionBatchUpdate` WHERE 0;

