--
-- Pinterest REST API.
-- Prepared SQL queries for 'OptimizationGoalMetadata_frequency_goal_metadata' definition.
--


--
-- SELECT template for table `OptimizationGoalMetadata_frequency_goal_metadata`
--
SELECT `frequency`, `timerange` FROM `OptimizationGoalMetadata_frequency_goal_metadata` WHERE 1;

--
-- INSERT template for table `OptimizationGoalMetadata_frequency_goal_metadata`
--
INSERT INTO `OptimizationGoalMetadata_frequency_goal_metadata`(`frequency`, `timerange`) VALUES (?, ?);

--
-- UPDATE template for table `OptimizationGoalMetadata_frequency_goal_metadata`
--
UPDATE `OptimizationGoalMetadata_frequency_goal_metadata` SET `frequency` = ?, `timerange` = ? WHERE 1;

--
-- DELETE template for table `OptimizationGoalMetadata_frequency_goal_metadata`
--
DELETE FROM `OptimizationGoalMetadata_frequency_goal_metadata` WHERE 0;

