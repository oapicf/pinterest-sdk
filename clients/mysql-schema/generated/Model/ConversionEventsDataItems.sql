--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionEventsDataItems' definition.
--


--
-- SELECT template for table `ConversionEventsDataItems`
--
SELECT `action_source`, `app_id`, `app_info`, `app_name`, `app_version`, `custom_data`, `device_brand`, `device_carrier`, `device_info`, `device_model`, `device_type`, `event_id`, `event_name`, `event_source_url`, `event_time`, `language`, `opt_out`, `os_version`, `partner_name`, `user_data`, `wifi` FROM `ConversionEventsDataItems` WHERE 1;

--
-- INSERT template for table `ConversionEventsDataItems`
--
INSERT INTO `ConversionEventsDataItems`(`action_source`, `app_id`, `app_info`, `app_name`, `app_version`, `custom_data`, `device_brand`, `device_carrier`, `device_info`, `device_model`, `device_type`, `event_id`, `event_name`, `event_source_url`, `event_time`, `language`, `opt_out`, `os_version`, `partner_name`, `user_data`, `wifi`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionEventsDataItems`
--
UPDATE `ConversionEventsDataItems` SET `action_source` = ?, `app_id` = ?, `app_info` = ?, `app_name` = ?, `app_version` = ?, `custom_data` = ?, `device_brand` = ?, `device_carrier` = ?, `device_info` = ?, `device_model` = ?, `device_type` = ?, `event_id` = ?, `event_name` = ?, `event_source_url` = ?, `event_time` = ?, `language` = ?, `opt_out` = ?, `os_version` = ?, `partner_name` = ?, `user_data` = ?, `wifi` = ? WHERE 1;

--
-- DELETE template for table `ConversionEventsDataItems`
--
DELETE FROM `ConversionEventsDataItems` WHERE 0;

