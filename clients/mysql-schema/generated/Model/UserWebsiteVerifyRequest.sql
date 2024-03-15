--
-- Pinterest REST API.
-- Prepared SQL queries for 'UserWebsiteVerifyRequest' definition.
--


--
-- SELECT template for table `UserWebsiteVerifyRequest`
--
SELECT `website`, `verification_method` FROM `UserWebsiteVerifyRequest` WHERE 1;

--
-- INSERT template for table `UserWebsiteVerifyRequest`
--
INSERT INTO `UserWebsiteVerifyRequest`(`website`, `verification_method`) VALUES (?, ?);

--
-- UPDATE template for table `UserWebsiteVerifyRequest`
--
UPDATE `UserWebsiteVerifyRequest` SET `website` = ?, `verification_method` = ? WHERE 1;

--
-- DELETE template for table `UserWebsiteVerifyRequest`
--
DELETE FROM `UserWebsiteVerifyRequest` WHERE 0;

