--
-- Pinterest REST API.
-- Prepared SQL queries for 'boards_list_200_response' definition.
--


--
-- SELECT template for table `boards_list_200_response`
--
SELECT `items`, `bookmark` FROM `boards_list_200_response` WHERE 1;

--
-- INSERT template for table `boards_list_200_response`
--
INSERT INTO `boards_list_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `boards_list_200_response`
--
UPDATE `boards_list_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `boards_list_200_response`
--
DELETE FROM `boards_list_200_response` WHERE 0;

