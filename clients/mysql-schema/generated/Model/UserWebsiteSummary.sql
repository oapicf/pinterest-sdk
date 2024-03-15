--
-- Pinterest REST API.
-- Prepared SQL queries for 'UserWebsiteSummary' definition.
--


--
-- SELECT template for table `UserWebsiteSummary`
--
SELECT `website`, `status`, `verified_at` FROM `UserWebsiteSummary` WHERE 1;

--
-- INSERT template for table `UserWebsiteSummary`
--
INSERT INTO `UserWebsiteSummary`(`website`, `status`, `verified_at`) VALUES (?, ?, ?);

--
-- UPDATE template for table `UserWebsiteSummary`
--
UPDATE `UserWebsiteSummary` SET `website` = ?, `status` = ?, `verified_at` = ? WHERE 1;

--
-- DELETE template for table `UserWebsiteSummary`
--
DELETE FROM `UserWebsiteSummary` WHERE 0;

