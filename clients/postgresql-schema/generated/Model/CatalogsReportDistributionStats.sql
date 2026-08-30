--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsReportDistributionStats' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_report_distribution_stats'
--
SELECT catalog_id, code, code_label, ineligible_for_ads, ineligible_for_organic, message, occurrences, report_type FROM catalogs_report_distribution_stats WHERE 1=1;

--
-- INSERT template for table 'catalogs_report_distribution_stats'
--
INSERT INTO catalogs_report_distribution_stats (catalog_id, code, code_label, ineligible_for_ads, ineligible_for_organic, message, occurrences, report_type) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_report_distribution_stats'
--
UPDATE catalogs_report_distribution_stats SET catalog_id = ?, code = ?, code_label = ?, ineligible_for_ads = ?, ineligible_for_organic = ?, message = ?, occurrences = ?, report_type = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_report_distribution_stats'
--
DELETE FROM catalogs_report_distribution_stats WHERE 1=2;

