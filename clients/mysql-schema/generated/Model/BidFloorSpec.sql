--
-- Pinterest REST API.
-- Prepared SQL queries for 'BidFloorSpec' definition.
--


--
-- SELECT template for table `BidFloorSpec`
--
SELECT `countries`, `currency`, `objective_type`, `billable_event`, `optimization_goal_metadata`, `creative_type` FROM `BidFloorSpec` WHERE 1;

--
-- INSERT template for table `BidFloorSpec`
--
INSERT INTO `BidFloorSpec`(`countries`, `currency`, `objective_type`, `billable_event`, `optimization_goal_metadata`, `creative_type`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BidFloorSpec`
--
UPDATE `BidFloorSpec` SET `countries` = ?, `currency` = ?, `objective_type` = ?, `billable_event` = ?, `optimization_goal_metadata` = ?, `creative_type` = ? WHERE 1;

--
-- DELETE template for table `BidFloorSpec`
--
DELETE FROM `BidFloorSpec` WHERE 0;

