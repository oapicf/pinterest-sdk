--
-- Pinterest REST API.
-- Prepared SQL queries for 'user_following_get_200_response' definition.
--


--
-- SELECT template for table `user_following_get_200_response`
--
SELECT `bookmark`, `items` FROM `user_following_get_200_response` WHERE 1;

--
-- INSERT template for table `user_following_get_200_response`
--
INSERT INTO `user_following_get_200_response`(`bookmark`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `user_following_get_200_response`
--
UPDATE `user_following_get_200_response` SET `bookmark` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `user_following_get_200_response`
--
DELETE FROM `user_following_get_200_response` WHERE 0;

