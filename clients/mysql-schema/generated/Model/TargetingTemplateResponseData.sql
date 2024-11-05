--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingTemplateResponseData' definition.
--


--
-- SELECT template for table `TargetingTemplateResponseData`
--
SELECT `name`, `auto_targeting_enabled`, `targeting_attributes`, `placement_group`, `keywords`, `tracking_urls`, `id`, `created_time`, `updated_time`, `ad_account_id`, `status`, `sizing` FROM `TargetingTemplateResponseData` WHERE 1;

--
-- INSERT template for table `TargetingTemplateResponseData`
--
INSERT INTO `TargetingTemplateResponseData`(`name`, `auto_targeting_enabled`, `targeting_attributes`, `placement_group`, `keywords`, `tracking_urls`, `id`, `created_time`, `updated_time`, `ad_account_id`, `status`, `sizing`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TargetingTemplateResponseData`
--
UPDATE `TargetingTemplateResponseData` SET `name` = ?, `auto_targeting_enabled` = ?, `targeting_attributes` = ?, `placement_group` = ?, `keywords` = ?, `tracking_urls` = ?, `id` = ?, `created_time` = ?, `updated_time` = ?, `ad_account_id` = ?, `status` = ?, `sizing` = ? WHERE 1;

--
-- DELETE template for table `TargetingTemplateResponseData`
--
DELETE FROM `TargetingTemplateResponseData` WHERE 0;

