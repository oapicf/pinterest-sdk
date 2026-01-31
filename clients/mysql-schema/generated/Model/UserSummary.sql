--
-- Pinterest REST API.
-- Prepared SQL queries for 'UserSummary' definition.
--


--
-- SELECT template for table `UserSummary`
--
SELECT `type`, `username` FROM `UserSummary` WHERE 1;

--
-- INSERT template for table `UserSummary`
--
INSERT INTO `UserSummary`(`type`, `username`) VALUES (?, ?);

--
-- UPDATE template for table `UserSummary`
--
UPDATE `UserSummary` SET `type` = ?, `username` = ? WHERE 1;

--
-- DELETE template for table `UserSummary`
--
DELETE FROM `UserSummary` WHERE 0;

