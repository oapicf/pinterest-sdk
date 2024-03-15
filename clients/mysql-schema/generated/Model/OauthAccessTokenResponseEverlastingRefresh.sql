--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenResponseEverlastingRefresh' definition.
--


--
-- SELECT template for table `OauthAccessTokenResponseEverlastingRefresh`
--
SELECT `response_type`, `access_token`, `token_type`, `expires_in`, `scope`, `refresh_token`, `refresh_token_expires_in`, `refresh_token_expires_at` FROM `OauthAccessTokenResponseEverlastingRefresh` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenResponseEverlastingRefresh`
--
INSERT INTO `OauthAccessTokenResponseEverlastingRefresh`(`response_type`, `access_token`, `token_type`, `expires_in`, `scope`, `refresh_token`, `refresh_token_expires_in`, `refresh_token_expires_at`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OauthAccessTokenResponseEverlastingRefresh`
--
UPDATE `OauthAccessTokenResponseEverlastingRefresh` SET `response_type` = ?, `access_token` = ?, `token_type` = ?, `expires_in` = ?, `scope` = ?, `refresh_token` = ?, `refresh_token_expires_in` = ?, `refresh_token_expires_at` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenResponseEverlastingRefresh`
--
DELETE FROM `OauthAccessTokenResponseEverlastingRefresh` WHERE 0;

