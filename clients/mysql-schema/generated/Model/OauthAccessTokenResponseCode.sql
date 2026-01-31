--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenResponseCode' definition.
--


--
-- SELECT template for table `OauthAccessTokenResponseCode`
--
SELECT `refresh_token`, `refresh_token_expires_at`, `refresh_token_expires_in`, `access_token`, `expires_in`, `response_type`, `scope`, `token_type` FROM `OauthAccessTokenResponseCode` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenResponseCode`
--
INSERT INTO `OauthAccessTokenResponseCode`(`refresh_token`, `refresh_token_expires_at`, `refresh_token_expires_in`, `access_token`, `expires_in`, `response_type`, `scope`, `token_type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OauthAccessTokenResponseCode`
--
UPDATE `OauthAccessTokenResponseCode` SET `refresh_token` = ?, `refresh_token_expires_at` = ?, `refresh_token_expires_in` = ?, `access_token` = ?, `expires_in` = ?, `response_type` = ?, `scope` = ?, `token_type` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenResponseCode`
--
DELETE FROM `OauthAccessTokenResponseCode` WHERE 0;

