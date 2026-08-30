--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailReportParametersReport' definition.
--


--
-- SELECT template for table `CatalogsRetailReportParametersReport`
--
SELECT `feed_id`, `processing_result_id`, `report_type`, `catalog_id`, `product_group_id` FROM `CatalogsRetailReportParametersReport` WHERE 1;

--
-- INSERT template for table `CatalogsRetailReportParametersReport`
--
INSERT INTO `CatalogsRetailReportParametersReport`(`feed_id`, `processing_result_id`, `report_type`, `catalog_id`, `product_group_id`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailReportParametersReport`
--
UPDATE `CatalogsRetailReportParametersReport` SET `feed_id` = ?, `processing_result_id` = ?, `report_type` = ?, `catalog_id` = ?, `product_group_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailReportParametersReport`
--
DELETE FROM `CatalogsRetailReportParametersReport` WHERE 0;

