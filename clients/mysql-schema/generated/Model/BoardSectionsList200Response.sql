--
-- Pinterest REST API.
-- Prepared SQL queries for 'board_sections_list_200_response' definition.
--


--
-- SELECT template for table `board_sections_list_200_response`
--
SELECT `items`, `bookmark` FROM `board_sections_list_200_response` WHERE 1;

--
-- INSERT template for table `board_sections_list_200_response`
--
INSERT INTO `board_sections_list_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `board_sections_list_200_response`
--
UPDATE `board_sections_list_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `board_sections_list_200_response`
--
DELETE FROM `board_sections_list_200_response` WHERE 0;

