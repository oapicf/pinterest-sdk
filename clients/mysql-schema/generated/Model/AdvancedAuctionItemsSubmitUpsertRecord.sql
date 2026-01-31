--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionItemsSubmitUpsertRecord' definition.
--


--
-- SELECT template for table `AdvancedAuctionItemsSubmitUpsertRecord`
--
SELECT `country`, `item_id`, `language`, `bid_options`, `errors`, `update_mask` FROM `AdvancedAuctionItemsSubmitUpsertRecord` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionItemsSubmitUpsertRecord`
--
INSERT INTO `AdvancedAuctionItemsSubmitUpsertRecord`(`country`, `item_id`, `language`, `bid_options`, `errors`, `update_mask`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdvancedAuctionItemsSubmitUpsertRecord`
--
UPDATE `AdvancedAuctionItemsSubmitUpsertRecord` SET `country` = ?, `item_id` = ?, `language` = ?, `bid_options` = ?, `errors` = ?, `update_mask` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionItemsSubmitUpsertRecord`
--
DELETE FROM `AdvancedAuctionItemsSubmitUpsertRecord` WHERE 0;

