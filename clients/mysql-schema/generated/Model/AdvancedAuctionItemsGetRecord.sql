--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionItemsGetRecord' definition.
--


--
-- SELECT template for table `AdvancedAuctionItemsGetRecord`
--
SELECT `item_id`, `country`, `language` FROM `AdvancedAuctionItemsGetRecord` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionItemsGetRecord`
--
INSERT INTO `AdvancedAuctionItemsGetRecord`(`item_id`, `country`, `language`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdvancedAuctionItemsGetRecord`
--
UPDATE `AdvancedAuctionItemsGetRecord` SET `item_id` = ?, `country` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionItemsGetRecord`
--
DELETE FROM `AdvancedAuctionItemsGetRecord` WHERE 0;

