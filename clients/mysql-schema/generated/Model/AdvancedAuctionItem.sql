--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionItem' definition.
--


--
-- SELECT template for table `AdvancedAuctionItem`
--
SELECT `country`, `item_id`, `language`, `bid_options` FROM `AdvancedAuctionItem` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionItem`
--
INSERT INTO `AdvancedAuctionItem`(`country`, `item_id`, `language`, `bid_options`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `AdvancedAuctionItem`
--
UPDATE `AdvancedAuctionItem` SET `country` = ?, `item_id` = ?, `language` = ?, `bid_options` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionItem`
--
DELETE FROM `AdvancedAuctionItem` WHERE 0;

