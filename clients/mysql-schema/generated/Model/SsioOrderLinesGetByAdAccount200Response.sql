--
-- Pinterest REST API.
-- Prepared SQL queries for 'ssio_order_lines_get_by_ad_account_200_response' definition.
--


--
-- SELECT template for table `ssio_order_lines_get_by_ad_account_200_response`
--
SELECT `bookmark`, `items` FROM `ssio_order_lines_get_by_ad_account_200_response` WHERE 1;

--
-- INSERT template for table `ssio_order_lines_get_by_ad_account_200_response`
--
INSERT INTO `ssio_order_lines_get_by_ad_account_200_response`(`bookmark`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `ssio_order_lines_get_by_ad_account_200_response`
--
UPDATE `ssio_order_lines_get_by_ad_account_200_response` SET `bookmark` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `ssio_order_lines_get_by_ad_account_200_response`
--
DELETE FROM `ssio_order_lines_get_by_ad_account_200_response` WHERE 0;

