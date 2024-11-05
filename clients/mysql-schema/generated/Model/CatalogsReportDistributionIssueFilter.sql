--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsReportDistributionIssueFilter' definition.
--


--
-- SELECT template for table `CatalogsReportDistributionIssueFilter`
--
SELECT `report_type`, `catalog_id` FROM `CatalogsReportDistributionIssueFilter` WHERE 1;

--
-- INSERT template for table `CatalogsReportDistributionIssueFilter`
--
INSERT INTO `CatalogsReportDistributionIssueFilter`(`report_type`, `catalog_id`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsReportDistributionIssueFilter`
--
UPDATE `CatalogsReportDistributionIssueFilter` SET `report_type` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsReportDistributionIssueFilter`
--
DELETE FROM `CatalogsReportDistributionIssueFilter` WHERE 0;

