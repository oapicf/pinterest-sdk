--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingTemplateAudienceSizing' definition.
--


--
-- SELECT template for table `TargetingTemplateAudienceSizing`
--
SELECT `reach_estimate` FROM `TargetingTemplateAudienceSizing` WHERE 1;

--
-- INSERT template for table `TargetingTemplateAudienceSizing`
--
INSERT INTO `TargetingTemplateAudienceSizing`(`reach_estimate`) VALUES (?);

--
-- UPDATE template for table `TargetingTemplateAudienceSizing`
--
UPDATE `TargetingTemplateAudienceSizing` SET `reach_estimate` = ? WHERE 1;

--
-- DELETE template for table `TargetingTemplateAudienceSizing`
--
DELETE FROM `TargetingTemplateAudienceSizing` WHERE 0;

