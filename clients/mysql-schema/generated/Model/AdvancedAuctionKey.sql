--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionKey' definition.
--


--
-- SELECT template for table `AdvancedAuctionKey`
--
SELECT `item_id`, `country`, `language` FROM `AdvancedAuctionKey` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionKey`
--
INSERT INTO `AdvancedAuctionKey`(`item_id`, `country`, `language`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdvancedAuctionKey`
--
UPDATE `AdvancedAuctionKey` SET `item_id` = ?, `country` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionKey`
--
DELETE FROM `AdvancedAuctionKey` WHERE 0;

