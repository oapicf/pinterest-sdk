--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsRetailReportAllItemsFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_retail_report_all_items_filter'
--
SELECT catalog_id, product_group_id, report_type FROM catalogs_retail_report_all_items_filter WHERE 1=1;

--
-- INSERT template for table 'catalogs_retail_report_all_items_filter'
--
INSERT INTO catalogs_retail_report_all_items_filter (catalog_id, product_group_id, report_type) VALUES (?, ?, ?);

--
-- UPDATE template for table 'catalogs_retail_report_all_items_filter'
--
UPDATE catalogs_retail_report_all_items_filter SET catalog_id = ?, product_group_id = ?, report_type = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_retail_report_all_items_filter'
--
DELETE FROM catalogs_retail_report_all_items_filter WHERE 1=2;

