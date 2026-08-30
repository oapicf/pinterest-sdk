--
-- Pinterest REST API.
-- Prepared SQL queries for 'BidFloorCreate' definition.
--


--
-- SELECT template for table `BidFloorCreate`
--
SELECT `bid_floor_specs`, `targeting_spec` FROM `BidFloorCreate` WHERE 1;

--
-- INSERT template for table `BidFloorCreate`
--
INSERT INTO `BidFloorCreate`(`bid_floor_specs`, `targeting_spec`) VALUES (?, ?);

--
-- UPDATE template for table `BidFloorCreate`
--
UPDATE `BidFloorCreate` SET `bid_floor_specs` = ?, `targeting_spec` = ? WHERE 1;

--
-- DELETE template for table `BidFloorCreate`
--
DELETE FROM `BidFloorCreate` WHERE 0;

