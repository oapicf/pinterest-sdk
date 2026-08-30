--
-- Pinterest REST API.
-- Prepared SQL queries for 'NullableOptimizationGoalMetadata' definition.
--


--
-- SELECT template for table `NullableOptimizationGoalMetadata`
--
SELECT `conversion_tag_v3_goal_metadata`, `frequency_goal_metadata`, `scrollup_goal_metadata` FROM `NullableOptimizationGoalMetadata` WHERE 1;

--
-- INSERT template for table `NullableOptimizationGoalMetadata`
--
INSERT INTO `NullableOptimizationGoalMetadata`(`conversion_tag_v3_goal_metadata`, `frequency_goal_metadata`, `scrollup_goal_metadata`) VALUES (?, ?, ?);

--
-- UPDATE template for table `NullableOptimizationGoalMetadata`
--
UPDATE `NullableOptimizationGoalMetadata` SET `conversion_tag_v3_goal_metadata` = ?, `frequency_goal_metadata` = ?, `scrollup_goal_metadata` = ? WHERE 1;

--
-- DELETE template for table `NullableOptimizationGoalMetadata`
--
DELETE FROM `NullableOptimizationGoalMetadata` WHERE 0;

