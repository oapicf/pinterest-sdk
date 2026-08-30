--
-- Pinterest REST API.
-- Prepared SQL queries for 'BidOptionsPlacementMultipliers' definition.
--


--
-- SELECT template for table `BidOptionsPlacementMultipliers`
--
SELECT `browse`, `related_pins`, `search` FROM `BidOptionsPlacementMultipliers` WHERE 1;

--
-- INSERT template for table `BidOptionsPlacementMultipliers`
--
INSERT INTO `BidOptionsPlacementMultipliers`(`browse`, `related_pins`, `search`) VALUES (?, ?, ?);

--
-- UPDATE template for table `BidOptionsPlacementMultipliers`
--
UPDATE `BidOptionsPlacementMultipliers` SET `browse` = ?, `related_pins` = ?, `search` = ? WHERE 1;

--
-- DELETE template for table `BidOptionsPlacementMultipliers`
--
DELETE FROM `BidOptionsPlacementMultipliers` WHERE 0;

