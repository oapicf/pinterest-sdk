--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionItemsSubmitRecord' definition.
--


--
-- SELECT template for table `AdvancedAuctionItemsSubmitRecord`
--
SELECT `bid_options`, `country`, `errors`, `item_id`, `language`, `operation`, `update_mask` FROM `AdvancedAuctionItemsSubmitRecord` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionItemsSubmitRecord`
--
INSERT INTO `AdvancedAuctionItemsSubmitRecord`(`bid_options`, `country`, `errors`, `item_id`, `language`, `operation`, `update_mask`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdvancedAuctionItemsSubmitRecord`
--
UPDATE `AdvancedAuctionItemsSubmitRecord` SET `bid_options` = ?, `country` = ?, `errors` = ?, `item_id` = ?, `language` = ?, `operation` = ?, `update_mask` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionItemsSubmitRecord`
--
DELETE FROM `AdvancedAuctionItemsSubmitRecord` WHERE 0;

