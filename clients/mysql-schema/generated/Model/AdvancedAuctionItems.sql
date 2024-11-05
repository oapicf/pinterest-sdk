--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionItems' definition.
--


--
-- SELECT template for table `AdvancedAuctionItems`
--
SELECT `catalog_id`, `items` FROM `AdvancedAuctionItems` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionItems`
--
INSERT INTO `AdvancedAuctionItems`(`catalog_id`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `AdvancedAuctionItems`
--
UPDATE `AdvancedAuctionItems` SET `catalog_id` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionItems`
--
DELETE FROM `AdvancedAuctionItems` WHERE 0;

