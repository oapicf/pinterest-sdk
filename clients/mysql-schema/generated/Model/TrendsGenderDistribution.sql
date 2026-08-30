--
-- Pinterest REST API.
-- Prepared SQL queries for 'TrendsGenderDistribution' definition.
--


--
-- SELECT template for table `TrendsGenderDistribution`
--
SELECT `gender_distribution` FROM `TrendsGenderDistribution` WHERE 1;

--
-- INSERT template for table `TrendsGenderDistribution`
--
INSERT INTO `TrendsGenderDistribution`(`gender_distribution`) VALUES (?);

--
-- UPDATE template for table `TrendsGenderDistribution`
--
UPDATE `TrendsGenderDistribution` SET `gender_distribution` = ? WHERE 1;

--
-- DELETE template for table `TrendsGenderDistribution`
--
DELETE FROM `TrendsGenderDistribution` WHERE 0;

