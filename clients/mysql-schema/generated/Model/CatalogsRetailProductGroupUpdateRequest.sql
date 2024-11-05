--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailProductGroupUpdateRequest' definition.
--


--
-- SELECT template for table `CatalogsRetailProductGroupUpdateRequest`
--
SELECT `catalog_type`, `name`, `description`, `filters`, `country`, `locale` FROM `CatalogsRetailProductGroupUpdateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsRetailProductGroupUpdateRequest`
--
INSERT INTO `CatalogsRetailProductGroupUpdateRequest`(`catalog_type`, `name`, `description`, `filters`, `country`, `locale`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailProductGroupUpdateRequest`
--
UPDATE `CatalogsRetailProductGroupUpdateRequest` SET `catalog_type` = ?, `name` = ?, `description` = ?, `filters` = ?, `country` = ?, `locale` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailProductGroupUpdateRequest`
--
DELETE FROM `CatalogsRetailProductGroupUpdateRequest` WHERE 0;

