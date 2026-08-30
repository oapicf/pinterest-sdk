--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupCreateRequestAllOf1' definition.
--


--
-- SELECT template for table `AdGroupCreateRequestAllOf1`
--
SELECT `auto_targeting_enabled`, `bid_multiplier`, `budget_type`, `pacing_delivery_type` FROM `AdGroupCreateRequestAllOf1` WHERE 1;

--
-- INSERT template for table `AdGroupCreateRequestAllOf1`
--
INSERT INTO `AdGroupCreateRequestAllOf1`(`auto_targeting_enabled`, `bid_multiplier`, `budget_type`, `pacing_delivery_type`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `AdGroupCreateRequestAllOf1`
--
UPDATE `AdGroupCreateRequestAllOf1` SET `auto_targeting_enabled` = ?, `bid_multiplier` = ?, `budget_type` = ?, `pacing_delivery_type` = ? WHERE 1;

--
-- DELETE template for table `AdGroupCreateRequestAllOf1`
--
DELETE FROM `AdGroupCreateRequestAllOf1` WHERE 0;

