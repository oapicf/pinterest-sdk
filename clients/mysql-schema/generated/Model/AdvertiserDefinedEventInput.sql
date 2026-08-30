--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvertiserDefinedEventInput' definition.
--


--
-- SELECT template for table `AdvertiserDefinedEventInput`
--
SELECT `mapped_conversion_type`, `name` FROM `AdvertiserDefinedEventInput` WHERE 1;

--
-- INSERT template for table `AdvertiserDefinedEventInput`
--
INSERT INTO `AdvertiserDefinedEventInput`(`mapped_conversion_type`, `name`) VALUES (?, ?);

--
-- UPDATE template for table `AdvertiserDefinedEventInput`
--
UPDATE `AdvertiserDefinedEventInput` SET `mapped_conversion_type` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `AdvertiserDefinedEventInput`
--
DELETE FROM `AdvertiserDefinedEventInput` WHERE 0;

