--
-- Pinterest REST API.
-- Prepared SQL queries for 'AudienceDemographics' definition.
--


--
-- SELECT template for table `AudienceDemographics`
--
SELECT `ages`, `countries`, `devices`, `genders`, `metros` FROM `AudienceDemographics` WHERE 1;

--
-- INSERT template for table `AudienceDemographics`
--
INSERT INTO `AudienceDemographics`(`ages`, `countries`, `devices`, `genders`, `metros`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `AudienceDemographics`
--
UPDATE `AudienceDemographics` SET `ages` = ?, `countries` = ?, `devices` = ?, `genders` = ?, `metros` = ? WHERE 1;

--
-- DELETE template for table `AudienceDemographics`
--
DELETE FROM `AudienceDemographics` WHERE 0;

