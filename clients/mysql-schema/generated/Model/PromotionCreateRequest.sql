--
-- Pinterest REST API.
-- Prepared SQL queries for 'PromotionCreateRequest' definition.
--


--
-- SELECT template for table `PromotionCreateRequest`
--
SELECT `discount_status`, `end_time`, `external_id`, `platform_type`, `promotion_code`, `promotion_custom_id`, `promotion_title`, `promotion_type`, `start_time`, `template_values` FROM `PromotionCreateRequest` WHERE 1;

--
-- INSERT template for table `PromotionCreateRequest`
--
INSERT INTO `PromotionCreateRequest`(`discount_status`, `end_time`, `external_id`, `platform_type`, `promotion_code`, `promotion_custom_id`, `promotion_title`, `promotion_type`, `start_time`, `template_values`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PromotionCreateRequest`
--
UPDATE `PromotionCreateRequest` SET `discount_status` = ?, `end_time` = ?, `external_id` = ?, `platform_type` = ?, `promotion_code` = ?, `promotion_custom_id` = ?, `promotion_title` = ?, `promotion_type` = ?, `start_time` = ?, `template_values` = ? WHERE 1;

--
-- DELETE template for table `PromotionCreateRequest`
--
DELETE FROM `PromotionCreateRequest` WHERE 0;

