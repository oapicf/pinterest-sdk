--
-- Pinterest REST API.
-- Prepared SQL queries for 'BusinessAccessUserSummary' definition.
--


--
-- SELECT template for table `BusinessAccessUserSummary`
--
SELECT `email`, `id`, `username` FROM `BusinessAccessUserSummary` WHERE 1;

--
-- INSERT template for table `BusinessAccessUserSummary`
--
INSERT INTO `BusinessAccessUserSummary`(`email`, `id`, `username`) VALUES (?, ?, ?);

--
-- UPDATE template for table `BusinessAccessUserSummary`
--
UPDATE `BusinessAccessUserSummary` SET `email` = ?, `id` = ?, `username` = ? WHERE 1;

--
-- DELETE template for table `BusinessAccessUserSummary`
--
DELETE FROM `BusinessAccessUserSummary` WHERE 0;

