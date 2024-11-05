--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenRequestClientCredentials' definition.
--


--
-- SELECT template for table `OauthAccessTokenRequestClientCredentials`
--
SELECT `grant_type`, `scope` FROM `OauthAccessTokenRequestClientCredentials` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenRequestClientCredentials`
--
INSERT INTO `OauthAccessTokenRequestClientCredentials`(`grant_type`, `scope`) VALUES (?, ?);

--
-- UPDATE template for table `OauthAccessTokenRequestClientCredentials`
--
UPDATE `OauthAccessTokenRequestClientCredentials` SET `grant_type` = ?, `scope` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenRequestClientCredentials`
--
DELETE FROM `OauthAccessTokenRequestClientCredentials` WHERE 0;

