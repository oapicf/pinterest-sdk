--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingTemplateCommon' definition.
--


--
-- SELECT template for table `TargetingTemplateCommon`
--
SELECT `name`, `auto_targeting_enabled`, `targeting_attributes`, `placement_group`, `keywords`, `tracking_urls` FROM `TargetingTemplateCommon` WHERE 1;

--
-- INSERT template for table `TargetingTemplateCommon`
--
INSERT INTO `TargetingTemplateCommon`(`name`, `auto_targeting_enabled`, `targeting_attributes`, `placement_group`, `keywords`, `tracking_urls`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TargetingTemplateCommon`
--
UPDATE `TargetingTemplateCommon` SET `name` = ?, `auto_targeting_enabled` = ?, `targeting_attributes` = ?, `placement_group` = ?, `keywords` = ?, `tracking_urls` = ? WHERE 1;

--
-- DELETE template for table `TargetingTemplateCommon`
--
DELETE FROM `TargetingTemplateCommon` WHERE 0;

