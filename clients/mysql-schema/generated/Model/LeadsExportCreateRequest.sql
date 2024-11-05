--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadsExportCreateRequest' definition.
--


--
-- SELECT template for table `LeadsExportCreateRequest`
--
SELECT `start_date`, `end_date`, `ad_id` FROM `LeadsExportCreateRequest` WHERE 1;

--
-- INSERT template for table `LeadsExportCreateRequest`
--
INSERT INTO `LeadsExportCreateRequest`(`start_date`, `end_date`, `ad_id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `LeadsExportCreateRequest`
--
UPDATE `LeadsExportCreateRequest` SET `start_date` = ?, `end_date` = ?, `ad_id` = ? WHERE 1;

--
-- DELETE template for table `LeadsExportCreateRequest`
--
DELETE FROM `LeadsExportCreateRequest` WHERE 0;

