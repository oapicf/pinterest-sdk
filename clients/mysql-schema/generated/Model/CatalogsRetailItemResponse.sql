--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailItemResponse' definition.
--


--
-- SELECT template for table `CatalogsRetailItemResponse`
--
SELECT `catalog_type`, `item_id`, `pins`, `attributes` FROM `CatalogsRetailItemResponse` WHERE 1;

--
-- INSERT template for table `CatalogsRetailItemResponse`
--
INSERT INTO `CatalogsRetailItemResponse`(`catalog_type`, `item_id`, `pins`, `attributes`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailItemResponse`
--
UPDATE `CatalogsRetailItemResponse` SET `catalog_type` = ?, `item_id` = ?, `pins` = ?, `attributes` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailItemResponse`
--
DELETE FROM `CatalogsRetailItemResponse` WHERE 0;

