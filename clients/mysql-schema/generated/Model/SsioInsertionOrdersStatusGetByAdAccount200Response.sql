--
-- Pinterest REST API.
-- Prepared SQL queries for 'ssio_insertion_orders_status_get_by_ad_account_200_response' definition.
--


--
-- SELECT template for table `ssio_insertion_orders_status_get_by_ad_account_200_response`
--
SELECT `items`, `bookmark` FROM `ssio_insertion_orders_status_get_by_ad_account_200_response` WHERE 1;

--
-- INSERT template for table `ssio_insertion_orders_status_get_by_ad_account_200_response`
--
INSERT INTO `ssio_insertion_orders_status_get_by_ad_account_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `ssio_insertion_orders_status_get_by_ad_account_200_response`
--
UPDATE `ssio_insertion_orders_status_get_by_ad_account_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `ssio_insertion_orders_status_get_by_ad_account_200_response`
--
DELETE FROM `ssio_insertion_orders_status_get_by_ad_account_200_response` WHERE 0;

