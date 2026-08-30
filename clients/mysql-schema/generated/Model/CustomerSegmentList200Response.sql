--
-- Pinterest REST API.
-- Prepared SQL queries for 'customer_segment_list_200_response' definition.
--


--
-- SELECT template for table `customer_segment_list_200_response`
--
SELECT `bookmark`, `items` FROM `customer_segment_list_200_response` WHERE 1;

--
-- INSERT template for table `customer_segment_list_200_response`
--
INSERT INTO `customer_segment_list_200_response`(`bookmark`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `customer_segment_list_200_response`
--
UPDATE `customer_segment_list_200_response` SET `bookmark` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `customer_segment_list_200_response`
--
DELETE FROM `customer_segment_list_200_response` WHERE 0;

