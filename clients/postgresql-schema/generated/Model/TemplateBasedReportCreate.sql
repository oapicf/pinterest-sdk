--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TemplateBasedReportCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'template_based_report_create'
--
SELECT message, report_status, "token" FROM template_based_report_create WHERE 1=1;

--
-- INSERT template for table 'template_based_report_create'
--
INSERT INTO template_based_report_create (message, report_status, "token") VALUES (?, ?, ?);

--
-- UPDATE template for table 'template_based_report_create'
--
UPDATE template_based_report_create SET message = ?, report_status = ?, "token" = ? WHERE 1=2;

--
-- DELETE template for table 'template_based_report_create'
--
DELETE FROM template_based_report_create WHERE 1=2;

