--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailItemResponse' definition.
--


--
-- SELECT template for table `CatalogsRetailItemResponse`
--
SELECT `attributes`, `catalog_type`, `item_id`, `item_response_kind`, `pins` FROM `CatalogsRetailItemResponse` WHERE 1;

--
-- INSERT template for table `CatalogsRetailItemResponse`
--
INSERT INTO `CatalogsRetailItemResponse`(`attributes`, `catalog_type`, `item_id`, `item_response_kind`, `pins`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailItemResponse`
--
UPDATE `CatalogsRetailItemResponse` SET `attributes` = ?, `catalog_type` = ?, `item_id` = ?, `item_response_kind` = ?, `pins` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailItemResponse`
--
DELETE FROM `CatalogsRetailItemResponse` WHERE 0;

