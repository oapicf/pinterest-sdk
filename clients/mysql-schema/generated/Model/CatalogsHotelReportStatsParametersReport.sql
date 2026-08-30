--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelReportStatsParametersReport' definition.
--


--
-- SELECT template for table `CatalogsHotelReportStatsParametersReport`
--
SELECT `feed_id`, `processing_result_id`, `report_type`, `catalog_id` FROM `CatalogsHotelReportStatsParametersReport` WHERE 1;

--
-- INSERT template for table `CatalogsHotelReportStatsParametersReport`
--
INSERT INTO `CatalogsHotelReportStatsParametersReport`(`feed_id`, `processing_result_id`, `report_type`, `catalog_id`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelReportStatsParametersReport`
--
UPDATE `CatalogsHotelReportStatsParametersReport` SET `feed_id` = ?, `processing_result_id` = ?, `report_type` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelReportStatsParametersReport`
--
DELETE FROM `CatalogsHotelReportStatsParametersReport` WHERE 0;

