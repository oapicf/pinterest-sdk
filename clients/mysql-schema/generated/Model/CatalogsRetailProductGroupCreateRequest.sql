--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailProductGroupCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsRetailProductGroupCreateRequest`
--
SELECT `catalog_type`, `name`, `description`, `filters`, `catalog_id`, `country`, `locale` FROM `CatalogsRetailProductGroupCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsRetailProductGroupCreateRequest`
--
INSERT INTO `CatalogsRetailProductGroupCreateRequest`(`catalog_type`, `name`, `description`, `filters`, `catalog_id`, `country`, `locale`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailProductGroupCreateRequest`
--
UPDATE `CatalogsRetailProductGroupCreateRequest` SET `catalog_type` = ?, `name` = ?, `description` = ?, `filters` = ?, `catalog_id` = ?, `country` = ?, `locale` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailProductGroupCreateRequest`
--
DELETE FROM `CatalogsRetailProductGroupCreateRequest` WHERE 0;

