--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AccountTemplate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'account_template'
--
SELECT ad_account_id, ad_account_ids, ade_columns, attribution_type, click_window_days, "columns", conversion_report_time_type, creation_source, custom_column_ids, display_metadata, engagement_window_days, filters_json, granularity, "id", ingestion_sources, is_default, is_deleted, is_owned_by_user, is_scheduled, "name", report_end_relative_days_in_past, report_format, report_level, report_start_relative_days_in_past, reporting_time_zone, sort_by, "type", updated_time, user_id, view_window_days FROM account_template WHERE 1=1;

--
-- INSERT template for table 'account_template'
--
INSERT INTO account_template (ad_account_id, ad_account_ids, ade_columns, attribution_type, click_window_days, "columns", conversion_report_time_type, creation_source, custom_column_ids, display_metadata, engagement_window_days, filters_json, granularity, "id", ingestion_sources, is_default, is_deleted, is_owned_by_user, is_scheduled, "name", report_end_relative_days_in_past, report_format, report_level, report_start_relative_days_in_past, reporting_time_zone, sort_by, "type", updated_time, user_id, view_window_days) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'account_template'
--
UPDATE account_template SET ad_account_id = ?, ad_account_ids = ?, ade_columns = ?, attribution_type = ?, click_window_days = ?, "columns" = ?, conversion_report_time_type = ?, creation_source = ?, custom_column_ids = ?, display_metadata = ?, engagement_window_days = ?, filters_json = ?, granularity = ?, "id" = ?, ingestion_sources = ?, is_default = ?, is_deleted = ?, is_owned_by_user = ?, is_scheduled = ?, "name" = ?, report_end_relative_days_in_past = ?, report_format = ?, report_level = ?, report_start_relative_days_in_past = ?, reporting_time_zone = ?, sort_by = ?, "type" = ?, updated_time = ?, user_id = ?, view_window_days = ? WHERE 1=2;

--
-- DELETE template for table 'account_template'
--
DELETE FROM account_template WHERE 1=2;

