--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsReportDistributionStats' definition.
--


--
-- SELECT template for table `CatalogsReportDistributionStats`
--
SELECT `report_type`, `catalog_id`, `code`, `code_label`, `message`, `occurrences`, `ineligible_for_ads`, `ineligible_for_organic` FROM `CatalogsReportDistributionStats` WHERE 1;

--
-- INSERT template for table `CatalogsReportDistributionStats`
--
INSERT INTO `CatalogsReportDistributionStats`(`report_type`, `catalog_id`, `code`, `code_label`, `message`, `occurrences`, `ineligible_for_ads`, `ineligible_for_organic`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsReportDistributionStats`
--
UPDATE `CatalogsReportDistributionStats` SET `report_type` = ?, `catalog_id` = ?, `code` = ?, `code_label` = ?, `message` = ?, `occurrences` = ?, `ineligible_for_ads` = ?, `ineligible_for_organic` = ? WHERE 1;

--
-- DELETE template for table `CatalogsReportDistributionStats`
--
DELETE FROM `CatalogsReportDistributionStats` WHERE 0;

