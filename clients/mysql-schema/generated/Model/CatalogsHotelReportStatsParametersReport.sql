--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelReportStatsParameters_report' definition.
--


--
-- SELECT template for table `CatalogsHotelReportStatsParameters_report`
--
SELECT `report_type`, `feed_id`, `processing_result_id`, `catalog_id` FROM `CatalogsHotelReportStatsParameters_report` WHERE 1;

--
-- INSERT template for table `CatalogsHotelReportStatsParameters_report`
--
INSERT INTO `CatalogsHotelReportStatsParameters_report`(`report_type`, `feed_id`, `processing_result_id`, `catalog_id`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelReportStatsParameters_report`
--
UPDATE `CatalogsHotelReportStatsParameters_report` SET `report_type` = ?, `feed_id` = ?, `processing_result_id` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelReportStatsParameters_report`
--
DELETE FROM `CatalogsHotelReportStatsParameters_report` WHERE 0;

