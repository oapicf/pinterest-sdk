--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedProcessingSchedule' definition.
--


--
-- SELECT template for table `CatalogsFeedProcessingSchedule`
--
SELECT `time`, `timezone` FROM `CatalogsFeedProcessingSchedule` WHERE 1;

--
-- INSERT template for table `CatalogsFeedProcessingSchedule`
--
INSERT INTO `CatalogsFeedProcessingSchedule`(`time`, `timezone`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsFeedProcessingSchedule`
--
UPDATE `CatalogsFeedProcessingSchedule` SET `time` = ?, `timezone` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedProcessingSchedule`
--
DELETE FROM `CatalogsFeedProcessingSchedule` WHERE 0;

