--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsReportStatsParameters' definition.
--


--
-- SELECT template for table `CatalogsReportStatsParameters`
--
SELECT `catalog_type`, `report` FROM `CatalogsReportStatsParameters` WHERE 1;

--
-- INSERT template for table `CatalogsReportStatsParameters`
--
INSERT INTO `CatalogsReportStatsParameters`(`catalog_type`, `report`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsReportStatsParameters`
--
UPDATE `CatalogsReportStatsParameters` SET `catalog_type` = ?, `report` = ? WHERE 1;

--
-- DELETE template for table `CatalogsReportStatsParameters`
--
DELETE FROM `CatalogsReportStatsParameters` WHERE 0;

