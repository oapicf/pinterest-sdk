--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsReportParameters' definition.
--


--
-- SELECT template for table `CatalogsReportParameters`
--
SELECT `catalog_type`, `report` FROM `CatalogsReportParameters` WHERE 1;

--
-- INSERT template for table `CatalogsReportParameters`
--
INSERT INTO `CatalogsReportParameters`(`catalog_type`, `report`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsReportParameters`
--
UPDATE `CatalogsReportParameters` SET `catalog_type` = ?, `report` = ? WHERE 1;

--
-- DELETE template for table `CatalogsReportParameters`
--
DELETE FROM `CatalogsReportParameters` WHERE 0;

