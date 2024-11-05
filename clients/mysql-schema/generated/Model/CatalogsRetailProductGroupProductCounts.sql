--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailProductGroupProductCounts' definition.
--


--
-- SELECT template for table `CatalogsRetailProductGroupProductCounts`
--
SELECT `catalog_type`, `in_stock`, `out_of_stock`, `preorder`, `total`, `videos` FROM `CatalogsRetailProductGroupProductCounts` WHERE 1;

--
-- INSERT template for table `CatalogsRetailProductGroupProductCounts`
--
INSERT INTO `CatalogsRetailProductGroupProductCounts`(`catalog_type`, `in_stock`, `out_of_stock`, `preorder`, `total`, `videos`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailProductGroupProductCounts`
--
UPDATE `CatalogsRetailProductGroupProductCounts` SET `catalog_type` = ?, `in_stock` = ?, `out_of_stock` = ?, `preorder` = ?, `total` = ?, `videos` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailProductGroupProductCounts`
--
DELETE FROM `CatalogsRetailProductGroupProductCounts` WHERE 0;

