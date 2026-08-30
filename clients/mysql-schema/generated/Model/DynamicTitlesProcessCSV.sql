--
-- Pinterest REST API.
-- Prepared SQL queries for 'DynamicTitlesProcessCSV' definition.
--


--
-- SELECT template for table `DynamicTitlesProcessCSV`
--
SELECT `errors`, `status` FROM `DynamicTitlesProcessCSV` WHERE 1;

--
-- INSERT template for table `DynamicTitlesProcessCSV`
--
INSERT INTO `DynamicTitlesProcessCSV`(`errors`, `status`) VALUES (?, ?);

--
-- UPDATE template for table `DynamicTitlesProcessCSV`
--
UPDATE `DynamicTitlesProcessCSV` SET `errors` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `DynamicTitlesProcessCSV`
--
DELETE FROM `DynamicTitlesProcessCSV` WHERE 0;

