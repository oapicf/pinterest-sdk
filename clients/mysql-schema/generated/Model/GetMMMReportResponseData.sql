--
-- Pinterest REST API.
-- Prepared SQL queries for 'GetMMMReportResponseData' definition.
--


--
-- SELECT template for table `GetMMMReportResponseData`
--
SELECT `report_status`, `url`, `size` FROM `GetMMMReportResponseData` WHERE 1;

--
-- INSERT template for table `GetMMMReportResponseData`
--
INSERT INTO `GetMMMReportResponseData`(`report_status`, `url`, `size`) VALUES (?, ?, ?);

--
-- UPDATE template for table `GetMMMReportResponseData`
--
UPDATE `GetMMMReportResponseData` SET `report_status` = ?, `url` = ?, `size` = ? WHERE 1;

--
-- DELETE template for table `GetMMMReportResponseData`
--
DELETE FROM `GetMMMReportResponseData` WHERE 0;

