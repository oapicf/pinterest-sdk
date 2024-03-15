--
-- Pinterest REST API.
-- Prepared SQL queries for 'OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows' definition.
--


--
-- SELECT template for table `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribu`
--
SELECT `click_window_days`, `engagement_window_days`, `view_window_days` FROM `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribu` WHERE 1;

--
-- INSERT template for table `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribu`
--
INSERT INTO `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribu`(`click_window_days`, `engagement_window_days`, `view_window_days`) VALUES (?, ?, ?);

--
-- UPDATE template for table `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribu`
--
UPDATE `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribu` SET `click_window_days` = ?, `engagement_window_days` = ?, `view_window_days` = ? WHERE 1;

--
-- DELETE template for table `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribu`
--
DELETE FROM `OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribu` WHERE 0;

