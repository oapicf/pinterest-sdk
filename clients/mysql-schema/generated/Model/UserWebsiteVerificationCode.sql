--
-- Pinterest REST API.
-- Prepared SQL queries for 'UserWebsiteVerificationCode' definition.
--


--
-- SELECT template for table `UserWebsiteVerificationCode`
--
SELECT `dns_txt_record`, `file_content`, `filename`, `metatag`, `verification_code` FROM `UserWebsiteVerificationCode` WHERE 1;

--
-- INSERT template for table `UserWebsiteVerificationCode`
--
INSERT INTO `UserWebsiteVerificationCode`(`dns_txt_record`, `file_content`, `filename`, `metatag`, `verification_code`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `UserWebsiteVerificationCode`
--
UPDATE `UserWebsiteVerificationCode` SET `dns_txt_record` = ?, `file_content` = ?, `filename` = ?, `metatag` = ?, `verification_code` = ? WHERE 1;

--
-- DELETE template for table `UserWebsiteVerificationCode`
--
DELETE FROM `UserWebsiteVerificationCode` WHERE 0;

