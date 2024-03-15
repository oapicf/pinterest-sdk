--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionTagResponse' definition.
--


--
-- SELECT template for table `ConversionTagResponse`
--
SELECT `ad_account_id`, `code_snippet`, `enhanced_match_status`, `id`, `last_fired_time_ms`, `name`, `status`, `version`, `configs` FROM `ConversionTagResponse` WHERE 1;

--
-- INSERT template for table `ConversionTagResponse`
--
INSERT INTO `ConversionTagResponse`(`ad_account_id`, `code_snippet`, `enhanced_match_status`, `id`, `last_fired_time_ms`, `name`, `status`, `version`, `configs`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionTagResponse`
--
UPDATE `ConversionTagResponse` SET `ad_account_id` = ?, `code_snippet` = ?, `enhanced_match_status` = ?, `id` = ?, `last_fired_time_ms` = ?, `name` = ?, `status` = ?, `version` = ?, `configs` = ? WHERE 1;

--
-- DELETE template for table `ConversionTagResponse`
--
DELETE FROM `ConversionTagResponse` WHERE 0;

