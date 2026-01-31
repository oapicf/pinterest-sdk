--
-- Pinterest REST API.
-- Prepared SQL queries for 'UserWebsiteSummary' definition.
--


--
-- SELECT template for table `UserWebsiteSummary`
--
SELECT `status`, `verified_at`, `website` FROM `UserWebsiteSummary` WHERE 1;

--
-- INSERT template for table `UserWebsiteSummary`
--
INSERT INTO `UserWebsiteSummary`(`status`, `verified_at`, `website`) VALUES (?, ?, ?);

--
-- UPDATE template for table `UserWebsiteSummary`
--
UPDATE `UserWebsiteSummary` SET `status` = ?, `verified_at` = ?, `website` = ? WHERE 1;

--
-- DELETE template for table `UserWebsiteSummary`
--
DELETE FROM `UserWebsiteSummary` WHERE 0;

