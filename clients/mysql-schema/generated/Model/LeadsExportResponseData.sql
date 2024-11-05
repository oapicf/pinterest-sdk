--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadsExportResponseData' definition.
--


--
-- SELECT template for table `LeadsExportResponseData`
--
SELECT `export_status`, `download_url` FROM `LeadsExportResponseData` WHERE 1;

--
-- INSERT template for table `LeadsExportResponseData`
--
INSERT INTO `LeadsExportResponseData`(`export_status`, `download_url`) VALUES (?, ?);

--
-- UPDATE template for table `LeadsExportResponseData`
--
UPDATE `LeadsExportResponseData` SET `export_status` = ?, `download_url` = ? WHERE 1;

--
-- DELETE template for table `LeadsExportResponseData`
--
DELETE FROM `LeadsExportResponseData` WHERE 0;

