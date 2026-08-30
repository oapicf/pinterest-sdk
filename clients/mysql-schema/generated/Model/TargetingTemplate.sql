--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingTemplate' definition.
--


--
-- SELECT template for table `TargetingTemplate`
--
SELECT `ad_account_id`, `auto_targeting_enabled`, `created_time`, `id`, `keywords`, `name`, `placement_group`, `sizing`, `status`, `targeting_attributes`, `tracking_urls`, `updated_time`, `valid` FROM `TargetingTemplate` WHERE 1;

--
-- INSERT template for table `TargetingTemplate`
--
INSERT INTO `TargetingTemplate`(`ad_account_id`, `auto_targeting_enabled`, `created_time`, `id`, `keywords`, `name`, `placement_group`, `sizing`, `status`, `targeting_attributes`, `tracking_urls`, `updated_time`, `valid`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TargetingTemplate`
--
UPDATE `TargetingTemplate` SET `ad_account_id` = ?, `auto_targeting_enabled` = ?, `created_time` = ?, `id` = ?, `keywords` = ?, `name` = ?, `placement_group` = ?, `sizing` = ?, `status` = ?, `targeting_attributes` = ?, `tracking_urls` = ?, `updated_time` = ?, `valid` = ? WHERE 1;

--
-- DELETE template for table `TargetingTemplate`
--
DELETE FROM `TargetingTemplate` WHERE 0;

