--
-- Pinterest REST API.
-- Prepared SQL queries for 'pins_list_200_response' definition.
--


--
-- SELECT template for table `pins_list_200_response`
--
SELECT `bookmark`, `items` FROM `pins_list_200_response` WHERE 1;

--
-- INSERT template for table `pins_list_200_response`
--
INSERT INTO `pins_list_200_response`(`bookmark`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `pins_list_200_response`
--
UPDATE `pins_list_200_response` SET `bookmark` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `pins_list_200_response`
--
DELETE FROM `pins_list_200_response` WHERE 0;

