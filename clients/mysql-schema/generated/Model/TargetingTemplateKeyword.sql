--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingTemplateKeyword' definition.
--


--
-- SELECT template for table `TargetingTemplateKeyword`
--
SELECT `match_type`, `value` FROM `TargetingTemplateKeyword` WHERE 1;

--
-- INSERT template for table `TargetingTemplateKeyword`
--
INSERT INTO `TargetingTemplateKeyword`(`match_type`, `value`) VALUES (?, ?);

--
-- UPDATE template for table `TargetingTemplateKeyword`
--
UPDATE `TargetingTemplateKeyword` SET `match_type` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `TargetingTemplateKeyword`
--
DELETE FROM `TargetingTemplateKeyword` WHERE 0;

