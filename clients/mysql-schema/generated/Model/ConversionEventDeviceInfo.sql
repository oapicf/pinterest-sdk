--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionEventDeviceInfo' definition.
--


--
-- SELECT template for table `ConversionEventDeviceInfo`
--
SELECT `battery_level`, `brand`, `carrier`, `cpu_cores`, `external_storage_free_space`, `external_storage_size`, `form_factor`, `kernel_version`, `languages`, `locale`, `model`, `network_type`, `os_family`, `os_name`, `os_release_name`, `os_version`, `screen_density`, `screen_height`, `screen_width`, `storage_free_space`, `storage_size`, `timezone`, `timezone_abbr`, `type` FROM `ConversionEventDeviceInfo` WHERE 1;

--
-- INSERT template for table `ConversionEventDeviceInfo`
--
INSERT INTO `ConversionEventDeviceInfo`(`battery_level`, `brand`, `carrier`, `cpu_cores`, `external_storage_free_space`, `external_storage_size`, `form_factor`, `kernel_version`, `languages`, `locale`, `model`, `network_type`, `os_family`, `os_name`, `os_release_name`, `os_version`, `screen_density`, `screen_height`, `screen_width`, `storage_free_space`, `storage_size`, `timezone`, `timezone_abbr`, `type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionEventDeviceInfo`
--
UPDATE `ConversionEventDeviceInfo` SET `battery_level` = ?, `brand` = ?, `carrier` = ?, `cpu_cores` = ?, `external_storage_free_space` = ?, `external_storage_size` = ?, `form_factor` = ?, `kernel_version` = ?, `languages` = ?, `locale` = ?, `model` = ?, `network_type` = ?, `os_family` = ?, `os_name` = ?, `os_release_name` = ?, `os_version` = ?, `screen_density` = ?, `screen_height` = ?, `screen_width` = ?, `storage_free_space` = ?, `storage_size` = ?, `timezone` = ?, `timezone_abbr` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `ConversionEventDeviceInfo`
--
DELETE FROM `ConversionEventDeviceInfo` WHERE 0;

