--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionTagCommon' definition.
--


--
-- SELECT template for table `ConversionTagCommon`
--
SELECT `ad_account_id`, `code_snippet`, `enhanced_match_status`, `id`, `last_fired_time_ms`, `name`, `status`, `version`, `configs` FROM `ConversionTagCommon` WHERE 1;

--
-- INSERT template for table `ConversionTagCommon`
--
INSERT INTO `ConversionTagCommon`(`ad_account_id`, `code_snippet`, `enhanced_match_status`, `id`, `last_fired_time_ms`, `name`, `status`, `version`, `configs`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionTagCommon`
--
UPDATE `ConversionTagCommon` SET `ad_account_id` = ?, `code_snippet` = ?, `enhanced_match_status` = ?, `id` = ?, `last_fired_time_ms` = ?, `name` = ?, `status` = ?, `version` = ?, `configs` = ? WHERE 1;

--
-- DELETE template for table `ConversionTagCommon`
--
DELETE FROM `ConversionTagCommon` WHERE 0;

