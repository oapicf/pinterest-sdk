--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsReportFeedIngestionFilter' definition.
--


--
-- SELECT template for table `CatalogsReportFeedIngestionFilter`
--
SELECT `report_type`, `feed_id`, `processing_result_id` FROM `CatalogsReportFeedIngestionFilter` WHERE 1;

--
-- INSERT template for table `CatalogsReportFeedIngestionFilter`
--
INSERT INTO `CatalogsReportFeedIngestionFilter`(`report_type`, `feed_id`, `processing_result_id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsReportFeedIngestionFilter`
--
UPDATE `CatalogsReportFeedIngestionFilter` SET `report_type` = ?, `feed_id` = ?, `processing_result_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsReportFeedIngestionFilter`
--
DELETE FROM `CatalogsReportFeedIngestionFilter` WHERE 0;

