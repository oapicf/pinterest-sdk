--
-- Pinterest REST API.
-- Prepared SQL queries for 'reports_stats_parameters_parameter' definition.
--


--
-- SELECT template for table `reports_stats_parameters_parameter`
--
SELECT `catalog_type`, `report` FROM `reports_stats_parameters_parameter` WHERE 1;

--
-- INSERT template for table `reports_stats_parameters_parameter`
--
INSERT INTO `reports_stats_parameters_parameter`(`catalog_type`, `report`) VALUES (?, ?);

--
-- UPDATE template for table `reports_stats_parameters_parameter`
--
UPDATE `reports_stats_parameters_parameter` SET `catalog_type` = ?, `report` = ? WHERE 1;

--
-- DELETE template for table `reports_stats_parameters_parameter`
--
DELETE FROM `reports_stats_parameters_parameter` WHERE 0;

