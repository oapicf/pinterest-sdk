--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingTemplateUpdateRequest' definition.
--


--
-- SELECT template for table `TargetingTemplateUpdateRequest`
--
SELECT `operation_type`, `id` FROM `TargetingTemplateUpdateRequest` WHERE 1;

--
-- INSERT template for table `TargetingTemplateUpdateRequest`
--
INSERT INTO `TargetingTemplateUpdateRequest`(`operation_type`, `id`) VALUES (?, ?);

--
-- UPDATE template for table `TargetingTemplateUpdateRequest`
--
UPDATE `TargetingTemplateUpdateRequest` SET `operation_type` = ?, `id` = ? WHERE 1;

--
-- DELETE template for table `TargetingTemplateUpdateRequest`
--
DELETE FROM `TargetingTemplateUpdateRequest` WHERE 0;

