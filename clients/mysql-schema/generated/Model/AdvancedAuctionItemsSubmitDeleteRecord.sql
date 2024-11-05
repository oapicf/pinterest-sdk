--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionItemsSubmitDeleteRecord' definition.
--


--
-- SELECT template for table `AdvancedAuctionItemsSubmitDeleteRecord`
--
SELECT `item_id`, `country`, `language` FROM `AdvancedAuctionItemsSubmitDeleteRecord` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionItemsSubmitDeleteRecord`
--
INSERT INTO `AdvancedAuctionItemsSubmitDeleteRecord`(`item_id`, `country`, `language`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdvancedAuctionItemsSubmitDeleteRecord`
--
UPDATE `AdvancedAuctionItemsSubmitDeleteRecord` SET `item_id` = ?, `country` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionItemsSubmitDeleteRecord`
--
DELETE FROM `AdvancedAuctionItemsSubmitDeleteRecord` WHERE 0;

