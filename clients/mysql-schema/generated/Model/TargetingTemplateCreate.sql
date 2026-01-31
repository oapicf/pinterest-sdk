--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingTemplateCreate' definition.
--


--
-- SELECT template for table `TargetingTemplateCreate`
--
SELECT `auto_targeting_enabled`, `keywords`, `name`, `placement_group`, `targeting_attributes`, `tracking_urls` FROM `TargetingTemplateCreate` WHERE 1;

--
-- INSERT template for table `TargetingTemplateCreate`
--
INSERT INTO `TargetingTemplateCreate`(`auto_targeting_enabled`, `keywords`, `name`, `placement_group`, `targeting_attributes`, `tracking_urls`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TargetingTemplateCreate`
--
UPDATE `TargetingTemplateCreate` SET `auto_targeting_enabled` = ?, `keywords` = ?, `name` = ?, `placement_group` = ?, `targeting_attributes` = ?, `tracking_urls` = ? WHERE 1;

--
-- DELETE template for table `TargetingTemplateCreate`
--
DELETE FROM `TargetingTemplateCreate` WHERE 0;

