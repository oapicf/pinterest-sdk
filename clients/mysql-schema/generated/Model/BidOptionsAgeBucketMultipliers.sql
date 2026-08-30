--
-- Pinterest REST API.
-- Prepared SQL queries for 'BidOptionsAgeBucketMultipliers' definition.
--


--
-- SELECT template for table `BidOptionsAgeBucketMultipliers`
--
SELECT `18-24`, `25-34`, `35-44`, `45-49`, `50-54`, `55-64`, `65+` FROM `BidOptionsAgeBucketMultipliers` WHERE 1;

--
-- INSERT template for table `BidOptionsAgeBucketMultipliers`
--
INSERT INTO `BidOptionsAgeBucketMultipliers`(`18-24`, `25-34`, `35-44`, `45-49`, `50-54`, `55-64`, `65+`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BidOptionsAgeBucketMultipliers`
--
UPDATE `BidOptionsAgeBucketMultipliers` SET `18-24` = ?, `25-34` = ?, `35-44` = ?, `45-49` = ?, `50-54` = ?, `55-64` = ?, `65+` = ? WHERE 1;

--
-- DELETE template for table `BidOptionsAgeBucketMultipliers`
--
DELETE FROM `BidOptionsAgeBucketMultipliers` WHERE 0;

