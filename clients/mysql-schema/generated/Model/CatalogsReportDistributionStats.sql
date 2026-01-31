--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsReportDistributionStats' definition.
--


--
-- SELECT template for table `CatalogsReportDistributionStats`
--
SELECT `catalog_id`, `code`, `code_label`, `ineligible_for_ads`, `ineligible_for_organic`, `message`, `occurrences`, `report_type` FROM `CatalogsReportDistributionStats` WHERE 1;

--
-- INSERT template for table `CatalogsReportDistributionStats`
--
INSERT INTO `CatalogsReportDistributionStats`(`catalog_id`, `code`, `code_label`, `ineligible_for_ads`, `ineligible_for_organic`, `message`, `occurrences`, `report_type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsReportDistributionStats`
--
UPDATE `CatalogsReportDistributionStats` SET `catalog_id` = ?, `code` = ?, `code_label` = ?, `ineligible_for_ads` = ?, `ineligible_for_organic` = ?, `message` = ?, `occurrences` = ?, `report_type` = ? WHERE 1;

--
-- DELETE template for table `CatalogsReportDistributionStats`
--
DELETE FROM `CatalogsReportDistributionStats` WHERE 0;

