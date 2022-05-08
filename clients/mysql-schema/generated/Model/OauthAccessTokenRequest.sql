--
-- Pinterest REST API.
-- Prepared SQL queries for 'OauthAccessTokenRequest' definition.
--


--
-- SELECT template for table `OauthAccessTokenRequest`
--
SELECT `grant_type` FROM `OauthAccessTokenRequest` WHERE 1;

--
-- INSERT template for table `OauthAccessTokenRequest`
--
INSERT INTO `OauthAccessTokenRequest`(`grant_type`) VALUES (?);

--
-- UPDATE template for table `OauthAccessTokenRequest`
--
UPDATE `OauthAccessTokenRequest` SET `grant_type` = ? WHERE 1;

--
-- DELETE template for table `OauthAccessTokenRequest`
--
DELETE FROM `OauthAccessTokenRequest` WHERE 0;

