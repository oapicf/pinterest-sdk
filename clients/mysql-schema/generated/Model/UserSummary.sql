--
-- Pinterest REST API.
-- Prepared SQL queries for 'UserSummary' definition.
--


--
-- SELECT template for table `UserSummary`
--
SELECT `username`, `type` FROM `UserSummary` WHERE 1;

--
-- INSERT template for table `UserSummary`
--
INSERT INTO `UserSummary`(`username`, `type`) VALUES (?, ?);

--
-- UPDATE template for table `UserSummary`
--
UPDATE `UserSummary` SET `username` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `UserSummary`
--
DELETE FROM `UserSummary` WHERE 0;

