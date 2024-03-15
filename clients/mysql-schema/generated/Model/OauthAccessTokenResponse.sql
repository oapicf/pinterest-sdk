--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenResponse' definition.
--


--
-- SELECT template for table `OauthAccessTokenResponse`
--
SELECT `response_type`, `access_token`, `token_type`, `expires_in`, `scope` FROM `OauthAccessTokenResponse` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenResponse`
--
INSERT INTO `OauthAccessTokenResponse`(`response_type`, `access_token`, `token_type`, `expires_in`, `scope`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `OauthAccessTokenResponse`
--
UPDATE `OauthAccessTokenResponse` SET `response_type` = ?, `access_token` = ?, `token_type` = ?, `expires_in` = ?, `scope` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenResponse`
--
DELETE FROM `OauthAccessTokenResponse` WHERE 0;

