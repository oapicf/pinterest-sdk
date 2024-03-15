--
-- Pinterest REST API.
-- Prepared SQL queries for 'OptimizationGoalMetadata' definition.
--


--
-- SELECT template for table `OptimizationGoalMetadata`
--
SELECT `conversion_tag_v3_goal_metadata`, `frequency_goal_metadata`, `scrollup_goal_metadata` FROM `OptimizationGoalMetadata` WHERE 1;

--
-- INSERT template for table `OptimizationGoalMetadata`
--
INSERT INTO `OptimizationGoalMetadata`(`conversion_tag_v3_goal_metadata`, `frequency_goal_metadata`, `scrollup_goal_metadata`) VALUES (?, ?, ?);

--
-- UPDATE template for table `OptimizationGoalMetadata`
--
UPDATE `OptimizationGoalMetadata` SET `conversion_tag_v3_goal_metadata` = ?, `frequency_goal_metadata` = ?, `scrollup_goal_metadata` = ? WHERE 1;

--
-- DELETE template for table `OptimizationGoalMetadata`
--
DELETE FROM `OptimizationGoalMetadata` WHERE 0;

