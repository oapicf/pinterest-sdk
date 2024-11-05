--
-- Pinterest REST API.
-- Prepared SQL queries for 'CreativeAssetsProcessingRecord' definition.
--


--
-- SELECT template for table `CreativeAssetsProcessingRecord`
--
SELECT `creative_assets_id`, `errors`, `warnings`, `status` FROM `CreativeAssetsProcessingRecord` WHERE 1;

--
-- INSERT template for table `CreativeAssetsProcessingRecord`
--
INSERT INTO `CreativeAssetsProcessingRecord`(`creative_assets_id`, `errors`, `warnings`, `status`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CreativeAssetsProcessingRecord`
--
UPDATE `CreativeAssetsProcessingRecord` SET `creative_assets_id` = ?, `errors` = ?, `warnings` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CreativeAssetsProcessingRecord`
--
DELETE FROM `CreativeAssetsProcessingRecord` WHERE 0;

