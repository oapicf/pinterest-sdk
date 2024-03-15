--
-- Pinterest REST API.
-- Prepared SQL queries for 'pins_list_200_response' definition.
--


--
-- SELECT template for table `pins_list_200_response`
--
SELECT `items`, `bookmark` FROM `pins_list_200_response` WHERE 1;

--
-- INSERT template for table `pins_list_200_response`
--
INSERT INTO `pins_list_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `pins_list_200_response`
--
UPDATE `pins_list_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `pins_list_200_response`
--
DELETE FROM `pins_list_200_response` WHERE 0;

