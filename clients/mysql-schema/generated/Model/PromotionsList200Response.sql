--
-- Pinterest REST API.
-- Prepared SQL queries for 'promotions_list_200_response' definition.
--


--
-- SELECT template for table `promotions_list_200_response`
--
SELECT `bookmark`, `items` FROM `promotions_list_200_response` WHERE 1;

--
-- INSERT template for table `promotions_list_200_response`
--
INSERT INTO `promotions_list_200_response`(`bookmark`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `promotions_list_200_response`
--
UPDATE `promotions_list_200_response` SET `bookmark` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `promotions_list_200_response`
--
DELETE FROM `promotions_list_200_response` WHERE 0;

