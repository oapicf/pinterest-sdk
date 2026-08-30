--
-- Pinterest REST API.
-- Prepared SQL queries for 'ItemIdStoreCodePair' definition.
--


--
-- SELECT template for table `ItemIdStoreCodePair`
--
SELECT `item_id`, `store_code` FROM `ItemIdStoreCodePair` WHERE 1;

--
-- INSERT template for table `ItemIdStoreCodePair`
--
INSERT INTO `ItemIdStoreCodePair`(`item_id`, `store_code`) VALUES (?, ?);

--
-- UPDATE template for table `ItemIdStoreCodePair`
--
UPDATE `ItemIdStoreCodePair` SET `item_id` = ?, `store_code` = ? WHERE 1;

--
-- DELETE template for table `ItemIdStoreCodePair`
--
DELETE FROM `ItemIdStoreCodePair` WHERE 0;

