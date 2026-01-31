--
-- Pinterest REST API.
-- Prepared SQL queries for 'TemplateBasedReport' definition.
--


--
-- SELECT template for table `TemplateBasedReport`
--
SELECT `message`, `report_status`, `template_id`, `token` FROM `TemplateBasedReport` WHERE 1;

--
-- INSERT template for table `TemplateBasedReport`
--
INSERT INTO `TemplateBasedReport`(`message`, `report_status`, `template_id`, `token`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `TemplateBasedReport`
--
UPDATE `TemplateBasedReport` SET `message` = ?, `report_status` = ?, `template_id` = ?, `token` = ? WHERE 1;

--
-- DELETE template for table `TemplateBasedReport`
--
DELETE FROM `TemplateBasedReport` WHERE 0;

