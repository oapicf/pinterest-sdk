--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LeadsExportResponseData' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'leads_export_response_data'
--
SELECT download_url, export_status FROM leads_export_response_data WHERE 1=1;

--
-- INSERT template for table 'leads_export_response_data'
--
INSERT INTO leads_export_response_data (download_url, export_status) VALUES (?, ?);

--
-- UPDATE template for table 'leads_export_response_data'
--
UPDATE leads_export_response_data SET download_url = ?, export_status = ? WHERE 1=2;

--
-- DELETE template for table 'leads_export_response_data'
--
DELETE FROM leads_export_response_data WHERE 1=2;

