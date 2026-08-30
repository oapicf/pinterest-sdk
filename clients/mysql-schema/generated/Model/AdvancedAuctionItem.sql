--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionItem' definition.
--


--
-- SELECT template for table `AdvancedAuctionItem`
--
SELECT `bid_options`, `country`, `item_id`, `language` FROM `AdvancedAuctionItem` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionItem`
--
INSERT INTO `AdvancedAuctionItem`(`bid_options`, `country`, `item_id`, `language`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `AdvancedAuctionItem`
--
UPDATE `AdvancedAuctionItem` SET `bid_options` = ?, `country` = ?, `item_id` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionItem`
--
DELETE FROM `AdvancedAuctionItem` WHERE 0;

