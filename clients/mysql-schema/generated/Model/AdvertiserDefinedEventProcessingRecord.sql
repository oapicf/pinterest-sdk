--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvertiserDefinedEventProcessingRecord' definition.
--


--
-- SELECT template for table `AdvertiserDefinedEventProcessingRecord`
--
SELECT `exceptions`, `name`, `status` FROM `AdvertiserDefinedEventProcessingRecord` WHERE 1;

--
-- INSERT template for table `AdvertiserDefinedEventProcessingRecord`
--
INSERT INTO `AdvertiserDefinedEventProcessingRecord`(`exceptions`, `name`, `status`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdvertiserDefinedEventProcessingRecord`
--
UPDATE `AdvertiserDefinedEventProcessingRecord` SET `exceptions` = ?, `name` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `AdvertiserDefinedEventProcessingRecord`
--
DELETE FROM `AdvertiserDefinedEventProcessingRecord` WHERE 0;

