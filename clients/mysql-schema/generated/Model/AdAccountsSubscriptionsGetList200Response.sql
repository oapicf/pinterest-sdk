--
-- Pinterest REST API.
-- Prepared SQL queries for 'ad_accounts_subscriptions_get_list_200_response' definition.
--


--
-- SELECT template for table `ad_accounts_subscriptions_get_list_200_response`
--
SELECT `bookmark`, `items` FROM `ad_accounts_subscriptions_get_list_200_response` WHERE 1;

--
-- INSERT template for table `ad_accounts_subscriptions_get_list_200_response`
--
INSERT INTO `ad_accounts_subscriptions_get_list_200_response`(`bookmark`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `ad_accounts_subscriptions_get_list_200_response`
--
UPDATE `ad_accounts_subscriptions_get_list_200_response` SET `bookmark` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `ad_accounts_subscriptions_get_list_200_response`
--
DELETE FROM `ad_accounts_subscriptions_get_list_200_response` WHERE 0;

