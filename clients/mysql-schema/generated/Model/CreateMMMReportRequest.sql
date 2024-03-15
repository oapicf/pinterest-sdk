--
-- Pinterest REST API.
-- Prepared SQL queries for 'CreateMMMReportRequest' definition.
--


--
-- SELECT template for table `CreateMMMReportRequest`
--
SELECT `report_name`, `start_date`, `end_date`, `granularity`, `level`, `targeting_types`, `columns`, `countries` FROM `CreateMMMReportRequest` WHERE 1;

--
-- INSERT template for table `CreateMMMReportRequest`
--
INSERT INTO `CreateMMMReportRequest`(`report_name`, `start_date`, `end_date`, `granularity`, `level`, `targeting_types`, `columns`, `countries`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CreateMMMReportRequest`
--
UPDATE `CreateMMMReportRequest` SET `report_name` = ?, `start_date` = ?, `end_date` = ?, `granularity` = ?, `level` = ?, `targeting_types` = ?, `columns` = ?, `countries` = ? WHERE 1;

--
-- DELETE template for table `CreateMMMReportRequest`
--
DELETE FROM `CreateMMMReportRequest` WHERE 0;

