--
-- Pinterest REST API.
-- Prepared SQL queries for 'UserWebsiteVerificationCode' definition.
--


--
-- SELECT template for table `UserWebsiteVerificationCode`
--
SELECT `verification_code`, `dns_txt_record`, `metatag`, `filename`, `file_content` FROM `UserWebsiteVerificationCode` WHERE 1;

--
-- INSERT template for table `UserWebsiteVerificationCode`
--
INSERT INTO `UserWebsiteVerificationCode`(`verification_code`, `dns_txt_record`, `metatag`, `filename`, `file_content`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `UserWebsiteVerificationCode`
--
UPDATE `UserWebsiteVerificationCode` SET `verification_code` = ?, `dns_txt_record` = ?, `metatag` = ?, `filename` = ?, `file_content` = ? WHERE 1;

--
-- DELETE template for table `UserWebsiteVerificationCode`
--
DELETE FROM `UserWebsiteVerificationCode` WHERE 0;

