--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdsAnalyticsCreateAsyncRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ads_analytics_create_async_request'
--
SELECT ad_group_ids, ad_group_statuses, ad_ids, ad_statuses, attribution_types, campaign_brand_label, campaign_custom_label, campaign_ids, campaign_objective_types, campaign_statuses, click_window_days, "columns", combine_targeting_types, conversion_report_time, custom_conversion_event_metrics, end_date, end_hour, engagement_window_days, granularity, "level", metrics_filters, primary_sort, product_group_ids, product_group_statuses, product_item_ids, report_format, reporting_timezone, start_date, start_hour, targeting_types, view_window_days FROM ads_analytics_create_async_request WHERE 1=1;

--
-- INSERT template for table 'ads_analytics_create_async_request'
--
INSERT INTO ads_analytics_create_async_request (ad_group_ids, ad_group_statuses, ad_ids, ad_statuses, attribution_types, campaign_brand_label, campaign_custom_label, campaign_ids, campaign_objective_types, campaign_statuses, click_window_days, "columns", combine_targeting_types, conversion_report_time, custom_conversion_event_metrics, end_date, end_hour, engagement_window_days, granularity, "level", metrics_filters, primary_sort, product_group_ids, product_group_statuses, product_item_ids, report_format, reporting_timezone, start_date, start_hour, targeting_types, view_window_days) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ads_analytics_create_async_request'
--
UPDATE ads_analytics_create_async_request SET ad_group_ids = ?, ad_group_statuses = ?, ad_ids = ?, ad_statuses = ?, attribution_types = ?, campaign_brand_label = ?, campaign_custom_label = ?, campaign_ids = ?, campaign_objective_types = ?, campaign_statuses = ?, click_window_days = ?, "columns" = ?, combine_targeting_types = ?, conversion_report_time = ?, custom_conversion_event_metrics = ?, end_date = ?, end_hour = ?, engagement_window_days = ?, granularity = ?, "level" = ?, metrics_filters = ?, primary_sort = ?, product_group_ids = ?, product_group_statuses = ?, product_item_ids = ?, report_format = ?, reporting_timezone = ?, start_date = ?, start_hour = ?, targeting_types = ?, view_window_days = ? WHERE 1=2;

--
-- DELETE template for table 'ads_analytics_create_async_request'
--
DELETE FROM ads_analytics_create_async_request WHERE 1=2;

