--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingTemplateUpdateRequestReadOrUpdate' definition.
--


--
-- SELECT template for table `TargetingTemplateUpdateRequestReadOrUpdate`
--
SELECT `id`, `operation_type`, `targeting_attributes` FROM `TargetingTemplateUpdateRequestReadOrUpdate` WHERE 1;

--
-- INSERT template for table `TargetingTemplateUpdateRequestReadOrUpdate`
--
INSERT INTO `TargetingTemplateUpdateRequestReadOrUpdate`(`id`, `operation_type`, `targeting_attributes`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TargetingTemplateUpdateRequestReadOrUpdate`
--
UPDATE `TargetingTemplateUpdateRequestReadOrUpdate` SET `id` = ?, `operation_type` = ?, `targeting_attributes` = ? WHERE 1;

--
-- DELETE template for table `TargetingTemplateUpdateRequestReadOrUpdate`
--
DELETE FROM `TargetingTemplateUpdateRequestReadOrUpdate` WHERE 0;

