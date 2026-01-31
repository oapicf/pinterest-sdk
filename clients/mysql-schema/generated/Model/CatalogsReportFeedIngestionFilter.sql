--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsReportFeedIngestionFilter' definition.
--


--
-- SELECT template for table `CatalogsReportFeedIngestionFilter`
--
SELECT `feed_id`, `processing_result_id`, `report_type` FROM `CatalogsReportFeedIngestionFilter` WHERE 1;

--
-- INSERT template for table `CatalogsReportFeedIngestionFilter`
--
INSERT INTO `CatalogsReportFeedIngestionFilter`(`feed_id`, `processing_result_id`, `report_type`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsReportFeedIngestionFilter`
--
UPDATE `CatalogsReportFeedIngestionFilter` SET `feed_id` = ?, `processing_result_id` = ?, `report_type` = ? WHERE 1;

--
-- DELETE template for table `CatalogsReportFeedIngestionFilter`
--
DELETE FROM `CatalogsReportFeedIngestionFilter` WHERE 0;

