--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenResponseCode_allOf' definition.
--


--
-- SELECT template for table `OauthAccessTokenResponseCode_allOf`
--
SELECT `refresh_token`, `refresh_token_expires_in` FROM `OauthAccessTokenResponseCode_allOf` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenResponseCode_allOf`
--
INSERT INTO `OauthAccessTokenResponseCode_allOf`(`refresh_token`, `refresh_token_expires_in`) VALUES (?, ?);

--
-- UPDATE template for table `OauthAccessTokenResponseCode_allOf`
--
UPDATE `OauthAccessTokenResponseCode_allOf` SET `refresh_token` = ?, `refresh_token_expires_in` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenResponseCode_allOf`
--
DELETE FROM `OauthAccessTokenResponseCode_allOf` WHERE 0;

