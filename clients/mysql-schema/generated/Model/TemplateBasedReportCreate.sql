--
-- Pinterest REST API.
-- Prepared SQL queries for 'TemplateBasedReportCreate' definition.
--


--
-- SELECT template for table `TemplateBasedReportCreate`
--
SELECT `message`, `report_status`, `token` FROM `TemplateBasedReportCreate` WHERE 1;

--
-- INSERT template for table `TemplateBasedReportCreate`
--
INSERT INTO `TemplateBasedReportCreate`(`message`, `report_status`, `token`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TemplateBasedReportCreate`
--
UPDATE `TemplateBasedReportCreate` SET `message` = ?, `report_status` = ?, `token` = ? WHERE 1;

--
-- DELETE template for table `TemplateBasedReportCreate`
--
DELETE FROM `TemplateBasedReportCreate` WHERE 0;

