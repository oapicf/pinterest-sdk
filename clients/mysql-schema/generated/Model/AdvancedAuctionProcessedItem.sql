--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionProcessedItem' definition.
--


--
-- SELECT template for table `AdvancedAuctionProcessedItem`
--
SELECT `operation`, `item_id`, `country`, `language`, `bid_options`, `update_mask`, `errors` FROM `AdvancedAuctionProcessedItem` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionProcessedItem`
--
INSERT INTO `AdvancedAuctionProcessedItem`(`operation`, `item_id`, `country`, `language`, `bid_options`, `update_mask`, `errors`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdvancedAuctionProcessedItem`
--
UPDATE `AdvancedAuctionProcessedItem` SET `operation` = ?, `item_id` = ?, `country` = ?, `language` = ?, `bid_options` = ?, `update_mask` = ?, `errors` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionProcessedItem`
--
DELETE FROM `AdvancedAuctionProcessedItem` WHERE 0;

