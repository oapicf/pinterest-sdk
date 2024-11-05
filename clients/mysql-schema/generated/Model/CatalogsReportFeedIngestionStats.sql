--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsReportFeedIngestionStats' definition.
--


--
-- SELECT template for table `CatalogsReportFeedIngestionStats`
--
SELECT `report_type`, `catalog_id`, `code`, `code_label`, `message`, `occurrences`, `severity` FROM `CatalogsReportFeedIngestionStats` WHERE 1;

--
-- INSERT template for table `CatalogsReportFeedIngestionStats`
--
INSERT INTO `CatalogsReportFeedIngestionStats`(`report_type`, `catalog_id`, `code`, `code_label`, `message`, `occurrences`, `severity`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsReportFeedIngestionStats`
--
UPDATE `CatalogsReportFeedIngestionStats` SET `report_type` = ?, `catalog_id` = ?, `code` = ?, `code_label` = ?, `message` = ?, `occurrences` = ?, `severity` = ? WHERE 1;

--
-- DELETE template for table `CatalogsReportFeedIngestionStats`
--
DELETE FROM `CatalogsReportFeedIngestionStats` WHERE 0;

