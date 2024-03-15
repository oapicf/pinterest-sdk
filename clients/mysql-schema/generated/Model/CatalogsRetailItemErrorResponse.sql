--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailItemErrorResponse' definition.
--


--
-- SELECT template for table `CatalogsRetailItemErrorResponse`
--
SELECT `catalog_type`, `item_id`, `errors` FROM `CatalogsRetailItemErrorResponse` WHERE 1;

--
-- INSERT template for table `CatalogsRetailItemErrorResponse`
--
INSERT INTO `CatalogsRetailItemErrorResponse`(`catalog_type`, `item_id`, `errors`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailItemErrorResponse`
--
UPDATE `CatalogsRetailItemErrorResponse` SET `catalog_type` = ?, `item_id` = ?, `errors` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailItemErrorResponse`
--
DELETE FROM `CatalogsRetailItemErrorResponse` WHERE 0;

