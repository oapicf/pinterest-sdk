--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionBidOptions' definition.
--


--
-- SELECT template for table `AdvancedAuctionBidOptions`
--
SELECT `app_type_multipliers`, `bid_in_micro_currency`, `placement_multipliers` FROM `AdvancedAuctionBidOptions` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionBidOptions`
--
INSERT INTO `AdvancedAuctionBidOptions`(`app_type_multipliers`, `bid_in_micro_currency`, `placement_multipliers`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdvancedAuctionBidOptions`
--
UPDATE `AdvancedAuctionBidOptions` SET `app_type_multipliers` = ?, `bid_in_micro_currency` = ?, `placement_multipliers` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionBidOptions`
--
DELETE FROM `AdvancedAuctionBidOptions` WHERE 0;

