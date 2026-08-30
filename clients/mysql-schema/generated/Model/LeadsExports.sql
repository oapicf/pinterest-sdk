--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadsExports' definition.
--


--
-- SELECT template for table `LeadsExports`
--
SELECT `leads_export_id` FROM `LeadsExports` WHERE 1;

--
-- INSERT template for table `LeadsExports`
--
INSERT INTO `LeadsExports`(`leads_export_id`) VALUES (?);

--
-- UPDATE template for table `LeadsExports`
--
UPDATE `LeadsExports` SET `leads_export_id` = ? WHERE 1;

--
-- DELETE template for table `LeadsExports`
--
DELETE FROM `LeadsExports` WHERE 0;

