--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionTagResponse' definition.
--


--
-- SELECT template for table `ConversionTagResponse`
--
SELECT `code_snippet`, `configs`, `enhanced_match_status`, `id`, `last_fired_time_ms`, `name`, `version`, `ad_account_id`, `status` FROM `ConversionTagResponse` WHERE 1;

--
-- INSERT template for table `ConversionTagResponse`
--
INSERT INTO `ConversionTagResponse`(`code_snippet`, `configs`, `enhanced_match_status`, `id`, `last_fired_time_ms`, `name`, `version`, `ad_account_id`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionTagResponse`
--
UPDATE `ConversionTagResponse` SET `code_snippet` = ?, `configs` = ?, `enhanced_match_status` = ?, `id` = ?, `last_fired_time_ms` = ?, `name` = ?, `version` = ?, `ad_account_id` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `ConversionTagResponse`
--
DELETE FROM `ConversionTagResponse` WHERE 0;

