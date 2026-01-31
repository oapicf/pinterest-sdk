--
-- Pinterest REST API.
-- Prepared SQL queries for 'TrendingKeyword_demographics' definition.
--


--
-- SELECT template for table `TrendingKeyword_demographics`
--
SELECT `age_distribution`, `gender_distribution` FROM `TrendingKeyword_demographics` WHERE 1;

--
-- INSERT template for table `TrendingKeyword_demographics`
--
INSERT INTO `TrendingKeyword_demographics`(`age_distribution`, `gender_distribution`) VALUES (?, ?);

--
-- UPDATE template for table `TrendingKeyword_demographics`
--
UPDATE `TrendingKeyword_demographics` SET `age_distribution` = ?, `gender_distribution` = ? WHERE 1;

--
-- DELETE template for table `TrendingKeyword_demographics`
--
DELETE FROM `TrendingKeyword_demographics` WHERE 0;

