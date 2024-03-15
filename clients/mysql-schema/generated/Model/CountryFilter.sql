--
-- Pinterest REST API.
-- Prepared SQL queries for 'CountryFilter' definition.
--


--
-- SELECT template for table `CountryFilter`
--
SELECT `COUNTRY` FROM `CountryFilter` WHERE 1;

--
-- INSERT template for table `CountryFilter`
--
INSERT INTO `CountryFilter`(`COUNTRY`) VALUES (?);

--
-- UPDATE template for table `CountryFilter`
--
UPDATE `CountryFilter` SET `COUNTRY` = ? WHERE 1;

--
-- DELETE template for table `CountryFilter`
--
DELETE FROM `CountryFilter` WHERE 0;

