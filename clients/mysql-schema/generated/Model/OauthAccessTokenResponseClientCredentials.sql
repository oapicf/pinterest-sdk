--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenResponseClientCredentials' definition.
--


--
-- SELECT template for table `OauthAccessTokenResponseClientCredentials`
--
SELECT `response_type`, `access_token`, `token_type`, `expires_in`, `scope` FROM `OauthAccessTokenResponseClientCredentials` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenResponseClientCredentials`
--
INSERT INTO `OauthAccessTokenResponseClientCredentials`(`response_type`, `access_token`, `token_type`, `expires_in`, `scope`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `OauthAccessTokenResponseClientCredentials`
--
UPDATE `OauthAccessTokenResponseClientCredentials` SET `response_type` = ?, `access_token` = ?, `token_type` = ?, `expires_in` = ?, `scope` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenResponseClientCredentials`
--
DELETE FROM `OauthAccessTokenResponseClientCredentials` WHERE 0;

