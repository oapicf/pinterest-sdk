--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelReportParameters' definition.
--


--
-- SELECT template for table `CatalogsHotelReportParameters`
--
SELECT `catalog_type`, `report` FROM `CatalogsHotelReportParameters` WHERE 1;

--
-- INSERT template for table `CatalogsHotelReportParameters`
--
INSERT INTO `CatalogsHotelReportParameters`(`catalog_type`, `report`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsHotelReportParameters`
--
UPDATE `CatalogsHotelReportParameters` SET `catalog_type` = ?, `report` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelReportParameters`
--
DELETE FROM `CatalogsHotelReportParameters` WHERE 0;

