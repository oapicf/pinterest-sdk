--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenRequestRefresh_allOf' definition.
--


--
-- SELECT template for table `OauthAccessTokenRequestRefresh_allOf`
--
SELECT `refresh_token`, `scope` FROM `OauthAccessTokenRequestRefresh_allOf` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenRequestRefresh_allOf`
--
INSERT INTO `OauthAccessTokenRequestRefresh_allOf`(`refresh_token`, `scope`) VALUES (?, ?);

--
-- UPDATE template for table `OauthAccessTokenRequestRefresh_allOf`
--
UPDATE `OauthAccessTokenRequestRefresh_allOf` SET `refresh_token` = ?, `scope` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenRequestRefresh_allOf`
--
DELETE FROM `OauthAccessTokenRequestRefresh_allOf` WHERE 0;

