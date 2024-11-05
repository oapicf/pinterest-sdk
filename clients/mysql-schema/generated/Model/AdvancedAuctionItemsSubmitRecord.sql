--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionItemsSubmitRecord' definition.
--


--
-- SELECT template for table `AdvancedAuctionItemsSubmitRecord`
--
SELECT `operation`, `item_id`, `country`, `language`, `bid_options`, `update_mask` FROM `AdvancedAuctionItemsSubmitRecord` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionItemsSubmitRecord`
--
INSERT INTO `AdvancedAuctionItemsSubmitRecord`(`operation`, `item_id`, `country`, `language`, `bid_options`, `update_mask`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdvancedAuctionItemsSubmitRecord`
--
UPDATE `AdvancedAuctionItemsSubmitRecord` SET `operation` = ?, `item_id` = ?, `country` = ?, `language` = ?, `bid_options` = ?, `update_mask` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionItemsSubmitRecord`
--
DELETE FROM `AdvancedAuctionItemsSubmitRecord` WHERE 0;

