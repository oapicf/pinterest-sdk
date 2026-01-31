--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadsExportCreateRequest' definition.
--


--
-- SELECT template for table `LeadsExportCreateRequest`
--
SELECT `ad_id`, `end_date`, `start_date` FROM `LeadsExportCreateRequest` WHERE 1;

--
-- INSERT template for table `LeadsExportCreateRequest`
--
INSERT INTO `LeadsExportCreateRequest`(`ad_id`, `end_date`, `start_date`) VALUES (?, ?, ?);

--
-- UPDATE template for table `LeadsExportCreateRequest`
--
UPDATE `LeadsExportCreateRequest` SET `ad_id` = ?, `end_date` = ?, `start_date` = ? WHERE 1;

--
-- DELETE template for table `LeadsExportCreateRequest`
--
DELETE FROM `LeadsExportCreateRequest` WHERE 0;

