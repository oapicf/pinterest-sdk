--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LeadsExports' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'leads_exports'
--
SELECT leads_export_id FROM leads_exports WHERE 1=1;

--
-- INSERT template for table 'leads_exports'
--
INSERT INTO leads_exports (leads_export_id) VALUES (?);

--
-- UPDATE template for table 'leads_exports'
--
UPDATE leads_exports SET leads_export_id = ? WHERE 1=2;

--
-- DELETE template for table 'leads_exports'
--
DELETE FROM leads_exports WHERE 1=2;

