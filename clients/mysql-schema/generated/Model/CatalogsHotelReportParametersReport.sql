--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelReportParametersReport' definition.
--


--
-- SELECT template for table `CatalogsHotelReportParametersReport`
--
SELECT `feed_id`, `processing_result_id`, `report_type`, `catalog_id` FROM `CatalogsHotelReportParametersReport` WHERE 1;

--
-- INSERT template for table `CatalogsHotelReportParametersReport`
--
INSERT INTO `CatalogsHotelReportParametersReport`(`feed_id`, `processing_result_id`, `report_type`, `catalog_id`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelReportParametersReport`
--
UPDATE `CatalogsHotelReportParametersReport` SET `feed_id` = ?, `processing_result_id` = ?, `report_type` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelReportParametersReport`
--
DELETE FROM `CatalogsHotelReportParametersReport` WHERE 0;

