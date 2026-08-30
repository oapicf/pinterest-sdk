--
-- Pinterest REST API.
-- Prepared SQL queries for 'DynamicTitlesProcessCSVError' definition.
--


--
-- SELECT template for table `DynamicTitlesProcessCSVError`
--
SELECT `error_type`, `row_number` FROM `DynamicTitlesProcessCSVError` WHERE 1;

--
-- INSERT template for table `DynamicTitlesProcessCSVError`
--
INSERT INTO `DynamicTitlesProcessCSVError`(`error_type`, `row_number`) VALUES (?, ?);

--
-- UPDATE template for table `DynamicTitlesProcessCSVError`
--
UPDATE `DynamicTitlesProcessCSVError` SET `error_type` = ?, `row_number` = ? WHERE 1;

--
-- DELETE template for table `DynamicTitlesProcessCSVError`
--
DELETE FROM `DynamicTitlesProcessCSVError` WHERE 0;

