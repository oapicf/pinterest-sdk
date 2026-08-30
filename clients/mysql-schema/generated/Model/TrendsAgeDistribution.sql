--
-- Pinterest REST API.
-- Prepared SQL queries for 'TrendsAgeDistribution' definition.
--


--
-- SELECT template for table `TrendsAgeDistribution`
--
SELECT `age_distribution` FROM `TrendsAgeDistribution` WHERE 1;

--
-- INSERT template for table `TrendsAgeDistribution`
--
INSERT INTO `TrendsAgeDistribution`(`age_distribution`) VALUES (?);

--
-- UPDATE template for table `TrendsAgeDistribution`
--
UPDATE `TrendsAgeDistribution` SET `age_distribution` = ? WHERE 1;

--
-- DELETE template for table `TrendsAgeDistribution`
--
DELETE FROM `TrendsAgeDistribution` WHERE 0;

