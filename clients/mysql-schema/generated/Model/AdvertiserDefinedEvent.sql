--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvertiserDefinedEvent' definition.
--


--
-- SELECT template for table `AdvertiserDefinedEvent`
--
SELECT `name`, `mapped_conversion_type` FROM `AdvertiserDefinedEvent` WHERE 1;

--
-- INSERT template for table `AdvertiserDefinedEvent`
--
INSERT INTO `AdvertiserDefinedEvent`(`name`, `mapped_conversion_type`) VALUES (?, ?);

--
-- UPDATE template for table `AdvertiserDefinedEvent`
--
UPDATE `AdvertiserDefinedEvent` SET `name` = ?, `mapped_conversion_type` = ? WHERE 1;

--
-- DELETE template for table `AdvertiserDefinedEvent`
--
DELETE FROM `AdvertiserDefinedEvent` WHERE 0;

