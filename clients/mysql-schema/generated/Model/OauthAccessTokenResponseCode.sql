--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenResponseCode' definition.
--


--
-- SELECT template for table `OauthAccessTokenResponseCode`
--
SELECT `refresh_token`, `refresh_token_expires_in`, `response_type`, `access_token`, `token_type`, `expires_in`, `scope` FROM `OauthAccessTokenResponseCode` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenResponseCode`
--
INSERT INTO `OauthAccessTokenResponseCode`(`refresh_token`, `refresh_token_expires_in`, `response_type`, `access_token`, `token_type`, `expires_in`, `scope`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OauthAccessTokenResponseCode`
--
UPDATE `OauthAccessTokenResponseCode` SET `refresh_token` = ?, `refresh_token_expires_in` = ?, `response_type` = ?, `access_token` = ?, `token_type` = ?, `expires_in` = ?, `scope` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenResponseCode`
--
DELETE FROM `OauthAccessTokenResponseCode` WHERE 0;

