--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsReportDistributionIssueFilter' definition.
--


--
-- SELECT template for table `CatalogsReportDistributionIssueFilter`
--
SELECT `catalog_id`, `report_type` FROM `CatalogsReportDistributionIssueFilter` WHERE 1;

--
-- INSERT template for table `CatalogsReportDistributionIssueFilter`
--
INSERT INTO `CatalogsReportDistributionIssueFilter`(`catalog_id`, `report_type`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsReportDistributionIssueFilter`
--
UPDATE `CatalogsReportDistributionIssueFilter` SET `catalog_id` = ?, `report_type` = ? WHERE 1;

--
-- DELETE template for table `CatalogsReportDistributionIssueFilter`
--
DELETE FROM `CatalogsReportDistributionIssueFilter` WHERE 0;

