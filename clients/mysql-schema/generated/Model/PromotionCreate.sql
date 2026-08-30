--
-- Pinterest REST API.
-- Prepared SQL queries for 'PromotionCreate' definition.
--


--
-- SELECT template for table `PromotionCreate`
--
SELECT `discount_status`, `end_time`, `external_id`, `platform_type`, `promotion_code`, `promotion_custom_id`, `promotion_title`, `promotion_type`, `start_time`, `template_values` FROM `PromotionCreate` WHERE 1;

--
-- INSERT template for table `PromotionCreate`
--
INSERT INTO `PromotionCreate`(`discount_status`, `end_time`, `external_id`, `platform_type`, `promotion_code`, `promotion_custom_id`, `promotion_title`, `promotion_type`, `start_time`, `template_values`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PromotionCreate`
--
UPDATE `PromotionCreate` SET `discount_status` = ?, `end_time` = ?, `external_id` = ?, `platform_type` = ?, `promotion_code` = ?, `promotion_custom_id` = ?, `promotion_title` = ?, `promotion_type` = ?, `start_time` = ?, `template_values` = ? WHERE 1;

--
-- DELETE template for table `PromotionCreate`
--
DELETE FROM `PromotionCreate` WHERE 0;

