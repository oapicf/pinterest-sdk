--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailProduct' definition.
--


--
-- SELECT template for table `CatalogsRetailProduct`
--
SELECT `catalog_type`, `metadata`, `pin` FROM `CatalogsRetailProduct` WHERE 1;

--
-- INSERT template for table `CatalogsRetailProduct`
--
INSERT INTO `CatalogsRetailProduct`(`catalog_type`, `metadata`, `pin`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailProduct`
--
UPDATE `CatalogsRetailProduct` SET `catalog_type` = ?, `metadata` = ?, `pin` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailProduct`
--
DELETE FROM `CatalogsRetailProduct` WHERE 0;

