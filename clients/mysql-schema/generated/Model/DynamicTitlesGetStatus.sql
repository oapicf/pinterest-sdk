--
-- Pinterest REST API.
-- Prepared SQL queries for 'DynamicTitlesGetStatus' definition.
--


--
-- SELECT template for table `DynamicTitlesGetStatus`
--
SELECT `generated_count`, `is_ready`, `reviewed_count` FROM `DynamicTitlesGetStatus` WHERE 1;

--
-- INSERT template for table `DynamicTitlesGetStatus`
--
INSERT INTO `DynamicTitlesGetStatus`(`generated_count`, `is_ready`, `reviewed_count`) VALUES (?, ?, ?);

--
-- UPDATE template for table `DynamicTitlesGetStatus`
--
UPDATE `DynamicTitlesGetStatus` SET `generated_count` = ?, `is_ready` = ?, `reviewed_count` = ? WHERE 1;

--
-- DELETE template for table `DynamicTitlesGetStatus`
--
DELETE FROM `DynamicTitlesGetStatus` WHERE 0;

