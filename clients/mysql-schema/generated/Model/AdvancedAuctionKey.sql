--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdvancedAuctionKey' definition.
--


--
-- SELECT template for table `AdvancedAuctionKey`
--
SELECT `country`, `item_id`, `language` FROM `AdvancedAuctionKey` WHERE 1;

--
-- INSERT template for table `AdvancedAuctionKey`
--
INSERT INTO `AdvancedAuctionKey`(`country`, `item_id`, `language`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdvancedAuctionKey`
--
UPDATE `AdvancedAuctionKey` SET `country` = ?, `item_id` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `AdvancedAuctionKey`
--
DELETE FROM `AdvancedAuctionKey` WHERE 0;

