--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingTemplateResponseData' definition.
--


--
-- SELECT template for table `TargetingTemplateResponseData`
--
SELECT `auto_targeting_enabled`, `keywords`, `name`, `placement_group`, `targeting_attributes`, `tracking_urls`, `ad_account_id`, `created_time`, `id`, `sizing`, `status`, `updated_time` FROM `TargetingTemplateResponseData` WHERE 1;

--
-- INSERT template for table `TargetingTemplateResponseData`
--
INSERT INTO `TargetingTemplateResponseData`(`auto_targeting_enabled`, `keywords`, `name`, `placement_group`, `targeting_attributes`, `tracking_urls`, `ad_account_id`, `created_time`, `id`, `sizing`, `status`, `updated_time`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TargetingTemplateResponseData`
--
UPDATE `TargetingTemplateResponseData` SET `auto_targeting_enabled` = ?, `keywords` = ?, `name` = ?, `placement_group` = ?, `targeting_attributes` = ?, `tracking_urls` = ?, `ad_account_id` = ?, `created_time` = ?, `id` = ?, `sizing` = ?, `status` = ?, `updated_time` = ? WHERE 1;

--
-- DELETE template for table `TargetingTemplateResponseData`
--
DELETE FROM `TargetingTemplateResponseData` WHERE 0;

