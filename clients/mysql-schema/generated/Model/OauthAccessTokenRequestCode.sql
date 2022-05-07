--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenRequestCode' definition.
--


--
-- SELECT template for table `OauthAccessTokenRequestCode`
--
SELECT `grant_type`, `code`, `redirect_uri` FROM `OauthAccessTokenRequestCode` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenRequestCode`
--
INSERT INTO `OauthAccessTokenRequestCode`(`grant_type`, `code`, `redirect_uri`) VALUES (?, ?, ?);

--
-- UPDATE template for table `OauthAccessTokenRequestCode`
--
UPDATE `OauthAccessTokenRequestCode` SET `grant_type` = ?, `code` = ?, `redirect_uri` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenRequestCode`
--
DELETE FROM `OauthAccessTokenRequestCode` WHERE 0;

