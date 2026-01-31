--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenResponseEverlastingRefresh' definition.
--


--
-- SELECT template for table `OauthAccessTokenResponseEverlastingRefresh`
--
SELECT `refresh_token`, `refresh_token_expires_in`, `refresh_token_expires_at`, `response_type`, `access_token`, `token_type`, `expires_in`, `scope` FROM `OauthAccessTokenResponseEverlastingRefresh` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenResponseEverlastingRefresh`
--
INSERT INTO `OauthAccessTokenResponseEverlastingRefresh`(`refresh_token`, `refresh_token_expires_in`, `refresh_token_expires_at`, `response_type`, `access_token`, `token_type`, `expires_in`, `scope`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OauthAccessTokenResponseEverlastingRefresh`
--
UPDATE `OauthAccessTokenResponseEverlastingRefresh` SET `refresh_token` = ?, `refresh_token_expires_in` = ?, `refresh_token_expires_at` = ?, `response_type` = ?, `access_token` = ?, `token_type` = ?, `expires_in` = ?, `scope` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenResponseEverlastingRefresh`
--
DELETE FROM `OauthAccessTokenResponseEverlastingRefresh` WHERE 0;

