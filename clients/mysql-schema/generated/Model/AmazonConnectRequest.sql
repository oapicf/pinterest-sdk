--
-- Pinterest REST API.
-- Prepared SQL queries for 'AmazonConnectRequest' definition.
--


--
-- SELECT template for table `AmazonConnectRequest`
--
SELECT `amazon_storefront_id`, `amazon_storefront_name`, `amazon_storefront_url`, `amazon_user_id`, `is_amazon_account_linked`, `one_time_passcode`, `pinterest_user_id` FROM `AmazonConnectRequest` WHERE 1;

--
-- INSERT template for table `AmazonConnectRequest`
--
INSERT INTO `AmazonConnectRequest`(`amazon_storefront_id`, `amazon_storefront_name`, `amazon_storefront_url`, `amazon_user_id`, `is_amazon_account_linked`, `one_time_passcode`, `pinterest_user_id`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AmazonConnectRequest`
--
UPDATE `AmazonConnectRequest` SET `amazon_storefront_id` = ?, `amazon_storefront_name` = ?, `amazon_storefront_url` = ?, `amazon_user_id` = ?, `is_amazon_account_linked` = ?, `one_time_passcode` = ?, `pinterest_user_id` = ? WHERE 1;

--
-- DELETE template for table `AmazonConnectRequest`
--
DELETE FROM `AmazonConnectRequest` WHERE 0;

