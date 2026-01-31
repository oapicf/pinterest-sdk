--
-- Pinterest REST API.
-- Prepared SQL queries for 'GenderDemographics' definition.
--


--
-- SELECT template for table `GenderDemographics`
--
SELECT `female`, `male`, `unspecified` FROM `GenderDemographics` WHERE 1;

--
-- INSERT template for table `GenderDemographics`
--
INSERT INTO `GenderDemographics`(`female`, `male`, `unspecified`) VALUES (?, ?, ?);

--
-- UPDATE template for table `GenderDemographics`
--
UPDATE `GenderDemographics` SET `female` = ?, `male` = ?, `unspecified` = ? WHERE 1;

--
-- DELETE template for table `GenderDemographics`
--
DELETE FROM `GenderDemographics` WHERE 0;

