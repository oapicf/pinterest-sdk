--
-- Pinterest REST API.
-- Prepared SQL queries for 'UserWebsite' definition.
--


--
-- SELECT template for table `UserWebsite`
--
SELECT `status`, `verified_at`, `website` FROM `UserWebsite` WHERE 1;

--
-- INSERT template for table `UserWebsite`
--
INSERT INTO `UserWebsite`(`status`, `verified_at`, `website`) VALUES (?, ?, ?);

--
-- UPDATE template for table `UserWebsite`
--
UPDATE `UserWebsite` SET `status` = ?, `verified_at` = ?, `website` = ? WHERE 1;

--
-- DELETE template for table `UserWebsite`
--
DELETE FROM `UserWebsite` WHERE 0;

