--
-- Pinterest REST API.
-- Prepared SQL queries for 'search_user_boards_get_200_response' definition.
--


--
-- SELECT template for table `search_user_boards_get_200_response`
--
SELECT `items`, `bookmark` FROM `search_user_boards_get_200_response` WHERE 1;

--
-- INSERT template for table `search_user_boards_get_200_response`
--
INSERT INTO `search_user_boards_get_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `search_user_boards_get_200_response`
--
UPDATE `search_user_boards_get_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `search_user_boards_get_200_response`
--
DELETE FROM `search_user_boards_get_200_response` WHERE 0;

