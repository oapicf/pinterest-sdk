--
-- Pinterest REST API.
-- Prepared SQL queries for 'CreateMMMReportRequest' definition.
--


--
-- SELECT template for table `CreateMMMReportRequest`
--
SELECT `countries`, `report_name`, `start_date`, `end_date`, `granularity`, `level`, `targeting_types`, `columns` FROM `CreateMMMReportRequest` WHERE 1;

--
-- INSERT template for table `CreateMMMReportRequest`
--
INSERT INTO `CreateMMMReportRequest`(`countries`, `report_name`, `start_date`, `end_date`, `granularity`, `level`, `targeting_types`, `columns`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateMMMReportRequest`
--
UPDATE `CreateMMMReportRequest` SET `countries` = ?, `report_name` = ?, `start_date` = ?, `end_date` = ?, `granularity` = ?, `level` = ?, `targeting_types` = ?, `columns` = ? WHERE 1;

--
-- DELETE template for table `CreateMMMReportRequest`
--
DELETE FROM `CreateMMMReportRequest` WHERE 0;

