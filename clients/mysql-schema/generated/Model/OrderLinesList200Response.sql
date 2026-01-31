--
-- Pinterest REST API.
-- Prepared SQL queries for 'order_lines_list_200_response' definition.
--


--
-- SELECT template for table `order_lines_list_200_response`
--
SELECT `bookmark`, `items` FROM `order_lines_list_200_response` WHERE 1;

--
-- INSERT template for table `order_lines_list_200_response`
--
INSERT INTO `order_lines_list_200_response`(`bookmark`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `order_lines_list_200_response`
--
UPDATE `order_lines_list_200_response` SET `bookmark` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `order_lines_list_200_response`
--
DELETE FROM `order_lines_list_200_response` WHERE 0;

