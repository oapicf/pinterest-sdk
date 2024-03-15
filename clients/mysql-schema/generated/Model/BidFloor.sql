--
-- Pinterest REST API.
-- Prepared SQL queries for 'BidFloor' definition.
--


--
-- SELECT template for table `BidFloor`
--
SELECT `bid_floors`, `type` FROM `BidFloor` WHERE 1;

--
-- INSERT template for table `BidFloor`
--
INSERT INTO `BidFloor`(`bid_floors`, `type`) VALUES (?, ?);

--
-- UPDATE template for table `BidFloor`
--
UPDATE `BidFloor` SET `bid_floors` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `BidFloor`
--
DELETE FROM `BidFloor` WHERE 0;

