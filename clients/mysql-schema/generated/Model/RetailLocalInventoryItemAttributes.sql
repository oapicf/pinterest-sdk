--
-- Pinterest REST API.
-- Prepared SQL queries for 'RetailLocalInventoryItemAttributes' definition.
--


--
-- SELECT template for table `RetailLocalInventoryItemAttributes`
--
SELECT `ad_link`, `availability`, `price`, `sale_price` FROM `RetailLocalInventoryItemAttributes` WHERE 1;

--
-- INSERT template for table `RetailLocalInventoryItemAttributes`
--
INSERT INTO `RetailLocalInventoryItemAttributes`(`ad_link`, `availability`, `price`, `sale_price`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `RetailLocalInventoryItemAttributes`
--
UPDATE `RetailLocalInventoryItemAttributes` SET `ad_link` = ?, `availability` = ?, `price` = ?, `sale_price` = ? WHERE 1;

--
-- DELETE template for table `RetailLocalInventoryItemAttributes`
--
DELETE FROM `RetailLocalInventoryItemAttributes` WHERE 0;

