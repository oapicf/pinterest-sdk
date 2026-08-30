--
-- Pinterest REST API.
-- Prepared SQL queries for 'Promotion' definition.
--


--
-- SELECT template for table `Promotion`
--
SELECT `ad_account_id`, `discount_status`, `end_time`, `external_id`, `id`, `platform_type`, `promotion_code`, `promotion_custom_id`, `promotion_title`, `promotion_type`, `start_time`, `status`, `template_values` FROM `Promotion` WHERE 1;

--
-- INSERT template for table `Promotion`
--
INSERT INTO `Promotion`(`ad_account_id`, `discount_status`, `end_time`, `external_id`, `id`, `platform_type`, `promotion_code`, `promotion_custom_id`, `promotion_title`, `promotion_type`, `start_time`, `status`, `template_values`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Promotion`
--
UPDATE `Promotion` SET `ad_account_id` = ?, `discount_status` = ?, `end_time` = ?, `external_id` = ?, `id` = ?, `platform_type` = ?, `promotion_code` = ?, `promotion_custom_id` = ?, `promotion_title` = ?, `promotion_type` = ?, `start_time` = ?, `status` = ?, `template_values` = ? WHERE 1;

--
-- DELETE template for table `Promotion`
--
DELETE FROM `Promotion` WHERE 0;

