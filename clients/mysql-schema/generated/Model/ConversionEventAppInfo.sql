--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionEventAppInfo' definition.
--


--
-- SELECT template for table `ConversionEventAppInfo`
--
SELECT `app_id`, `app_name`, `app_package_name`, `app_store`, `app_version`, `install_time`, `user_agent`, `window_height`, `window_width` FROM `ConversionEventAppInfo` WHERE 1;

--
-- INSERT template for table `ConversionEventAppInfo`
--
INSERT INTO `ConversionEventAppInfo`(`app_id`, `app_name`, `app_package_name`, `app_store`, `app_version`, `install_time`, `user_agent`, `window_height`, `window_width`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionEventAppInfo`
--
UPDATE `ConversionEventAppInfo` SET `app_id` = ?, `app_name` = ?, `app_package_name` = ?, `app_store` = ?, `app_version` = ?, `install_time` = ?, `user_agent` = ?, `window_height` = ?, `window_width` = ? WHERE 1;

--
-- DELETE template for table `ConversionEventAppInfo`
--
DELETE FROM `ConversionEventAppInfo` WHERE 0;

