--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingTemplateGetResponseData' definition.
--


--
-- SELECT template for table `TargetingTemplateGetResponseData`
--
SELECT `name`, `auto_targeting_enabled`, `targeting_attributes`, `placement_group`, `keywords`, `tracking_urls`, `id`, `created_time`, `updated_time`, `ad_account_id`, `status`, `sizing`, `valid` FROM `TargetingTemplateGetResponseData` WHERE 1;

--
-- INSERT template for table `TargetingTemplateGetResponseData`
--
INSERT INTO `TargetingTemplateGetResponseData`(`name`, `auto_targeting_enabled`, `targeting_attributes`, `placement_group`, `keywords`, `tracking_urls`, `id`, `created_time`, `updated_time`, `ad_account_id`, `status`, `sizing`, `valid`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TargetingTemplateGetResponseData`
--
UPDATE `TargetingTemplateGetResponseData` SET `name` = ?, `auto_targeting_enabled` = ?, `targeting_attributes` = ?, `placement_group` = ?, `keywords` = ?, `tracking_urls` = ?, `id` = ?, `created_time` = ?, `updated_time` = ?, `ad_account_id` = ?, `status` = ?, `sizing` = ?, `valid` = ? WHERE 1;

--
-- DELETE template for table `TargetingTemplateGetResponseData`
--
DELETE FROM `TargetingTemplateGetResponseData` WHERE 0;

