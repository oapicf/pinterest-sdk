--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LeadsExportsCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'leads_exports_create'
--
SELECT ad_id, end_date, start_date FROM leads_exports_create WHERE 1=1;

--
-- INSERT template for table 'leads_exports_create'
--
INSERT INTO leads_exports_create (ad_id, end_date, start_date) VALUES (?, ?, ?);

--
-- UPDATE template for table 'leads_exports_create'
--
UPDATE leads_exports_create SET ad_id = ?, end_date = ?, start_date = ? WHERE 1=2;

--
-- DELETE template for table 'leads_exports_create'
--
DELETE FROM leads_exports_create WHERE 1=2;

