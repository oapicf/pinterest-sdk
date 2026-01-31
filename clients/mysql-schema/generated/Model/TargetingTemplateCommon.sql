--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingTemplateCommon' definition.
--


--
-- SELECT template for table `TargetingTemplateCommon`
--
SELECT `auto_targeting_enabled`, `keywords`, `name`, `placement_group`, `targeting_attributes`, `tracking_urls` FROM `TargetingTemplateCommon` WHERE 1;

--
-- INSERT template for table `TargetingTemplateCommon`
--
INSERT INTO `TargetingTemplateCommon`(`auto_targeting_enabled`, `keywords`, `name`, `placement_group`, `targeting_attributes`, `tracking_urls`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TargetingTemplateCommon`
--
UPDATE `TargetingTemplateCommon` SET `auto_targeting_enabled` = ?, `keywords` = ?, `name` = ?, `placement_group` = ?, `targeting_attributes` = ?, `tracking_urls` = ? WHERE 1;

--
-- DELETE template for table `TargetingTemplateCommon`
--
DELETE FROM `TargetingTemplateCommon` WHERE 0;

