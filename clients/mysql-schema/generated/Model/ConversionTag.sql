--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionTag' definition.
--


--
-- SELECT template for table `ConversionTag`
--
SELECT `code_snippet`, `configs`, `enhanced_match_status`, `id`, `last_fired_time_ms`, `name`, `version`, `ad_account_id`, `status` FROM `ConversionTag` WHERE 1;

--
-- INSERT template for table `ConversionTag`
--
INSERT INTO `ConversionTag`(`code_snippet`, `configs`, `enhanced_match_status`, `id`, `last_fired_time_ms`, `name`, `version`, `ad_account_id`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionTag`
--
UPDATE `ConversionTag` SET `code_snippet` = ?, `configs` = ?, `enhanced_match_status` = ?, `id` = ?, `last_fired_time_ms` = ?, `name` = ?, `version` = ?, `ad_account_id` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `ConversionTag`
--
DELETE FROM `ConversionTag` WHERE 0;

