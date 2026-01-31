--
-- Pinterest REST API.
-- Prepared SQL queries for 'UserWebsiteVerifyRequest' definition.
--


--
-- SELECT template for table `UserWebsiteVerifyRequest`
--
SELECT `verification_method`, `website` FROM `UserWebsiteVerifyRequest` WHERE 1;

--
-- INSERT template for table `UserWebsiteVerifyRequest`
--
INSERT INTO `UserWebsiteVerifyRequest`(`verification_method`, `website`) VALUES (?, ?);

--
-- UPDATE template for table `UserWebsiteVerifyRequest`
--
UPDATE `UserWebsiteVerifyRequest` SET `verification_method` = ?, `website` = ? WHERE 1;

--
-- DELETE template for table `UserWebsiteVerifyRequest`
--
DELETE FROM `UserWebsiteVerifyRequest` WHERE 0;

