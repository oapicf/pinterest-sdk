--
-- Pinterest REST API.
-- Prepared SQL queries for 'RetailLocalInventoryItemAttributesOptional' definition.
--


--
-- SELECT template for table `RetailLocalInventoryItemAttributesOptional`
--
SELECT `ad_link`, `availability`, `price`, `sale_price` FROM `RetailLocalInventoryItemAttributesOptional` WHERE 1;

--
-- INSERT template for table `RetailLocalInventoryItemAttributesOptional`
--
INSERT INTO `RetailLocalInventoryItemAttributesOptional`(`ad_link`, `availability`, `price`, `sale_price`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `RetailLocalInventoryItemAttributesOptional`
--
UPDATE `RetailLocalInventoryItemAttributesOptional` SET `ad_link` = ?, `availability` = ?, `price` = ?, `sale_price` = ? WHERE 1;

--
-- DELETE template for table `RetailLocalInventoryItemAttributesOptional`
--
DELETE FROM `RetailLocalInventoryItemAttributesOptional` WHERE 0;

