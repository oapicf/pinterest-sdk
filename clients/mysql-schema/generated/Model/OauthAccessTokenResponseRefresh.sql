--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenResponseRefresh' definition.
--


--
-- SELECT template for table `OauthAccessTokenResponseRefresh`
--
SELECT `access_token`, `expires_in`, `response_type`, `scope`, `token_type`, `refresh_token`, `refresh_token_expires_at`, `refresh_token_expires_in` FROM `OauthAccessTokenResponseRefresh` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenResponseRefresh`
--
INSERT INTO `OauthAccessTokenResponseRefresh`(`access_token`, `expires_in`, `response_type`, `scope`, `token_type`, `refresh_token`, `refresh_token_expires_at`, `refresh_token_expires_in`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OauthAccessTokenResponseRefresh`
--
UPDATE `OauthAccessTokenResponseRefresh` SET `access_token` = ?, `expires_in` = ?, `response_type` = ?, `scope` = ?, `token_type` = ?, `refresh_token` = ?, `refresh_token_expires_at` = ?, `refresh_token_expires_in` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenResponseRefresh`
--
DELETE FROM `OauthAccessTokenResponseRefresh` WHERE 0;

