--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionTagCommon' definition.
--


--
-- SELECT template for table `ConversionTagCommon`
--
SELECT `code_snippet`, `configs`, `enhanced_match_status`, `id`, `last_fired_time_ms`, `name`, `version` FROM `ConversionTagCommon` WHERE 1;

--
-- INSERT template for table `ConversionTagCommon`
--
INSERT INTO `ConversionTagCommon`(`code_snippet`, `configs`, `enhanced_match_status`, `id`, `last_fired_time_ms`, `name`, `version`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionTagCommon`
--
UPDATE `ConversionTagCommon` SET `code_snippet` = ?, `configs` = ?, `enhanced_match_status` = ?, `id` = ?, `last_fired_time_ms` = ?, `name` = ?, `version` = ? WHERE 1;

--
-- DELETE template for table `ConversionTagCommon`
--
DELETE FROM `ConversionTagCommon` WHERE 0;

