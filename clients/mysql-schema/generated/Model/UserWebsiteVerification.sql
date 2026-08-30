--
-- Pinterest REST API.
-- Prepared SQL queries for 'UserWebsiteVerification' definition.
--


--
-- SELECT template for table `UserWebsiteVerification`
--
SELECT `dns_txt_record`, `file_content`, `filename`, `metatag`, `verification_code` FROM `UserWebsiteVerification` WHERE 1;

--
-- INSERT template for table `UserWebsiteVerification`
--
INSERT INTO `UserWebsiteVerification`(`dns_txt_record`, `file_content`, `filename`, `metatag`, `verification_code`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `UserWebsiteVerification`
--
UPDATE `UserWebsiteVerification` SET `dns_txt_record` = ?, `file_content` = ?, `filename` = ?, `metatag` = ?, `verification_code` = ? WHERE 1;

--
-- DELETE template for table `UserWebsiteVerification`
--
DELETE FROM `UserWebsiteVerification` WHERE 0;

