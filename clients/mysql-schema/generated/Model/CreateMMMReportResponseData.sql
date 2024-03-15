--
-- Pinterest REST API.
-- Prepared SQL queries for 'CreateMMMReportResponseData' definition.
--


--
-- SELECT template for table `CreateMMMReportResponseData`
--
SELECT `report_status`, `token`, `message`, `status` FROM `CreateMMMReportResponseData` WHERE 1;

--
-- INSERT template for table `CreateMMMReportResponseData`
--
INSERT INTO `CreateMMMReportResponseData`(`report_status`, `token`, `message`, `status`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CreateMMMReportResponseData`
--
UPDATE `CreateMMMReportResponseData` SET `report_status` = ?, `token` = ?, `message` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CreateMMMReportResponseData`
--
DELETE FROM `CreateMMMReportResponseData` WHERE 0;

