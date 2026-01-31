--
-- Pinterest REST API.
-- Prepared SQL queries for 'BidFloorSpec' definition.
--


--
-- SELECT template for table `BidFloorSpec`
--
SELECT `billable_event`, `countries`, `creative_type`, `currency`, `objective_type`, `optimization_goal_metadata` FROM `BidFloorSpec` WHERE 1;

--
-- INSERT template for table `BidFloorSpec`
--
INSERT INTO `BidFloorSpec`(`billable_event`, `countries`, `creative_type`, `currency`, `objective_type`, `optimization_goal_metadata`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BidFloorSpec`
--
UPDATE `BidFloorSpec` SET `billable_event` = ?, `countries` = ?, `creative_type` = ?, `currency` = ?, `objective_type` = ?, `optimization_goal_metadata` = ? WHERE 1;

--
-- DELETE template for table `BidFloorSpec`
--
DELETE FROM `BidFloorSpec` WHERE 0;

