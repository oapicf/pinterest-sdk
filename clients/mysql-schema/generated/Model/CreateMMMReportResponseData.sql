--
-- Pinterest REST API.
-- Prepared SQL queries for 'CreateMMMReportResponseData' definition.
--


--
-- SELECT template for table `CreateMMMReportResponseData`
--
SELECT `message`, `report_status`, `status`, `token` FROM `CreateMMMReportResponseData` WHERE 1;

--
-- INSERT template for table `CreateMMMReportResponseData`
--
INSERT INTO `CreateMMMReportResponseData`(`message`, `report_status`, `status`, `token`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CreateMMMReportResponseData`
--
UPDATE `CreateMMMReportResponseData` SET `message` = ?, `report_status` = ?, `status` = ?, `token` = ? WHERE 1;

--
-- DELETE template for table `CreateMMMReportResponseData`
--
DELETE FROM `CreateMMMReportResponseData` WHERE 0;

