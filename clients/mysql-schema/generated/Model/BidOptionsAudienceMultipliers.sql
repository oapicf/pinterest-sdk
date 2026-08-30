--
-- Pinterest REST API.
-- Prepared SQL queries for 'BidOptionsAudienceMultipliers' definition.
--


--
-- SELECT template for table `BidOptionsAudienceMultipliers`
--
SELECT `audience_id`, `multiplier` FROM `BidOptionsAudienceMultipliers` WHERE 1;

--
-- INSERT template for table `BidOptionsAudienceMultipliers`
--
INSERT INTO `BidOptionsAudienceMultipliers`(`audience_id`, `multiplier`) VALUES (?, ?);

--
-- UPDATE template for table `BidOptionsAudienceMultipliers`
--
UPDATE `BidOptionsAudienceMultipliers` SET `audience_id` = ?, `multiplier` = ? WHERE 1;

--
-- DELETE template for table `BidOptionsAudienceMultipliers`
--
DELETE FROM `BidOptionsAudienceMultipliers` WHERE 0;

