--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionItemsSubmitUpsertRecord' definition.
--


--
-- SELECT template for table `AdvancedAuctionItemsSubmitUpsertRecord`
--
SELECT `item_id`, `country`, `language`, `bid_options`, `update_mask` FROM `AdvancedAuctionItemsSubmitUpsertRecord` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionItemsSubmitUpsertRecord`
--
INSERT INTO `AdvancedAuctionItemsSubmitUpsertRecord`(`item_id`, `country`, `language`, `bid_options`, `update_mask`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdvancedAuctionItemsSubmitUpsertRecord`
--
UPDATE `AdvancedAuctionItemsSubmitUpsertRecord` SET `item_id` = ?, `country` = ?, `language` = ?, `bid_options` = ?, `update_mask` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionItemsSubmitUpsertRecord`
--
DELETE FROM `AdvancedAuctionItemsSubmitUpsertRecord` WHERE 0;

