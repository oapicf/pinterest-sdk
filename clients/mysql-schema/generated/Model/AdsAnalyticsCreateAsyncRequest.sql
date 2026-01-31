--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdsAnalyticsCreateAsyncRequest' definition.
--


--
-- SELECT template for table `AdsAnalyticsCreateAsyncRequest`
--
SELECT `attribution_types`, `click_window_days`, `conversion_report_time`, `end_date`, `engagement_window_days`, `granularity`, `start_date`, `view_window_days`, `campaign_ids`, `campaign_statuses`, `campaign_objective_types`, `campaign_brand_label`, `ad_group_ids`, `ad_group_statuses`, `ad_ids`, `ad_statuses`, `product_group_ids`, `product_group_statuses`, `product_item_ids`, `targeting_types`, `metrics_filters`, `columns`, `combine_targeting_types`, `custom_conversion_event_metrics`, `end_hour`, `level`, `primary_sort`, `report_format`, `reporting_timezone`, `start_hour` FROM `AdsAnalyticsCreateAsyncRequest` WHERE 1;

--
-- INSERT template for table `AdsAnalyticsCreateAsyncRequest`
--
INSERT INTO `AdsAnalyticsCreateAsyncRequest`(`attribution_types`, `click_window_days`, `conversion_report_time`, `end_date`, `engagement_window_days`, `granularity`, `start_date`, `view_window_days`, `campaign_ids`, `campaign_statuses`, `campaign_objective_types`, `campaign_brand_label`, `ad_group_ids`, `ad_group_statuses`, `ad_ids`, `ad_statuses`, `product_group_ids`, `product_group_statuses`, `product_item_ids`, `targeting_types`, `metrics_filters`, `columns`, `combine_targeting_types`, `custom_conversion_event_metrics`, `end_hour`, `level`, `primary_sort`, `report_format`, `reporting_timezone`, `start_hour`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdsAnalyticsCreateAsyncRequest`
--
UPDATE `AdsAnalyticsCreateAsyncRequest` SET `attribution_types` = ?, `click_window_days` = ?, `conversion_report_time` = ?, `end_date` = ?, `engagement_window_days` = ?, `granularity` = ?, `start_date` = ?, `view_window_days` = ?, `campaign_ids` = ?, `campaign_statuses` = ?, `campaign_objective_types` = ?, `campaign_brand_label` = ?, `ad_group_ids` = ?, `ad_group_statuses` = ?, `ad_ids` = ?, `ad_statuses` = ?, `product_group_ids` = ?, `product_group_statuses` = ?, `product_item_ids` = ?, `targeting_types` = ?, `metrics_filters` = ?, `columns` = ?, `combine_targeting_types` = ?, `custom_conversion_event_metrics` = ?, `end_hour` = ?, `level` = ?, `primary_sort` = ?, `report_format` = ?, `reporting_timezone` = ?, `start_hour` = ? WHERE 1;

--
-- DELETE template for table `AdsAnalyticsCreateAsyncRequest`
--
DELETE FROM `AdsAnalyticsCreateAsyncRequest` WHERE 0;

