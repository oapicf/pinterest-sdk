--
-- Pinterest REST API.
-- Prepared SQL queries for 'LeadsExportResponseData' definition.
--


--
-- SELECT template for table `LeadsExportResponseData`
--
SELECT `download_url`, `export_status` FROM `LeadsExportResponseData` WHERE 1;

--
-- INSERT template for table `LeadsExportResponseData`
--
INSERT INTO `LeadsExportResponseData`(`download_url`, `export_status`) VALUES (?, ?);

--
-- UPDATE template for table `LeadsExportResponseData`
--
UPDATE `LeadsExportResponseData` SET `download_url` = ?, `export_status` = ? WHERE 1;

--
-- DELETE template for table `LeadsExportResponseData`
--
DELETE FROM `LeadsExportResponseData` WHERE 0;

