--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenRequestClientCredentials' definition.
--


--
-- SELECT template for table `OauthAccessTokenRequestClientCredentials`
--
SELECT `scope`, `grant_type` FROM `OauthAccessTokenRequestClientCredentials` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenRequestClientCredentials`
--
INSERT INTO `OauthAccessTokenRequestClientCredentials`(`scope`, `grant_type`) VALUES (?, ?);

--
-- UPDATE template for table `OauthAccessTokenRequestClientCredentials`
--
UPDATE `OauthAccessTokenRequestClientCredentials` SET `scope` = ?, `grant_type` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenRequestClientCredentials`
--
DELETE FROM `OauthAccessTokenRequestClientCredentials` WHERE 0;

