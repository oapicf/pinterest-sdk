--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvertiserDefinedEvent' definition.
--


--
-- SELECT template for table `AdvertiserDefinedEvent`
--
SELECT `mapped_conversion_type`, `name` FROM `AdvertiserDefinedEvent` WHERE 1;

--
-- INSERT template for table `AdvertiserDefinedEvent`
--
INSERT INTO `AdvertiserDefinedEvent`(`mapped_conversion_type`, `name`) VALUES (?, ?);

--
-- UPDATE template for table `AdvertiserDefinedEvent`
--
UPDATE `AdvertiserDefinedEvent` SET `mapped_conversion_type` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `AdvertiserDefinedEvent`
--
DELETE FROM `AdvertiserDefinedEvent` WHERE 0;

