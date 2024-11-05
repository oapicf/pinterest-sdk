--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionItemsSubmitRequest' definition.
--


--
-- SELECT template for table `AdvancedAuctionItemsSubmitRequest`
--
SELECT `catalog_id`, `items` FROM `AdvancedAuctionItemsSubmitRequest` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionItemsSubmitRequest`
--
INSERT INTO `AdvancedAuctionItemsSubmitRequest`(`catalog_id`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `AdvancedAuctionItemsSubmitRequest`
--
UPDATE `AdvancedAuctionItemsSubmitRequest` SET `catalog_id` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionItemsSubmitRequest`
--
DELETE FROM `AdvancedAuctionItemsSubmitRequest` WHERE 0;

