--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsHotelReportParameters' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_hotel_report_parameters'
--
SELECT catalog_type, report FROM catalogs_hotel_report_parameters WHERE 1=1;

--
-- INSERT template for table 'catalogs_hotel_report_parameters'
--
INSERT INTO catalogs_hotel_report_parameters (catalog_type, report) VALUES (?, ?);

--
-- UPDATE template for table 'catalogs_hotel_report_parameters'
--
UPDATE catalogs_hotel_report_parameters SET catalog_type = ?, report = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_hotel_report_parameters'
--
DELETE FROM catalogs_hotel_report_parameters WHERE 1=2;

