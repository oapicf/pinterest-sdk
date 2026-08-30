--
-- Pinterest REST API.
-- Prepared SQL queries for 'FrequencyGoalMetadata' definition.
--


--
-- SELECT template for table `FrequencyGoalMetadata`
--
SELECT `frequency`, `timerange` FROM `FrequencyGoalMetadata` WHERE 1;

--
-- INSERT template for table `FrequencyGoalMetadata`
--
INSERT INTO `FrequencyGoalMetadata`(`frequency`, `timerange`) VALUES (?, ?);

--
-- UPDATE template for table `FrequencyGoalMetadata`
--
UPDATE `FrequencyGoalMetadata` SET `frequency` = ?, `timerange` = ? WHERE 1;

--
-- DELETE template for table `FrequencyGoalMetadata`
--
DELETE FROM `FrequencyGoalMetadata` WHERE 0;

