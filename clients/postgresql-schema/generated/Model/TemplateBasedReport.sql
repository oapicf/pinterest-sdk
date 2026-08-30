--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TemplateBasedReport' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'template_based_report'
--
SELECT message, report_status, template_id, "token" FROM template_based_report WHERE 1=1;

--
-- INSERT template for table 'template_based_report'
--
INSERT INTO template_based_report (message, report_status, template_id, "token") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'template_based_report'
--
UPDATE template_based_report SET message = ?, report_status = ?, template_id = ?, "token" = ? WHERE 1=2;

--
-- DELETE template for table 'template_based_report'
--
DELETE FROM template_based_report WHERE 1=2;

