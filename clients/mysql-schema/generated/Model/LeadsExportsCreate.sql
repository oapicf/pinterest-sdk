--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadsExportsCreate' definition.
--


--
-- SELECT template for table `LeadsExportsCreate`
--
SELECT `ad_id`, `end_date`, `start_date` FROM `LeadsExportsCreate` WHERE 1;

--
-- INSERT template for table `LeadsExportsCreate`
--
INSERT INTO `LeadsExportsCreate`(`ad_id`, `end_date`, `start_date`) VALUES (?, ?, ?);

--
-- UPDATE template for table `LeadsExportsCreate`
--
UPDATE `LeadsExportsCreate` SET `ad_id` = ?, `end_date` = ?, `start_date` = ? WHERE 1;

--
-- DELETE template for table `LeadsExportsCreate`
--
DELETE FROM `LeadsExportsCreate` WHERE 0;

