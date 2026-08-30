--
-- Pinterest REST API.
-- Prepared SQL queries for 'TrendingKeywordDemographics' definition.
--


--
-- SELECT template for table `TrendingKeywordDemographics`
--
SELECT `age_distribution`, `gender_distribution` FROM `TrendingKeywordDemographics` WHERE 1;

--
-- INSERT template for table `TrendingKeywordDemographics`
--
INSERT INTO `TrendingKeywordDemographics`(`age_distribution`, `gender_distribution`) VALUES (?, ?);

--
-- UPDATE template for table `TrendingKeywordDemographics`
--
UPDATE `TrendingKeywordDemographics` SET `age_distribution` = ?, `gender_distribution` = ? WHERE 1;

--
-- DELETE template for table `TrendingKeywordDemographics`
--
DELETE FROM `TrendingKeywordDemographics` WHERE 0;

