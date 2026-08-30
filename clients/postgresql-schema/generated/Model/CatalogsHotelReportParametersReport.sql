--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsHotelReportParametersReport' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_hotel_report_parameters_report'
--
SELECT feed_id, processing_result_id, report_type, catalog_id FROM catalogs_hotel_report_parameters_report WHERE 1=1;

--
-- INSERT template for table 'catalogs_hotel_report_parameters_report'
--
INSERT INTO catalogs_hotel_report_parameters_report (feed_id, processing_result_id, report_type, catalog_id) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'catalogs_hotel_report_parameters_report'
--
UPDATE catalogs_hotel_report_parameters_report SET feed_id = ?, processing_result_id = ?, report_type = ?, catalog_id = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_hotel_report_parameters_report'
--
DELETE FROM catalogs_hotel_report_parameters_report WHERE 1=2;

