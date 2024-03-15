--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroupProductCounts' definition.
--


--
-- SELECT template for table `CatalogsProductGroupProductCounts`
--
SELECT `in_stock`, `out_of_stock`, `preorder`, `total` FROM `CatalogsProductGroupProductCounts` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroupProductCounts`
--
INSERT INTO `CatalogsProductGroupProductCounts`(`in_stock`, `out_of_stock`, `preorder`, `total`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsProductGroupProductCounts`
--
UPDATE `CatalogsProductGroupProductCounts` SET `in_stock` = ?, `out_of_stock` = ?, `preorder` = ?, `total` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroupProductCounts`
--
DELETE FROM `CatalogsProductGroupProductCounts` WHERE 0;

