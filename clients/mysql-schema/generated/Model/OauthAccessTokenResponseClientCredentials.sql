--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenResponseClientCredentials' definition.
--


--
-- SELECT template for table `OauthAccessTokenResponseClientCredentials`
--
SELECT `access_token`, `expires_in`, `response_type`, `scope`, `token_type` FROM `OauthAccessTokenResponseClientCredentials` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenResponseClientCredentials`
--
INSERT INTO `OauthAccessTokenResponseClientCredentials`(`access_token`, `expires_in`, `response_type`, `scope`, `token_type`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `OauthAccessTokenResponseClientCredentials`
--
UPDATE `OauthAccessTokenResponseClientCredentials` SET `access_token` = ?, `expires_in` = ?, `response_type` = ?, `scope` = ?, `token_type` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenResponseClientCredentials`
--
DELETE FROM `OauthAccessTokenResponseClientCredentials` WHERE 0;

