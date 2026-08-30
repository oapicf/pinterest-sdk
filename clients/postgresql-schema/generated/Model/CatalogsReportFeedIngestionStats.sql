--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsReportFeedIngestionStats' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_report_feed_ingestion_stats'
--
SELECT catalog_id, code, code_label, message, occurrences, report_type, severity FROM catalogs_report_feed_ingestion_stats WHERE 1=1;

--
-- INSERT template for table 'catalogs_report_feed_ingestion_stats'
--
INSERT INTO catalogs_report_feed_ingestion_stats (catalog_id, code, code_label, message, occurrences, report_type, severity) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_report_feed_ingestion_stats'
--
UPDATE catalogs_report_feed_ingestion_stats SET catalog_id = ?, code = ?, code_label = ?, message = ?, occurrences = ?, report_type = ?, severity = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_report_feed_ingestion_stats'
--
DELETE FROM catalogs_report_feed_ingestion_stats WHERE 1=2;

