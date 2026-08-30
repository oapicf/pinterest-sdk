--
-- "Pinterest REST API"
-- Prepared SQL queries for 'MMMReportCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'mmm_report_create'
--
SELECT advertiser_ids, "columns", countries, custom_column_ids, end_date, granularity, "level", report_name, start_date, targeting_types FROM mmm_report_create WHERE 1=1;

--
-- INSERT template for table 'mmm_report_create'
--
INSERT INTO mmm_report_create (advertiser_ids, "columns", countries, custom_column_ids, end_date, granularity, "level", report_name, start_date, targeting_types) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'mmm_report_create'
--
UPDATE mmm_report_create SET advertiser_ids = ?, "columns" = ?, countries = ?, custom_column_ids = ?, end_date = ?, granularity = ?, "level" = ?, report_name = ?, start_date = ?, targeting_types = ? WHERE 1=2;

--
-- DELETE template for table 'mmm_report_create'
--
DELETE FROM mmm_report_create WHERE 1=2;

