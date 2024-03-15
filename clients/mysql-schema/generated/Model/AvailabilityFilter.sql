--
-- Pinterest REST API.
-- Prepared SQL queries for 'AvailabilityFilter' definition.
--


--
-- SELECT template for table `AvailabilityFilter`
--
SELECT `AVAILABILITY` FROM `AvailabilityFilter` WHERE 1;

--
-- INSERT template for table `AvailabilityFilter`
--
INSERT INTO `AvailabilityFilter`(`AVAILABILITY`) VALUES (?);

--
-- UPDATE template for table `AvailabilityFilter`
--
UPDATE `AvailabilityFilter` SET `AVAILABILITY` = ? WHERE 1;

--
-- DELETE template for table `AvailabilityFilter`
--
DELETE FROM `AvailabilityFilter` WHERE 0;

