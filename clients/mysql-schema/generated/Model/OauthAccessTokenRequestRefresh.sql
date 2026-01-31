--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenRequestRefresh' definition.
--


--
-- SELECT template for table `OauthAccessTokenRequestRefresh`
--
SELECT `refresh_token`, `scope`, `refresh_on`, `grant_type` FROM `OauthAccessTokenRequestRefresh` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenRequestRefresh`
--
INSERT INTO `OauthAccessTokenRequestRefresh`(`refresh_token`, `scope`, `refresh_on`, `grant_type`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `OauthAccessTokenRequestRefresh`
--
UPDATE `OauthAccessTokenRequestRefresh` SET `refresh_token` = ?, `scope` = ?, `refresh_on` = ?, `grant_type` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenRequestRefresh`
--
DELETE FROM `OauthAccessTokenRequestRefresh` WHERE 0;

