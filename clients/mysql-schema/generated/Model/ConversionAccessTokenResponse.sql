--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionAccessTokenResponse' definition.
--


--
-- SELECT template for table `ConversionAccessTokenResponse`
--
SELECT `access_token`, `token_type` FROM `ConversionAccessTokenResponse` WHERE 1;

--
-- INSERT template for table `ConversionAccessTokenResponse`
--
INSERT INTO `ConversionAccessTokenResponse`(`access_token`, `token_type`) VALUES (?, ?);

--
-- UPDATE template for table `ConversionAccessTokenResponse`
--
UPDATE `ConversionAccessTokenResponse` SET `access_token` = ?, `token_type` = ? WHERE 1;

--
-- DELETE template for table `ConversionAccessTokenResponse`
--
DELETE FROM `ConversionAccessTokenResponse` WHERE 0;

