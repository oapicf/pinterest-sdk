--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionEvents_data_inner' definition.
--


--
-- SELECT template for table `ConversionEvents_data_inner`
--
SELECT `event_name`, `action_source`, `event_time`, `event_id`, `event_source_url`, `opt_out`, `partner_name`, `user_data`, `custom_data`, `app_id`, `app_name`, `app_version`, `device_brand`, `device_carrier`, `device_model`, `device_type`, `os_version`, `wifi`, `language` FROM `ConversionEvents_data_inner` WHERE 1;

--
-- INSERT template for table `ConversionEvents_data_inner`
--
INSERT INTO `ConversionEvents_data_inner`(`event_name`, `action_source`, `event_time`, `event_id`, `event_source_url`, `opt_out`, `partner_name`, `user_data`, `custom_data`, `app_id`, `app_name`, `app_version`, `device_brand`, `device_carrier`, `device_model`, `device_type`, `os_version`, `wifi`, `language`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionEvents_data_inner`
--
UPDATE `ConversionEvents_data_inner` SET `event_name` = ?, `action_source` = ?, `event_time` = ?, `event_id` = ?, `event_source_url` = ?, `opt_out` = ?, `partner_name` = ?, `user_data` = ?, `custom_data` = ?, `app_id` = ?, `app_name` = ?, `app_version` = ?, `device_brand` = ?, `device_carrier` = ?, `device_model` = ?, `device_type` = ?, `os_version` = ?, `wifi` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `ConversionEvents_data_inner`
--
DELETE FROM `ConversionEvents_data_inner` WHERE 0;

