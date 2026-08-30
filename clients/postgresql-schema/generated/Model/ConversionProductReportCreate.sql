--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionProductReportCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_product_report_create'
--
SELECT ad_group_ids, campaign_ids, campaign_objective_types, click_window_days, "columns", conversion_product_attribution_type, conversion_product_breakdown, conversion_report_time, end_date, granularity, "level", product_sku_ids, report_name, start_date, view_window_days FROM conversion_product_report_create WHERE 1=1;

--
-- INSERT template for table 'conversion_product_report_create'
--
INSERT INTO conversion_product_report_create (ad_group_ids, campaign_ids, campaign_objective_types, click_window_days, "columns", conversion_product_attribution_type, conversion_product_breakdown, conversion_report_time, end_date, granularity, "level", product_sku_ids, report_name, start_date, view_window_days) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'conversion_product_report_create'
--
UPDATE conversion_product_report_create SET ad_group_ids = ?, campaign_ids = ?, campaign_objective_types = ?, click_window_days = ?, "columns" = ?, conversion_product_attribution_type = ?, conversion_product_breakdown = ?, conversion_report_time = ?, end_date = ?, granularity = ?, "level" = ?, product_sku_ids = ?, report_name = ?, start_date = ?, view_window_days = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_product_report_create'
--
DELETE FROM conversion_product_report_create WHERE 1=2;

