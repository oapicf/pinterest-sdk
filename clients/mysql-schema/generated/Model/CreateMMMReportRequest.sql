--
-- Pinterest REST API.
-- Prepared SQL queries for 'CreateMMMReportRequest' definition.
--


--
-- SELECT template for table `CreateMMMReportRequest`
--
SELECT `countries`, `columns`, `end_date`, `granularity`, `level`, `report_name`, `start_date`, `targeting_types` FROM `CreateMMMReportRequest` WHERE 1;

--
-- INSERT template for table `CreateMMMReportRequest`
--
INSERT INTO `CreateMMMReportRequest`(`countries`, `columns`, `end_date`, `granularity`, `level`, `report_name`, `start_date`, `targeting_types`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateMMMReportRequest`
--
UPDATE `CreateMMMReportRequest` SET `countries` = ?, `columns` = ?, `end_date` = ?, `granularity` = ?, `level` = ?, `report_name` = ?, `start_date` = ?, `targeting_types` = ? WHERE 1;

--
-- DELETE template for table `CreateMMMReportRequest`
--
DELETE FROM `CreateMMMReportRequest` WHERE 0;

