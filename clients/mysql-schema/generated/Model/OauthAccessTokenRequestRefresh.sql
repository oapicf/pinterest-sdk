--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenRequestRefresh' definition.
--


--
-- SELECT template for table `OauthAccessTokenRequestRefresh`
--
SELECT `grant_type`, `refresh_token`, `scope` FROM `OauthAccessTokenRequestRefresh` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenRequestRefresh`
--
INSERT INTO `OauthAccessTokenRequestRefresh`(`grant_type`, `refresh_token`, `scope`) VALUES (?, ?, ?);

--
-- UPDATE template for table `OauthAccessTokenRequestRefresh`
--
UPDATE `OauthAccessTokenRequestRefresh` SET `grant_type` = ?, `refresh_token` = ?, `scope` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenRequestRefresh`
--
DELETE FROM `OauthAccessTokenRequestRefresh` WHERE 0;

