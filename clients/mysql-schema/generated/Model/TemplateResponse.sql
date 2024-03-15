--
-- Pinterest REST API.
-- Prepared SQL queries for 'TemplateResponse' definition.
--


--
-- SELECT template for table `TemplateResponse`
--
SELECT `id`, `ad_account_id`, `ad_account_ids`, `user_id`, `name`, `report_start_relative_days_in_past`, `report_end_relative_days_in_past`, `date_range`, `report_level`, `report_format`, `columns`, `granularity`, `view_window_days`, `click_window_days`, `engagement_window_days`, `conversion_report_time_type`, `filters_json`, `is_owned_by_user`, `is_scheduled`, `creation_source`, `is_deleted`, `updated_time`, `custom_column_ids`, `type`, `ingestion_sources` FROM `TemplateResponse` WHERE 1;

--
-- INSERT template for table `TemplateResponse`
--
INSERT INTO `TemplateResponse`(`id`, `ad_account_id`, `ad_account_ids`, `user_id`, `name`, `report_start_relative_days_in_past`, `report_end_relative_days_in_past`, `date_range`, `report_level`, `report_format`, `columns`, `granularity`, `view_window_days`, `click_window_days`, `engagement_window_days`, `conversion_report_time_type`, `filters_json`, `is_owned_by_user`, `is_scheduled`, `creation_source`, `is_deleted`, `updated_time`, `custom_column_ids`, `type`, `ingestion_sources`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TemplateResponse`
--
UPDATE `TemplateResponse` SET `id` = ?, `ad_account_id` = ?, `ad_account_ids` = ?, `user_id` = ?, `name` = ?, `report_start_relative_days_in_past` = ?, `report_end_relative_days_in_past` = ?, `date_range` = ?, `report_level` = ?, `report_format` = ?, `columns` = ?, `granularity` = ?, `view_window_days` = ?, `click_window_days` = ?, `engagement_window_days` = ?, `conversion_report_time_type` = ?, `filters_json` = ?, `is_owned_by_user` = ?, `is_scheduled` = ?, `creation_source` = ?, `is_deleted` = ?, `updated_time` = ?, `custom_column_ids` = ?, `type` = ?, `ingestion_sources` = ? WHERE 1;

--
-- DELETE template for table `TemplateResponse`
--
DELETE FROM `TemplateResponse` WHERE 0;

