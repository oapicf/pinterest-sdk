--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailReportStatsParameters' definition.
--


--
-- SELECT template for table `CatalogsRetailReportStatsParameters`
--
SELECT `catalog_type`, `report` FROM `CatalogsRetailReportStatsParameters` WHERE 1;

--
-- INSERT template for table `CatalogsRetailReportStatsParameters`
--
INSERT INTO `CatalogsRetailReportStatsParameters`(`catalog_type`, `report`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsRetailReportStatsParameters`
--
UPDATE `CatalogsRetailReportStatsParameters` SET `catalog_type` = ?, `report` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailReportStatsParameters`
--
DELETE FROM `CatalogsRetailReportStatsParameters` WHERE 0;

