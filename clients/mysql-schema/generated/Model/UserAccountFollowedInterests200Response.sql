--
-- Pinterest REST API.
-- Prepared SQL queries for 'user_account_followed_interests_200_response' definition.
--


--
-- SELECT template for table `user_account_followed_interests_200_response`
--
SELECT `bookmark`, `items` FROM `user_account_followed_interests_200_response` WHERE 1;

--
-- INSERT template for table `user_account_followed_interests_200_response`
--
INSERT INTO `user_account_followed_interests_200_response`(`bookmark`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `user_account_followed_interests_200_response`
--
UPDATE `user_account_followed_interests_200_response` SET `bookmark` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `user_account_followed_interests_200_response`
--
DELETE FROM `user_account_followed_interests_200_response` WHERE 0;

