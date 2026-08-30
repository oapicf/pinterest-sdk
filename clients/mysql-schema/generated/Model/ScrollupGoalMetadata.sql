--
-- Pinterest REST API.
-- Prepared SQL queries for 'ScrollupGoalMetadata' definition.
--


--
-- SELECT template for table `ScrollupGoalMetadata`
--
SELECT `scrollup_goal_value_in_micro_currency` FROM `ScrollupGoalMetadata` WHERE 1;

--
-- INSERT template for table `ScrollupGoalMetadata`
--
INSERT INTO `ScrollupGoalMetadata`(`scrollup_goal_value_in_micro_currency`) VALUES (?);

--
-- UPDATE template for table `ScrollupGoalMetadata`
--
UPDATE `ScrollupGoalMetadata` SET `scrollup_goal_value_in_micro_currency` = ? WHERE 1;

--
-- DELETE template for table `ScrollupGoalMetadata`
--
DELETE FROM `ScrollupGoalMetadata` WHERE 0;

