--
-- Pinterest REST API.
-- Prepared SQL queries for 'AudienceDemographics' definition.
--


--
-- SELECT template for table `AudienceDemographics`
--
SELECT `ages`, `genders`, `devices`, `metros`, `countries` FROM `AudienceDemographics` WHERE 1;

--
-- INSERT template for table `AudienceDemographics`
--
INSERT INTO `AudienceDemographics`(`ages`, `genders`, `devices`, `metros`, `countries`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `AudienceDemographics`
--
UPDATE `AudienceDemographics` SET `ages` = ?, `genders` = ?, `devices` = ?, `metros` = ?, `countries` = ? WHERE 1;

--
-- DELETE template for table `AudienceDemographics`
--
DELETE FROM `AudienceDemographics` WHERE 0;

