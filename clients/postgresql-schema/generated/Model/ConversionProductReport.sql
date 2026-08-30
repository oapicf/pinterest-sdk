--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionProductReport' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_product_report'
--
SELECT message, report_status, "size", "token", url FROM conversion_product_report WHERE 1=1;

--
-- INSERT template for table 'conversion_product_report'
--
INSERT INTO conversion_product_report (message, report_status, "size", "token", url) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'conversion_product_report'
--
UPDATE conversion_product_report SET message = ?, report_status = ?, "size" = ?, "token" = ?, url = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_product_report'
--
DELETE FROM conversion_product_report WHERE 1=2;

