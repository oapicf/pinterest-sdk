--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionTagV3GoalMetadata' definition.
--


--
-- SELECT template for table `ConversionTagV3GoalMetadata`
--
SELECT `attribution_windows`, `conversion_event`, `conversion_tag_id`, `cpa_goal_value_in_micro_currency`, `is_roas_optimized`, `reporting_event` FROM `ConversionTagV3GoalMetadata` WHERE 1;

--
-- INSERT template for table `ConversionTagV3GoalMetadata`
--
INSERT INTO `ConversionTagV3GoalMetadata`(`attribution_windows`, `conversion_event`, `conversion_tag_id`, `cpa_goal_value_in_micro_currency`, `is_roas_optimized`, `reporting_event`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionTagV3GoalMetadata`
--
UPDATE `ConversionTagV3GoalMetadata` SET `attribution_windows` = ?, `conversion_event` = ?, `conversion_tag_id` = ?, `cpa_goal_value_in_micro_currency` = ?, `is_roas_optimized` = ?, `reporting_event` = ? WHERE 1;

--
-- DELETE template for table `ConversionTagV3GoalMetadata`
--
DELETE FROM `ConversionTagV3GoalMetadata` WHERE 0;

