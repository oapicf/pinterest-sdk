--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailBatchRequest' definition.
--


--
-- SELECT template for table `CatalogsRetailBatchRequest`
--
SELECT `catalog_type`, `country`, `language`, `items` FROM `CatalogsRetailBatchRequest` WHERE 1;

--
-- INSERT template for table `CatalogsRetailBatchRequest`
--
INSERT INTO `CatalogsRetailBatchRequest`(`catalog_type`, `country`, `language`, `items`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailBatchRequest`
--
UPDATE `CatalogsRetailBatchRequest` SET `catalog_type` = ?, `country` = ?, `language` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailBatchRequest`
--
DELETE FROM `CatalogsRetailBatchRequest` WHERE 0;

