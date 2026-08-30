--
-- Pinterest REST API.
-- Prepared SQL queries for 'DynamicTitlesDownloadCSV' definition.
--


--
-- SELECT template for table `DynamicTitlesDownloadCSV`
--
SELECT `download_url` FROM `DynamicTitlesDownloadCSV` WHERE 1;

--
-- INSERT template for table `DynamicTitlesDownloadCSV`
--
INSERT INTO `DynamicTitlesDownloadCSV`(`download_url`) VALUES (?);

--
-- UPDATE template for table `DynamicTitlesDownloadCSV`
--
UPDATE `DynamicTitlesDownloadCSV` SET `download_url` = ? WHERE 1;

--
-- DELETE template for table `DynamicTitlesDownloadCSV`
--
DELETE FROM `DynamicTitlesDownloadCSV` WHERE 0;

