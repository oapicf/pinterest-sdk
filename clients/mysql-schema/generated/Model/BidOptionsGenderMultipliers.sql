--
-- Pinterest REST API.
-- Prepared SQL queries for 'BidOptionsGenderMultipliers' definition.
--


--
-- SELECT template for table `BidOptionsGenderMultipliers`
--
SELECT `female`, `male` FROM `BidOptionsGenderMultipliers` WHERE 1;

--
-- INSERT template for table `BidOptionsGenderMultipliers`
--
INSERT INTO `BidOptionsGenderMultipliers`(`female`, `male`) VALUES (?, ?);

--
-- UPDATE template for table `BidOptionsGenderMultipliers`
--
UPDATE `BidOptionsGenderMultipliers` SET `female` = ?, `male` = ? WHERE 1;

--
-- DELETE template for table `BidOptionsGenderMultipliers`
--
DELETE FROM `BidOptionsGenderMultipliers` WHERE 0;

