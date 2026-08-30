--
-- Pinterest REST API.
-- Prepared SQL queries for 'LocalInventoryItemResponse' definition.
--


--
-- SELECT template for table `LocalInventoryItemResponse`
--
SELECT `ad_link`, `availability`, `created_at`, `item_id`, `last_updated_time`, `price`, `sale_price`, `store_metadata` FROM `LocalInventoryItemResponse` WHERE 1;

--
-- INSERT template for table `LocalInventoryItemResponse`
--
INSERT INTO `LocalInventoryItemResponse`(`ad_link`, `availability`, `created_at`, `item_id`, `last_updated_time`, `price`, `sale_price`, `store_metadata`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LocalInventoryItemResponse`
--
UPDATE `LocalInventoryItemResponse` SET `ad_link` = ?, `availability` = ?, `created_at` = ?, `item_id` = ?, `last_updated_time` = ?, `price` = ?, `sale_price` = ?, `store_metadata` = ? WHERE 1;

--
-- DELETE template for table `LocalInventoryItemResponse`
--
DELETE FROM `LocalInventoryItemResponse` WHERE 0;

