--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionEvents_data_inner' definition.
--


--
-- SELECT template for table `ConversionEvents_data_inner`
--
SELECT `action_source`, `app_id`, `app_info`, `app_name`, `app_version`, `custom_data`, `device_brand`, `device_carrier`, `device_info`, `device_model`, `device_type`, `event_id`, `event_name`, `event_source_url`, `event_time`, `language`, `opt_out`, `os_version`, `partner_name`, `user_data`, `wifi` FROM `ConversionEvents_data_inner` WHERE 1;

--
-- INSERT template for table `ConversionEvents_data_inner`
--
INSERT INTO `ConversionEvents_data_inner`(`action_source`, `app_id`, `app_info`, `app_name`, `app_version`, `custom_data`, `device_brand`, `device_carrier`, `device_info`, `device_model`, `device_type`, `event_id`, `event_name`, `event_source_url`, `event_time`, `language`, `opt_out`, `os_version`, `partner_name`, `user_data`, `wifi`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionEvents_data_inner`
--
UPDATE `ConversionEvents_data_inner` SET `action_source` = ?, `app_id` = ?, `app_info` = ?, `app_name` = ?, `app_version` = ?, `custom_data` = ?, `device_brand` = ?, `device_carrier` = ?, `device_info` = ?, `device_model` = ?, `device_type` = ?, `event_id` = ?, `event_name` = ?, `event_source_url` = ?, `event_time` = ?, `language` = ?, `opt_out` = ?, `os_version` = ?, `partner_name` = ?, `user_data` = ?, `wifi` = ? WHERE 1;

--
-- DELETE template for table `ConversionEvents_data_inner`
--
DELETE FROM `ConversionEvents_data_inner` WHERE 0;

