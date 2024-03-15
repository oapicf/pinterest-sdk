--
-- Pinterest REST API.
-- Prepared SQL queries for 'order_lines_list_200_response' definition.
--


--
-- SELECT template for table `order_lines_list_200_response`
--
SELECT `items`, `bookmark` FROM `order_lines_list_200_response` WHERE 1;

--
-- INSERT template for table `order_lines_list_200_response`
--
INSERT INTO `order_lines_list_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `order_lines_list_200_response`
--
UPDATE `order_lines_list_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `order_lines_list_200_response`
--
DELETE FROM `order_lines_list_200_response` WHERE 0;

