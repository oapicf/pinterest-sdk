--
-- Pinterest REST API.
-- Prepared SQL queries for 'PromotionCommon' definition.
--


--
-- SELECT template for table `PromotionCommon`
--
SELECT `discount_status`, `end_time`, `external_id`, `platform_type`, `promotion_code`, `promotion_custom_id`, `promotion_title`, `promotion_type`, `start_time`, `template_values` FROM `PromotionCommon` WHERE 1;

--
-- INSERT template for table `PromotionCommon`
--
INSERT INTO `PromotionCommon`(`discount_status`, `end_time`, `external_id`, `platform_type`, `promotion_code`, `promotion_custom_id`, `promotion_title`, `promotion_type`, `start_time`, `template_values`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PromotionCommon`
--
UPDATE `PromotionCommon` SET `discount_status` = ?, `end_time` = ?, `external_id` = ?, `platform_type` = ?, `promotion_code` = ?, `promotion_custom_id` = ?, `promotion_title` = ?, `promotion_type` = ?, `start_time` = ?, `template_values` = ? WHERE 1;

--
-- DELETE template for table `PromotionCommon`
--
DELETE FROM `PromotionCommon` WHERE 0;

