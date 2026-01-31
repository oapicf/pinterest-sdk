--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingTemplateUpdateRequest' definition.
--


--
-- SELECT template for table `TargetingTemplateUpdateRequest`
--
SELECT `id`, `operation_type`, `targeting_attributes` FROM `TargetingTemplateUpdateRequest` WHERE 1;

--
-- INSERT template for table `TargetingTemplateUpdateRequest`
--
INSERT INTO `TargetingTemplateUpdateRequest`(`id`, `operation_type`, `targeting_attributes`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TargetingTemplateUpdateRequest`
--
UPDATE `TargetingTemplateUpdateRequest` SET `id` = ?, `operation_type` = ?, `targeting_attributes` = ? WHERE 1;

--
-- DELETE template for table `TargetingTemplateUpdateRequest`
--
DELETE FROM `TargetingTemplateUpdateRequest` WHERE 0;

