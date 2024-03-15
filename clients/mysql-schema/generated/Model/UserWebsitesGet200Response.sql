--
-- Pinterest REST API.
-- Prepared SQL queries for 'user_websites_get_200_response' definition.
--


--
-- SELECT template for table `user_websites_get_200_response`
--
SELECT `items`, `bookmark` FROM `user_websites_get_200_response` WHERE 1;

--
-- INSERT template for table `user_websites_get_200_response`
--
INSERT INTO `user_websites_get_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `user_websites_get_200_response`
--
UPDATE `user_websites_get_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `user_websites_get_200_response`
--
DELETE FROM `user_websites_get_200_response` WHERE 0;

