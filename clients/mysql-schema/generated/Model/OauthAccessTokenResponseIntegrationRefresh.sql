--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenResponseIntegrationRefresh' definition.
--


--
-- SELECT template for table `OauthAccessTokenResponseIntegrationRefresh`
--
SELECT `response_type`, `access_token`, `token_type`, `expires_in`, `scope`, `refresh_token`, `refresh_token_expires_in` FROM `OauthAccessTokenResponseIntegrationRefresh` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenResponseIntegrationRefresh`
--
INSERT INTO `OauthAccessTokenResponseIntegrationRefresh`(`response_type`, `access_token`, `token_type`, `expires_in`, `scope`, `refresh_token`, `refresh_token_expires_in`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OauthAccessTokenResponseIntegrationRefresh`
--
UPDATE `OauthAccessTokenResponseIntegrationRefresh` SET `response_type` = ?, `access_token` = ?, `token_type` = ?, `expires_in` = ?, `scope` = ?, `refresh_token` = ?, `refresh_token_expires_in` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenResponseIntegrationRefresh`
--
DELETE FROM `OauthAccessTokenResponseIntegrationRefresh` WHERE 0;

