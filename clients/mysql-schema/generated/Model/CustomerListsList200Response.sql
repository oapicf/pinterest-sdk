--
-- Pinterest REST API.
-- Prepared SQL queries for 'customer_lists_list_200_response' definition.
--


--
-- SELECT template for table `customer_lists_list_200_response`
--
SELECT `items`, `bookmark` FROM `customer_lists_list_200_response` WHERE 1;

--
-- INSERT template for table `customer_lists_list_200_response`
--
INSERT INTO `customer_lists_list_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `customer_lists_list_200_response`
--
UPDATE `customer_lists_list_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `customer_lists_list_200_response`
--
DELETE FROM `customer_lists_list_200_response` WHERE 0;

