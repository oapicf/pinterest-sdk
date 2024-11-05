--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionItemsGetRequest' definition.
--


--
-- SELECT template for table `AdvancedAuctionItemsGetRequest`
--
SELECT `catalog_id`, `items` FROM `AdvancedAuctionItemsGetRequest` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionItemsGetRequest`
--
INSERT INTO `AdvancedAuctionItemsGetRequest`(`catalog_id`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `AdvancedAuctionItemsGetRequest`
--
UPDATE `AdvancedAuctionItemsGetRequest` SET `catalog_id` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionItemsGetRequest`
--
DELETE FROM `AdvancedAuctionItemsGetRequest` WHERE 0;

