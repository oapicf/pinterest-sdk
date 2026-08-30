--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessToken' definition.
--


--
-- SELECT template for table `OauthAccessToken`
--
SELECT `access_token`, `expires_in`, `refresh_token`, `refresh_token_expires_at`, `refresh_token_expires_in`, `response_type`, `scope`, `token_type` FROM `OauthAccessToken` WHERE 1;

--
-- INSERT template for table `OauthAccessToken`
--
INSERT INTO `OauthAccessToken`(`access_token`, `expires_in`, `refresh_token`, `refresh_token_expires_at`, `refresh_token_expires_in`, `response_type`, `scope`, `token_type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OauthAccessToken`
--
UPDATE `OauthAccessToken` SET `access_token` = ?, `expires_in` = ?, `refresh_token` = ?, `refresh_token_expires_at` = ?, `refresh_token_expires_in` = ?, `response_type` = ?, `scope` = ?, `token_type` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessToken`
--
DELETE FROM `OauthAccessToken` WHERE 0;

