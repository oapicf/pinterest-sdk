--
-- Pinterest REST API.
-- Prepared SQL queries for 'PromotionUpdateRequest' definition.
--


--
-- SELECT template for table `PromotionUpdateRequest`
--
SELECT `discount_status`, `end_time`, `external_id`, `platform_type`, `promotion_code`, `promotion_custom_id`, `promotion_title`, `promotion_type`, `start_time`, `template_values`, `id`, `status` FROM `PromotionUpdateRequest` WHERE 1;

--
-- INSERT template for table `PromotionUpdateRequest`
--
INSERT INTO `PromotionUpdateRequest`(`discount_status`, `end_time`, `external_id`, `platform_type`, `promotion_code`, `promotion_custom_id`, `promotion_title`, `promotion_type`, `start_time`, `template_values`, `id`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PromotionUpdateRequest`
--
UPDATE `PromotionUpdateRequest` SET `discount_status` = ?, `end_time` = ?, `external_id` = ?, `platform_type` = ?, `promotion_code` = ?, `promotion_custom_id` = ?, `promotion_title` = ?, `promotion_type` = ?, `start_time` = ?, `template_values` = ?, `id` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `PromotionUpdateRequest`
--
DELETE FROM `PromotionUpdateRequest` WHERE 0;

