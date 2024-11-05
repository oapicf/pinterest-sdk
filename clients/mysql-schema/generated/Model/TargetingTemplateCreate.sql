--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingTemplateCreate' definition.
--


--
-- SELECT template for table `TargetingTemplateCreate`
--
SELECT `name`, `auto_targeting_enabled`, `targeting_attributes`, `placement_group`, `keywords`, `tracking_urls` FROM `TargetingTemplateCreate` WHERE 1;

--
-- INSERT template for table `TargetingTemplateCreate`
--
INSERT INTO `TargetingTemplateCreate`(`name`, `auto_targeting_enabled`, `targeting_attributes`, `placement_group`, `keywords`, `tracking_urls`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TargetingTemplateCreate`
--
UPDATE `TargetingTemplateCreate` SET `name` = ?, `auto_targeting_enabled` = ?, `targeting_attributes` = ?, `placement_group` = ?, `keywords` = ?, `tracking_urls` = ? WHERE 1;

--
-- DELETE template for table `TargetingTemplateCreate`
--
DELETE FROM `TargetingTemplateCreate` WHERE 0;

