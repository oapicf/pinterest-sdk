--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsReport' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_report'
--
SELECT report_status, "size", url FROM catalogs_report WHERE 1=1;

--
-- INSERT template for table 'catalogs_report'
--
INSERT INTO catalogs_report (report_status, "size", url) VALUES (?, ?, ?);

--
-- UPDATE template for table 'catalogs_report'
--
UPDATE catalogs_report SET report_status = ?, "size" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_report'
--
DELETE FROM catalogs_report WHERE 1=2;

