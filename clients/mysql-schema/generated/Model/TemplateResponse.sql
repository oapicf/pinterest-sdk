--
-- Pinterest REST API.
-- Prepared SQL queries for 'TemplateResponse' definition.
--


--
-- SELECT template for table `TemplateResponse`
--
SELECT `ad_account_id`, `ad_account_ids`, `click_window_days`, `columns`, `conversion_report_time_type`, `creation_source`, `custom_column_ids`, `date_range`, `engagement_window_days`, `filters_json`, `granularity`, `id`, `ingestion_sources`, `is_deleted`, `is_owned_by_user`, `is_scheduled`, `name`, `report_end_relative_days_in_past`, `report_format`, `report_level`, `report_start_relative_days_in_past`, `type`, `updated_time`, `user_id`, `view_window_days` FROM `TemplateResponse` WHERE 1;

--
-- INSERT template for table `TemplateResponse`
--
INSERT INTO `TemplateResponse`(`ad_account_id`, `ad_account_ids`, `click_window_days`, `columns`, `conversion_report_time_type`, `creation_source`, `custom_column_ids`, `date_range`, `engagement_window_days`, `filters_json`, `granularity`, `id`, `ingestion_sources`, `is_deleted`, `is_owned_by_user`, `is_scheduled`, `name`, `report_end_relative_days_in_past`, `report_format`, `report_level`, `report_start_relative_days_in_past`, `type`, `updated_time`, `user_id`, `view_window_days`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TemplateResponse`
--
UPDATE `TemplateResponse` SET `ad_account_id` = ?, `ad_account_ids` = ?, `click_window_days` = ?, `columns` = ?, `conversion_report_time_type` = ?, `creation_source` = ?, `custom_column_ids` = ?, `date_range` = ?, `engagement_window_days` = ?, `filters_json` = ?, `granularity` = ?, `id` = ?, `ingestion_sources` = ?, `is_deleted` = ?, `is_owned_by_user` = ?, `is_scheduled` = ?, `name` = ?, `report_end_relative_days_in_past` = ?, `report_format` = ?, `report_level` = ?, `report_start_relative_days_in_past` = ?, `type` = ?, `updated_time` = ?, `user_id` = ?, `view_window_days` = ? WHERE 1;

--
-- DELETE template for table `TemplateResponse`
--
DELETE FROM `TemplateResponse` WHERE 0;

