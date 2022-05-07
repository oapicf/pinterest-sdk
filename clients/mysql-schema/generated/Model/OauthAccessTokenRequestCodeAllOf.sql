--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenRequestCode_allOf' definition.
--


--
-- SELECT template for table `OauthAccessTokenRequestCode_allOf`
--
SELECT `code`, `redirect_uri` FROM `OauthAccessTokenRequestCode_allOf` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenRequestCode_allOf`
--
INSERT INTO `OauthAccessTokenRequestCode_allOf`(`code`, `redirect_uri`) VALUES (?, ?);

--
-- UPDATE template for table `OauthAccessTokenRequestCode_allOf`
--
UPDATE `OauthAccessTokenRequestCode_allOf` SET `code` = ?, `redirect_uri` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenRequestCode_allOf`
--
DELETE FROM `OauthAccessTokenRequestCode_allOf` WHERE 0;

