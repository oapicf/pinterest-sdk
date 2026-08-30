--
-- Pinterest REST API.
-- Prepared SQL queries for 'AccountTemplate' definition.
--


--
-- SELECT template for table `AccountTemplate`
--
SELECT `ad_account_id`, `ad_account_ids`, `ade_columns`, `attribution_type`, `click_window_days`, `columns`, `conversion_report_time_type`, `creation_source`, `custom_column_ids`, `display_metadata`, `engagement_window_days`, `filters_json`, `granularity`, `id`, `ingestion_sources`, `is_default`, `is_deleted`, `is_owned_by_user`, `is_scheduled`, `name`, `report_end_relative_days_in_past`, `report_format`, `report_level`, `report_start_relative_days_in_past`, `reporting_time_zone`, `sort_by`, `type`, `updated_time`, `user_id`, `view_window_days` FROM `AccountTemplate` WHERE 1;

--
-- INSERT template for table `AccountTemplate`
--
INSERT INTO `AccountTemplate`(`ad_account_id`, `ad_account_ids`, `ade_columns`, `attribution_type`, `click_window_days`, `columns`, `conversion_report_time_type`, `creation_source`, `custom_column_ids`, `display_metadata`, `engagement_window_days`, `filters_json`, `granularity`, `id`, `ingestion_sources`, `is_default`, `is_deleted`, `is_owned_by_user`, `is_scheduled`, `name`, `report_end_relative_days_in_past`, `report_format`, `report_level`, `report_start_relative_days_in_past`, `reporting_time_zone`, `sort_by`, `type`, `updated_time`, `user_id`, `view_window_days`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AccountTemplate`
--
UPDATE `AccountTemplate` SET `ad_account_id` = ?, `ad_account_ids` = ?, `ade_columns` = ?, `attribution_type` = ?, `click_window_days` = ?, `columns` = ?, `conversion_report_time_type` = ?, `creation_source` = ?, `custom_column_ids` = ?, `display_metadata` = ?, `engagement_window_days` = ?, `filters_json` = ?, `granularity` = ?, `id` = ?, `ingestion_sources` = ?, `is_default` = ?, `is_deleted` = ?, `is_owned_by_user` = ?, `is_scheduled` = ?, `name` = ?, `report_end_relative_days_in_past` = ?, `report_format` = ?, `report_level` = ?, `report_start_relative_days_in_past` = ?, `reporting_time_zone` = ?, `sort_by` = ?, `type` = ?, `updated_time` = ?, `user_id` = ?, `view_window_days` = ? WHERE 1;

--
-- DELETE template for table `AccountTemplate`
--
DELETE FROM `AccountTemplate` WHERE 0;

