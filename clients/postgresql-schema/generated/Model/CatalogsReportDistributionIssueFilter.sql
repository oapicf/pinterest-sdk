--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsReportDistributionIssueFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_report_distribution_issue_filter'
--
SELECT catalog_id, report_type FROM catalogs_report_distribution_issue_filter WHERE 1=1;

--
-- INSERT template for table 'catalogs_report_distribution_issue_filter'
--
INSERT INTO catalogs_report_distribution_issue_filter (catalog_id, report_type) VALUES (?, ?);

--
-- UPDATE template for table 'catalogs_report_distribution_issue_filter'
--
UPDATE catalogs_report_distribution_issue_filter SET catalog_id = ?, report_type = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_report_distribution_issue_filter'
--
DELETE FROM catalogs_report_distribution_issue_filter WHERE 1=2;

