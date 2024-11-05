--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsReportStats' definition.
--


--
-- SELECT template for table `CatalogsReportStats`
--
SELECT `report_type`, `catalog_id`, `code`, `code_label`, `message`, `occurrences`, `severity`, `ineligible_for_ads`, `ineligible_for_organic` FROM `CatalogsReportStats` WHERE 1;

--
-- INSERT template for table `CatalogsReportStats`
--
INSERT INTO `CatalogsReportStats`(`report_type`, `catalog_id`, `code`, `code_label`, `message`, `occurrences`, `severity`, `ineligible_for_ads`, `ineligible_for_organic`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsReportStats`
--
UPDATE `CatalogsReportStats` SET `report_type` = ?, `catalog_id` = ?, `code` = ?, `code_label` = ?, `message` = ?, `occurrences` = ?, `severity` = ?, `ineligible_for_ads` = ?, `ineligible_for_organic` = ? WHERE 1;

--
-- DELETE template for table `CatalogsReportStats`
--
DELETE FROM `CatalogsReportStats` WHERE 0;

