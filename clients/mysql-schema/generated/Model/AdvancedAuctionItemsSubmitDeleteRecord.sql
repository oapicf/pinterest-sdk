--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionItemsSubmitDeleteRecord' definition.
--


--
-- SELECT template for table `AdvancedAuctionItemsSubmitDeleteRecord`
--
SELECT `country`, `item_id`, `language`, `errors` FROM `AdvancedAuctionItemsSubmitDeleteRecord` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionItemsSubmitDeleteRecord`
--
INSERT INTO `AdvancedAuctionItemsSubmitDeleteRecord`(`country`, `item_id`, `language`, `errors`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `AdvancedAuctionItemsSubmitDeleteRecord`
--
UPDATE `AdvancedAuctionItemsSubmitDeleteRecord` SET `country` = ?, `item_id` = ?, `language` = ?, `errors` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionItemsSubmitDeleteRecord`
--
DELETE FROM `AdvancedAuctionItemsSubmitDeleteRecord` WHERE 0;

