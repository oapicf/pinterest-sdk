--
-- Pinterest REST API.
-- Prepared SQL queries for 'OptimizationGoalMetadata_scrollup_goal_metadata' definition.
--


--
-- SELECT template for table `OptimizationGoalMetadata_scrollup_goal_metadata`
--
SELECT `scrollup_goal_value_in_micro_currency` FROM `OptimizationGoalMetadata_scrollup_goal_metadata` WHERE 1;

--
-- INSERT template for table `OptimizationGoalMetadata_scrollup_goal_metadata`
--
INSERT INTO `OptimizationGoalMetadata_scrollup_goal_metadata`(`scrollup_goal_value_in_micro_currency`) VALUES (?);

--
-- UPDATE template for table `OptimizationGoalMetadata_scrollup_goal_metadata`
--
UPDATE `OptimizationGoalMetadata_scrollup_goal_metadata` SET `scrollup_goal_value_in_micro_currency` = ? WHERE 1;

--
-- DELETE template for table `OptimizationGoalMetadata_scrollup_goal_metadata`
--
DELETE FROM `OptimizationGoalMetadata_scrollup_goal_metadata` WHERE 0;

