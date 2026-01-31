--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionItemsSubmitRecord' definition.
--


--
-- SELECT template for table `AdvancedAuctionItemsSubmitRecord`
--
SELECT `operation`, `country`, `item_id`, `language`, `bid_options`, `errors`, `update_mask` FROM `AdvancedAuctionItemsSubmitRecord` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionItemsSubmitRecord`
--
INSERT INTO `AdvancedAuctionItemsSubmitRecord`(`operation`, `country`, `item_id`, `language`, `bid_options`, `errors`, `update_mask`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdvancedAuctionItemsSubmitRecord`
--
UPDATE `AdvancedAuctionItemsSubmitRecord` SET `operation` = ?, `country` = ?, `item_id` = ?, `language` = ?, `bid_options` = ?, `errors` = ?, `update_mask` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionItemsSubmitRecord`
--
DELETE FROM `AdvancedAuctionItemsSubmitRecord` WHERE 0;

