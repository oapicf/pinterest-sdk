--
-- Pinterest REST API.
-- Prepared SQL queries for 'GetMMMReportResponse' definition.
--


--
-- SELECT template for table `GetMMMReportResponse`
--
SELECT `code`, `data`, `message`, `status` FROM `GetMMMReportResponse` WHERE 1;

--
-- INSERT template for table `GetMMMReportResponse`
--
INSERT INTO `GetMMMReportResponse`(`code`, `data`, `message`, `status`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `GetMMMReportResponse`
--
UPDATE `GetMMMReportResponse` SET `code` = ?, `data` = ?, `message` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `GetMMMReportResponse`
--
DELETE FROM `GetMMMReportResponse` WHERE 0;

