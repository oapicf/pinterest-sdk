--
-- Pinterest REST API.
-- Prepared SQL queries for 'OptimizationGoalMetadata_conversion_tag_v3_goal_metadata' definition.
--


--
-- SELECT template for table `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata`
--
SELECT `attribution_windows`, `conversion_event`, `conversion_tag_id`, `cpa_goal_value_in_micro_currency`, `is_roas_optimized`, `learning_mode_type` FROM `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata` WHERE 1;

--
-- INSERT template for table `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata`
--
INSERT INTO `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata`(`attribution_windows`, `conversion_event`, `conversion_tag_id`, `cpa_goal_value_in_micro_currency`, `is_roas_optimized`, `learning_mode_type`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata`
--
UPDATE `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata` SET `attribution_windows` = ?, `conversion_event` = ?, `conversion_tag_id` = ?, `cpa_goal_value_in_micro_currency` = ?, `is_roas_optimized` = ?, `learning_mode_type` = ? WHERE 1;

--
-- DELETE template for table `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata`
--
DELETE FROM `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata` WHERE 0;

