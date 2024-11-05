--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroupProductCountsVertical' definition.
--


--
-- SELECT template for table `CatalogsProductGroupProductCountsVertical`
--
SELECT `catalog_type`, `in_stock`, `out_of_stock`, `preorder`, `total`, `videos` FROM `CatalogsProductGroupProductCountsVertical` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroupProductCountsVertical`
--
INSERT INTO `CatalogsProductGroupProductCountsVertical`(`catalog_type`, `in_stock`, `out_of_stock`, `preorder`, `total`, `videos`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsProductGroupProductCountsVertical`
--
UPDATE `CatalogsProductGroupProductCountsVertical` SET `catalog_type` = ?, `in_stock` = ?, `out_of_stock` = ?, `preorder` = ?, `total` = ?, `videos` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroupProductCountsVertical`
--
DELETE FROM `CatalogsProductGroupProductCountsVertical` WHERE 0;

