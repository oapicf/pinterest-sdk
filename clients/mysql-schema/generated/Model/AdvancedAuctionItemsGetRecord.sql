--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionItemsGetRecord' definition.
--


--
-- SELECT template for table `AdvancedAuctionItemsGetRecord`
--
SELECT `country`, `item_id`, `language` FROM `AdvancedAuctionItemsGetRecord` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionItemsGetRecord`
--
INSERT INTO `AdvancedAuctionItemsGetRecord`(`country`, `item_id`, `language`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdvancedAuctionItemsGetRecord`
--
UPDATE `AdvancedAuctionItemsGetRecord` SET `country` = ?, `item_id` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionItemsGetRecord`
--
DELETE FROM `AdvancedAuctionItemsGetRecord` WHERE 0;

