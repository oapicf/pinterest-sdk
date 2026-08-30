--
-- Pinterest REST API.
-- Prepared SQL queries for 'TotalCountByEntityStatus' definition.
--


--
-- SELECT template for table `TotalCountByEntityStatus`
--
SELECT `ACTIVE`, `ARCHIVED`, `PAUSED` FROM `TotalCountByEntityStatus` WHERE 1;

--
-- INSERT template for table `TotalCountByEntityStatus`
--
INSERT INTO `TotalCountByEntityStatus`(`ACTIVE`, `ARCHIVED`, `PAUSED`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TotalCountByEntityStatus`
--
UPDATE `TotalCountByEntityStatus` SET `ACTIVE` = ?, `ARCHIVED` = ?, `PAUSED` = ? WHERE 1;

--
-- DELETE template for table `TotalCountByEntityStatus`
--
DELETE FROM `TotalCountByEntityStatus` WHERE 0;

