--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenResponseRefresh' definition.
--


--
-- SELECT template for table `OauthAccessTokenResponseRefresh`
--
SELECT `response_type`, `access_token`, `token_type`, `expires_in`, `scope` FROM `OauthAccessTokenResponseRefresh` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenResponseRefresh`
--
INSERT INTO `OauthAccessTokenResponseRefresh`(`response_type`, `access_token`, `token_type`, `expires_in`, `scope`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `OauthAccessTokenResponseRefresh`
--
UPDATE `OauthAccessTokenResponseRefresh` SET `response_type` = ?, `access_token` = ?, `token_type` = ?, `expires_in` = ?, `scope` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenResponseRefresh`
--
DELETE FROM `OauthAccessTokenResponseRefresh` WHERE 0;

