--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsReportFeedIngestionFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_report_feed_ingestion_filter'
--
SELECT feed_id, processing_result_id, report_type FROM catalogs_report_feed_ingestion_filter WHERE 1=1;

--
-- INSERT template for table 'catalogs_report_feed_ingestion_filter'
--
INSERT INTO catalogs_report_feed_ingestion_filter (feed_id, processing_result_id, report_type) VALUES (?, ?, ?);

--
-- UPDATE template for table 'catalogs_report_feed_ingestion_filter'
--
UPDATE catalogs_report_feed_ingestion_filter SET feed_id = ?, processing_result_id = ?, report_type = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_report_feed_ingestion_filter'
--
DELETE FROM catalogs_report_feed_ingestion_filter WHERE 1=2;

