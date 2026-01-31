--
-- Pinterest REST API.
-- Prepared SQL queries for 'PromotionResponse' definition.
--


--
-- SELECT template for table `PromotionResponse`
--
SELECT `discount_status`, `end_time`, `external_id`, `platform_type`, `promotion_code`, `promotion_custom_id`, `promotion_title`, `promotion_type`, `start_time`, `template_values`, `ad_account_id`, `id`, `status` FROM `PromotionResponse` WHERE 1;

--
-- INSERT template for table `PromotionResponse`
--
INSERT INTO `PromotionResponse`(`discount_status`, `end_time`, `external_id`, `platform_type`, `promotion_code`, `promotion_custom_id`, `promotion_title`, `promotion_type`, `start_time`, `template_values`, `ad_account_id`, `id`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PromotionResponse`
--
UPDATE `PromotionResponse` SET `discount_status` = ?, `end_time` = ?, `external_id` = ?, `platform_type` = ?, `promotion_code` = ?, `promotion_custom_id` = ?, `promotion_title` = ?, `promotion_type` = ?, `start_time` = ?, `template_values` = ?, `ad_account_id` = ?, `id` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `PromotionResponse`
--
DELETE FROM `PromotionResponse` WHERE 0;

