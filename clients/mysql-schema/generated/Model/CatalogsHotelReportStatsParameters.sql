--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelReportStatsParameters' definition.
--


--
-- SELECT template for table `CatalogsHotelReportStatsParameters`
--
SELECT `catalog_type`, `report` FROM `CatalogsHotelReportStatsParameters` WHERE 1;

--
-- INSERT template for table `CatalogsHotelReportStatsParameters`
--
INSERT INTO `CatalogsHotelReportStatsParameters`(`catalog_type`, `report`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsHotelReportStatsParameters`
--
UPDATE `CatalogsHotelReportStatsParameters` SET `catalog_type` = ?, `report` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelReportStatsParameters`
--
DELETE FROM `CatalogsHotelReportStatsParameters` WHERE 0;

