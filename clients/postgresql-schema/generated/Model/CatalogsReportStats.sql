--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsReportStats' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_report_stats'
--
SELECT catalog_id, code, code_label, message, occurrences, report_type, severity, ineligible_for_ads, ineligible_for_organic FROM catalogs_report_stats WHERE 1=1;

--
-- INSERT template for table 'catalogs_report_stats'
--
INSERT INTO catalogs_report_stats (catalog_id, code, code_label, message, occurrences, report_type, severity, ineligible_for_ads, ineligible_for_organic) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_report_stats'
--
UPDATE catalogs_report_stats SET catalog_id = ?, code = ?, code_label = ?, message = ?, occurrences = ?, report_type = ?, severity = ?, ineligible_for_ads = ?, ineligible_for_organic = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_report_stats'
--
DELETE FROM catalogs_report_stats WHERE 1=2;

