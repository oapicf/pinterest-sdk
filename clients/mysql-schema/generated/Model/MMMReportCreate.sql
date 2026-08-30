--
-- Pinterest REST API.
-- Prepared SQL queries for 'MMMReportCreate' definition.
--


--
-- SELECT template for table `MMMReportCreate`
--
SELECT `advertiser_ids`, `columns`, `countries`, `custom_column_ids`, `end_date`, `granularity`, `level`, `report_name`, `start_date`, `targeting_types` FROM `MMMReportCreate` WHERE 1;

--
-- INSERT template for table `MMMReportCreate`
--
INSERT INTO `MMMReportCreate`(`advertiser_ids`, `columns`, `countries`, `custom_column_ids`, `end_date`, `granularity`, `level`, `report_name`, `start_date`, `targeting_types`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `MMMReportCreate`
--
UPDATE `MMMReportCreate` SET `advertiser_ids` = ?, `columns` = ?, `countries` = ?, `custom_column_ids` = ?, `end_date` = ?, `granularity` = ?, `level` = ?, `report_name` = ?, `start_date` = ?, `targeting_types` = ? WHERE 1;

--
-- DELETE template for table `MMMReportCreate`
--
DELETE FROM `MMMReportCreate` WHERE 0;

