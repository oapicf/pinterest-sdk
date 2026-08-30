--
-- Pinterest REST API.
-- Prepared SQL queries for 'UserWebsiteCreate' definition.
--


--
-- SELECT template for table `UserWebsiteCreate`
--
SELECT `verification_method`, `website` FROM `UserWebsiteCreate` WHERE 1;

--
-- INSERT template for table `UserWebsiteCreate`
--
INSERT INTO `UserWebsiteCreate`(`verification_method`, `website`) VALUES (?, ?);

--
-- UPDATE template for table `UserWebsiteCreate`
--
UPDATE `UserWebsiteCreate` SET `verification_method` = ?, `website` = ? WHERE 1;

--
-- DELETE template for table `UserWebsiteCreate`
--
DELETE FROM `UserWebsiteCreate` WHERE 0;

