--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdsAnalyticsCreateAsyncRequest' definition.
--


--
-- SELECT template for table `AdsAnalyticsCreateAsyncRequest`
--
SELECT `start_date`, `end_date`, `granularity`, `click_window_days`, `engagement_window_days`, `view_window_days`, `conversion_report_time`, `attribution_types`, `campaign_ids`, `campaign_statuses`, `campaign_objective_types`, `ad_group_ids`, `ad_group_statuses`, `ad_ids`, `ad_statuses`, `product_group_ids`, `product_group_statuses`, `product_item_ids`, `targeting_types`, `metrics_filters`, `columns`, `level`, `report_format`, `primary_sort`, `start_hour`, `end_hour` FROM `AdsAnalyticsCreateAsyncRequest` WHERE 1;

--
-- INSERT template for table `AdsAnalyticsCreateAsyncRequest`
--
INSERT INTO `AdsAnalyticsCreateAsyncRequest`(`start_date`, `end_date`, `granularity`, `click_window_days`, `engagement_window_days`, `view_window_days`, `conversion_report_time`, `attribution_types`, `campaign_ids`, `campaign_statuses`, `campaign_objective_types`, `ad_group_ids`, `ad_group_statuses`, `ad_ids`, `ad_statuses`, `product_group_ids`, `product_group_statuses`, `product_item_ids`, `targeting_types`, `metrics_filters`, `columns`, `level`, `report_format`, `primary_sort`, `start_hour`, `end_hour`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdsAnalyticsCreateAsyncRequest`
--
UPDATE `AdsAnalyticsCreateAsyncRequest` SET `start_date` = ?, `end_date` = ?, `granularity` = ?, `click_window_days` = ?, `engagement_window_days` = ?, `view_window_days` = ?, `conversion_report_time` = ?, `attribution_types` = ?, `campaign_ids` = ?, `campaign_statuses` = ?, `campaign_objective_types` = ?, `ad_group_ids` = ?, `ad_group_statuses` = ?, `ad_ids` = ?, `ad_statuses` = ?, `product_group_ids` = ?, `product_group_statuses` = ?, `product_item_ids` = ?, `targeting_types` = ?, `metrics_filters` = ?, `columns` = ?, `level` = ?, `report_format` = ?, `primary_sort` = ?, `start_hour` = ?, `end_hour` = ? WHERE 1;

--
-- DELETE template for table `AdsAnalyticsCreateAsyncRequest`
--
DELETE FROM `AdsAnalyticsCreateAsyncRequest` WHERE 0;

