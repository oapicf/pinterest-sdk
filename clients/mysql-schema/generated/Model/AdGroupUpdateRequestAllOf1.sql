--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupUpdateRequestAllOf1' definition.
--


--
-- SELECT template for table `AdGroupUpdateRequestAllOf1`
--
SELECT `bid_multiplier`, `id`, `targeting_spec_operations` FROM `AdGroupUpdateRequestAllOf1` WHERE 1;

--
-- INSERT template for table `AdGroupUpdateRequestAllOf1`
--
INSERT INTO `AdGroupUpdateRequestAllOf1`(`bid_multiplier`, `id`, `targeting_spec_operations`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdGroupUpdateRequestAllOf1`
--
UPDATE `AdGroupUpdateRequestAllOf1` SET `bid_multiplier` = ?, `id` = ?, `targeting_spec_operations` = ? WHERE 1;

--
-- DELETE template for table `AdGroupUpdateRequestAllOf1`
--
DELETE FROM `AdGroupUpdateRequestAllOf1` WHERE 0;

