--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingTemplateGetResponseData' definition.
--


--
-- SELECT template for table `TargetingTemplateGetResponseData`
--
SELECT `auto_targeting_enabled`, `keywords`, `name`, `placement_group`, `targeting_attributes`, `tracking_urls`, `ad_account_id`, `created_time`, `id`, `sizing`, `status`, `updated_time`, `valid` FROM `TargetingTemplateGetResponseData` WHERE 1;

--
-- INSERT template for table `TargetingTemplateGetResponseData`
--
INSERT INTO `TargetingTemplateGetResponseData`(`auto_targeting_enabled`, `keywords`, `name`, `placement_group`, `targeting_attributes`, `tracking_urls`, `ad_account_id`, `created_time`, `id`, `sizing`, `status`, `updated_time`, `valid`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TargetingTemplateGetResponseData`
--
UPDATE `TargetingTemplateGetResponseData` SET `auto_targeting_enabled` = ?, `keywords` = ?, `name` = ?, `placement_group` = ?, `targeting_attributes` = ?, `tracking_urls` = ?, `ad_account_id` = ?, `created_time` = ?, `id` = ?, `sizing` = ?, `status` = ?, `updated_time` = ?, `valid` = ? WHERE 1;

--
-- DELETE template for table `TargetingTemplateGetResponseData`
--
DELETE FROM `TargetingTemplateGetResponseData` WHERE 0;

