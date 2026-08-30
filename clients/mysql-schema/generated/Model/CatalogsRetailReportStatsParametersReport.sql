--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailReportStatsParametersReport' definition.
--


--
-- SELECT template for table `CatalogsRetailReportStatsParametersReport`
--
SELECT `feed_id`, `processing_result_id`, `report_type`, `catalog_id` FROM `CatalogsRetailReportStatsParametersReport` WHERE 1;

--
-- INSERT template for table `CatalogsRetailReportStatsParametersReport`
--
INSERT INTO `CatalogsRetailReportStatsParametersReport`(`feed_id`, `processing_result_id`, `report_type`, `catalog_id`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailReportStatsParametersReport`
--
UPDATE `CatalogsRetailReportStatsParametersReport` SET `feed_id` = ?, `processing_result_id` = ?, `report_type` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailReportStatsParametersReport`
--
DELETE FROM `CatalogsRetailReportStatsParametersReport` WHERE 0;

