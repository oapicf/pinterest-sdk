--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelReportParameters_report' definition.
--


--
-- SELECT template for table `CatalogsHotelReportParameters_report`
--
SELECT `report_type`, `feed_id`, `processing_result_id`, `catalog_id` FROM `CatalogsHotelReportParameters_report` WHERE 1;

--
-- INSERT template for table `CatalogsHotelReportParameters_report`
--
INSERT INTO `CatalogsHotelReportParameters_report`(`report_type`, `feed_id`, `processing_result_id`, `catalog_id`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelReportParameters_report`
--
UPDATE `CatalogsHotelReportParameters_report` SET `report_type` = ?, `feed_id` = ?, `processing_result_id` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelReportParameters_report`
--
DELETE FROM `CatalogsHotelReportParameters_report` WHERE 0;

