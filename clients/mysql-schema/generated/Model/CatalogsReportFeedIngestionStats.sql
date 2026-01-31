--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsReportFeedIngestionStats' definition.
--


--
-- SELECT template for table `CatalogsReportFeedIngestionStats`
--
SELECT `catalog_id`, `code`, `code_label`, `message`, `occurrences`, `report_type`, `severity` FROM `CatalogsReportFeedIngestionStats` WHERE 1;

--
-- INSERT template for table `CatalogsReportFeedIngestionStats`
--
INSERT INTO `CatalogsReportFeedIngestionStats`(`catalog_id`, `code`, `code_label`, `message`, `occurrences`, `report_type`, `severity`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsReportFeedIngestionStats`
--
UPDATE `CatalogsReportFeedIngestionStats` SET `catalog_id` = ?, `code` = ?, `code_label` = ?, `message` = ?, `occurrences` = ?, `report_type` = ?, `severity` = ? WHERE 1;

--
-- DELETE template for table `CatalogsReportFeedIngestionStats`
--
DELETE FROM `CatalogsReportFeedIngestionStats` WHERE 0;

