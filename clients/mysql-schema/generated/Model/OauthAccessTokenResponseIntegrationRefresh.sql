--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenResponseIntegrationRefresh' definition.
--


--
-- SELECT template for table `OauthAccessTokenResponseIntegrationRefresh`
--
SELECT `refresh_token`, `refresh_token_expires_in`, `response_type`, `access_token`, `token_type`, `expires_in`, `scope` FROM `OauthAccessTokenResponseIntegrationRefresh` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenResponseIntegrationRefresh`
--
INSERT INTO `OauthAccessTokenResponseIntegrationRefresh`(`refresh_token`, `refresh_token_expires_in`, `response_type`, `access_token`, `token_type`, `expires_in`, `scope`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OauthAccessTokenResponseIntegrationRefresh`
--
UPDATE `OauthAccessTokenResponseIntegrationRefresh` SET `refresh_token` = ?, `refresh_token_expires_in` = ?, `response_type` = ?, `access_token` = ?, `token_type` = ?, `expires_in` = ?, `scope` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenResponseIntegrationRefresh`
--
DELETE FROM `OauthAccessTokenResponseIntegrationRefresh` WHERE 0;

