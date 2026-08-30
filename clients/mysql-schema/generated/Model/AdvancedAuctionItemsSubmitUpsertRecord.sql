--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionItemsSubmitUpsertRecord' definition.
--


--
-- SELECT template for table `AdvancedAuctionItemsSubmitUpsertRecord`
--
SELECT `bid_options`, `country`, `errors`, `item_id`, `language`, `operation`, `update_mask` FROM `AdvancedAuctionItemsSubmitUpsertRecord` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionItemsSubmitUpsertRecord`
--
INSERT INTO `AdvancedAuctionItemsSubmitUpsertRecord`(`bid_options`, `country`, `errors`, `item_id`, `language`, `operation`, `update_mask`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdvancedAuctionItemsSubmitUpsertRecord`
--
UPDATE `AdvancedAuctionItemsSubmitUpsertRecord` SET `bid_options` = ?, `country` = ?, `errors` = ?, `item_id` = ?, `language` = ?, `operation` = ?, `update_mask` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionItemsSubmitUpsertRecord`
--
DELETE FROM `AdvancedAuctionItemsSubmitUpsertRecord` WHERE 0;

