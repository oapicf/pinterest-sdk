--
-- "Pinterest REST API"
-- Prepared SQL queries for 'MMMReport' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'mmm_report'
--
SELECT message, report_status, "size", status, "token", url FROM mmm_report WHERE 1=1;

--
-- INSERT template for table 'mmm_report'
--
INSERT INTO mmm_report (message, report_status, "size", status, "token", url) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'mmm_report'
--
UPDATE mmm_report SET message = ?, report_status = ?, "size" = ?, status = ?, "token" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'mmm_report'
--
DELETE FROM mmm_report WHERE 1=2;

