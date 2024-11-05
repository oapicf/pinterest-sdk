--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionProcessedItems' definition.
--


--
-- SELECT template for table `AdvancedAuctionProcessedItems`
--
SELECT `catalog_id`, `items` FROM `AdvancedAuctionProcessedItems` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionProcessedItems`
--
INSERT INTO `AdvancedAuctionProcessedItems`(`catalog_id`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `AdvancedAuctionProcessedItems`
--
UPDATE `AdvancedAuctionProcessedItems` SET `catalog_id` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionProcessedItems`
--
DELETE FROM `AdvancedAuctionProcessedItems` WHERE 0;

