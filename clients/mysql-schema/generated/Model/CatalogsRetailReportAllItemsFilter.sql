--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailReportAllItemsFilter' definition.
--


--
-- SELECT template for table `CatalogsRetailReportAllItemsFilter`
--
SELECT `catalog_id`, `product_group_id`, `report_type` FROM `CatalogsRetailReportAllItemsFilter` WHERE 1;

--
-- INSERT template for table `CatalogsRetailReportAllItemsFilter`
--
INSERT INTO `CatalogsRetailReportAllItemsFilter`(`catalog_id`, `product_group_id`, `report_type`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailReportAllItemsFilter`
--
UPDATE `CatalogsRetailReportAllItemsFilter` SET `catalog_id` = ?, `product_group_id` = ?, `report_type` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailReportAllItemsFilter`
--
DELETE FROM `CatalogsRetailReportAllItemsFilter` WHERE 0;

