--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenResponse' definition.
--


--
-- SELECT template for table `OauthAccessTokenResponse`
--
SELECT `access_token`, `expires_in`, `response_type`, `scope`, `token_type` FROM `OauthAccessTokenResponse` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenResponse`
--
INSERT INTO `OauthAccessTokenResponse`(`access_token`, `expires_in`, `response_type`, `scope`, `token_type`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `OauthAccessTokenResponse`
--
UPDATE `OauthAccessTokenResponse` SET `access_token` = ?, `expires_in` = ?, `response_type` = ?, `scope` = ?, `token_type` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenResponse`
--
DELETE FROM `OauthAccessTokenResponse` WHERE 0;

