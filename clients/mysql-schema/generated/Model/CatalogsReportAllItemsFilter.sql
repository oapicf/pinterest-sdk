--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsReportAllItemsFilter' definition.
--


--
-- SELECT template for table `CatalogsReportAllItemsFilter`
--
SELECT `catalog_id`, `report_type` FROM `CatalogsReportAllItemsFilter` WHERE 1;

--
-- INSERT template for table `CatalogsReportAllItemsFilter`
--
INSERT INTO `CatalogsReportAllItemsFilter`(`catalog_id`, `report_type`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsReportAllItemsFilter`
--
UPDATE `CatalogsReportAllItemsFilter` SET `catalog_id` = ?, `report_type` = ? WHERE 1;

--
-- DELETE template for table `CatalogsReportAllItemsFilter`
--
DELETE FROM `CatalogsReportAllItemsFilter` WHERE 0;

