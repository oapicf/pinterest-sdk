--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionItemsSubmitDeleteRecord' definition.
--


--
-- SELECT template for table `AdvancedAuctionItemsSubmitDeleteRecord`
--
SELECT `country`, `errors`, `item_id`, `language`, `operation` FROM `AdvancedAuctionItemsSubmitDeleteRecord` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionItemsSubmitDeleteRecord`
--
INSERT INTO `AdvancedAuctionItemsSubmitDeleteRecord`(`country`, `errors`, `item_id`, `language`, `operation`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdvancedAuctionItemsSubmitDeleteRecord`
--
UPDATE `AdvancedAuctionItemsSubmitDeleteRecord` SET `country` = ?, `errors` = ?, `item_id` = ?, `language` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionItemsSubmitDeleteRecord`
--
DELETE FROM `AdvancedAuctionItemsSubmitDeleteRecord` WHERE 0;

