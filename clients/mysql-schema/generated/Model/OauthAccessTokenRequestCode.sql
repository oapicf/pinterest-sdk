--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenRequestCode' definition.
--


--
-- SELECT template for table `OauthAccessTokenRequestCode`
--
SELECT `code`, `redirect_uri`, `grant_type` FROM `OauthAccessTokenRequestCode` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenRequestCode`
--
INSERT INTO `OauthAccessTokenRequestCode`(`code`, `redirect_uri`, `grant_type`) VALUES (?, ?, ?);

--
-- UPDATE template for table `OauthAccessTokenRequestCode`
--
UPDATE `OauthAccessTokenRequestCode` SET `code` = ?, `redirect_uri` = ?, `grant_type` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenRequestCode`
--
DELETE FROM `OauthAccessTokenRequestCode` WHERE 0;

