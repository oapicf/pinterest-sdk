--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenResponseCode' definition.
--


--
-- SELECT template for table `OauthAccessTokenResponseCode`
--
SELECT `response_type`, `access_token`, `token_type`, `expires_in`, `scope`, `refresh_token`, `refresh_token_expires_in` FROM `OauthAccessTokenResponseCode` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenResponseCode`
--
INSERT INTO `OauthAccessTokenResponseCode`(`response_type`, `access_token`, `token_type`, `expires_in`, `scope`, `refresh_token`, `refresh_token_expires_in`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OauthAccessTokenResponseCode`
--
UPDATE `OauthAccessTokenResponseCode` SET `response_type` = ?, `access_token` = ?, `token_type` = ?, `expires_in` = ?, `scope` = ?, `refresh_token` = ?, `refresh_token_expires_in` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenResponseCode`
--
DELETE FROM `OauthAccessTokenResponseCode` WHERE 0;

