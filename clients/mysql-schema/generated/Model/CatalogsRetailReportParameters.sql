--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailReportParameters' definition.
--


--
-- SELECT template for table `CatalogsRetailReportParameters`
--
SELECT `catalog_type`, `report` FROM `CatalogsRetailReportParameters` WHERE 1;

--
-- INSERT template for table `CatalogsRetailReportParameters`
--
INSERT INTO `CatalogsRetailReportParameters`(`catalog_type`, `report`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsRetailReportParameters`
--
UPDATE `CatalogsRetailReportParameters` SET `catalog_type` = ?, `report` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailReportParameters`
--
DELETE FROM `CatalogsRetailReportParameters` WHERE 0;

