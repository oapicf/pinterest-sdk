--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionAccessToken' definition.
--


--
-- SELECT template for table `ConversionAccessToken`
--
SELECT `access_token`, `token_type` FROM `ConversionAccessToken` WHERE 1;

--
-- INSERT template for table `ConversionAccessToken`
--
INSERT INTO `ConversionAccessToken`(`access_token`, `token_type`) VALUES (?, ?);

--
-- UPDATE template for table `ConversionAccessToken`
--
UPDATE `ConversionAccessToken` SET `access_token` = ?, `token_type` = ? WHERE 1;

--
-- DELETE template for table `ConversionAccessToken`
--
DELETE FROM `ConversionAccessToken` WHERE 0;

