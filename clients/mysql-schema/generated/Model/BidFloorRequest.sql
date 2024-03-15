--
-- Pinterest REST API.
-- Prepared SQL queries for 'BidFloorRequest' definition.
--


--
-- SELECT template for table `BidFloorRequest`
--
SELECT `bid_floor_specs`, `targeting_spec` FROM `BidFloorRequest` WHERE 1;

--
-- INSERT template for table `BidFloorRequest`
--
INSERT INTO `BidFloorRequest`(`bid_floor_specs`, `targeting_spec`) VALUES (?, ?);

--
-- UPDATE template for table `BidFloorRequest`
--
UPDATE `BidFloorRequest` SET `bid_floor_specs` = ?, `targeting_spec` = ? WHERE 1;

--
-- DELETE template for table `BidFloorRequest`
--
DELETE FROM `BidFloorRequest` WHERE 0;

