--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdsAnalyticsCreateAsyncRequest' definition.
--


--
-- SELECT template for table `AdsAnalyticsCreateAsyncRequest`
--
SELECT `ad_group_ids`, `ad_group_statuses`, `ad_ids`, `ad_statuses`, `attribution_types`, `campaign_brand_label`, `campaign_custom_label`, `campaign_ids`, `campaign_objective_types`, `campaign_statuses`, `click_window_days`, `columns`, `combine_targeting_types`, `conversion_report_time`, `custom_conversion_event_metrics`, `end_date`, `end_hour`, `engagement_window_days`, `granularity`, `level`, `metrics_filters`, `primary_sort`, `product_group_ids`, `product_group_statuses`, `product_item_ids`, `report_format`, `reporting_timezone`, `start_date`, `start_hour`, `targeting_types`, `view_window_days` FROM `AdsAnalyticsCreateAsyncRequest` WHERE 1;

--
-- INSERT template for table `AdsAnalyticsCreateAsyncRequest`
--
INSERT INTO `AdsAnalyticsCreateAsyncRequest`(`ad_group_ids`, `ad_group_statuses`, `ad_ids`, `ad_statuses`, `attribution_types`, `campaign_brand_label`, `campaign_custom_label`, `campaign_ids`, `campaign_objective_types`, `campaign_statuses`, `click_window_days`, `columns`, `combine_targeting_types`, `conversion_report_time`, `custom_conversion_event_metrics`, `end_date`, `end_hour`, `engagement_window_days`, `granularity`, `level`, `metrics_filters`, `primary_sort`, `product_group_ids`, `product_group_statuses`, `product_item_ids`, `report_format`, `reporting_timezone`, `start_date`, `start_hour`, `targeting_types`, `view_window_days`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdsAnalyticsCreateAsyncRequest`
--
UPDATE `AdsAnalyticsCreateAsyncRequest` SET `ad_group_ids` = ?, `ad_group_statuses` = ?, `ad_ids` = ?, `ad_statuses` = ?, `attribution_types` = ?, `campaign_brand_label` = ?, `campaign_custom_label` = ?, `campaign_ids` = ?, `campaign_objective_types` = ?, `campaign_statuses` = ?, `click_window_days` = ?, `columns` = ?, `combine_targeting_types` = ?, `conversion_report_time` = ?, `custom_conversion_event_metrics` = ?, `end_date` = ?, `end_hour` = ?, `engagement_window_days` = ?, `granularity` = ?, `level` = ?, `metrics_filters` = ?, `primary_sort` = ?, `product_group_ids` = ?, `product_group_statuses` = ?, `product_item_ids` = ?, `report_format` = ?, `reporting_timezone` = ?, `start_date` = ?, `start_hour` = ?, `targeting_types` = ?, `view_window_days` = ? WHERE 1;

--
-- DELETE template for table `AdsAnalyticsCreateAsyncRequest`
--
DELETE FROM `AdsAnalyticsCreateAsyncRequest` WHERE 0;

