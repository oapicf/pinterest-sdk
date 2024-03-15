--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupCommon_optimization_goal_metadata' definition.
--


--
-- SELECT template for table `AdGroupCommon_optimization_goal_metadata`
--
SELECT `conversion_tag_v3_goal_metadata`, `frequency_goal_metadata`, `scrollup_goal_metadata` FROM `AdGroupCommon_optimization_goal_metadata` WHERE 1;

--
-- INSERT template for table `AdGroupCommon_optimization_goal_metadata`
--
INSERT INTO `AdGroupCommon_optimization_goal_metadata`(`conversion_tag_v3_goal_metadata`, `frequency_goal_metadata`, `scrollup_goal_metadata`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdGroupCommon_optimization_goal_metadata`
--
UPDATE `AdGroupCommon_optimization_goal_metadata` SET `conversion_tag_v3_goal_metadata` = ?, `frequency_goal_metadata` = ?, `scrollup_goal_metadata` = ? WHERE 1;

--
-- DELETE template for table `AdGroupCommon_optimization_goal_metadata`
--
DELETE FROM `AdGroupCommon_optimization_goal_metadata` WHERE 0;

