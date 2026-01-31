--
-- Pinterest REST API.
-- Prepared SQL queries for 'reports_stats_200_response' definition.
--


--
-- SELECT template for table `reports_stats_200_response`
--
SELECT `bookmark`, `items` FROM `reports_stats_200_response` WHERE 1;

--
-- INSERT template for table `reports_stats_200_response`
--
INSERT INTO `reports_stats_200_response`(`bookmark`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `reports_stats_200_response`
--
UPDATE `reports_stats_200_response` SET `bookmark` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `reports_stats_200_response`
--
DELETE FROM `reports_stats_200_response` WHERE 0;

