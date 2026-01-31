--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailProductGroupCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsRetailProductGroupCreateRequest`
--
SELECT `catalog_id`, `catalog_type`, `country`, `description`, `filters`, `locale`, `name` FROM `CatalogsRetailProductGroupCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsRetailProductGroupCreateRequest`
--
INSERT INTO `CatalogsRetailProductGroupCreateRequest`(`catalog_id`, `catalog_type`, `country`, `description`, `filters`, `locale`, `name`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailProductGroupCreateRequest`
--
UPDATE `CatalogsRetailProductGroupCreateRequest` SET `catalog_id` = ?, `catalog_type` = ?, `country` = ?, `description` = ?, `filters` = ?, `locale` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailProductGroupCreateRequest`
--
DELETE FROM `CatalogsRetailProductGroupCreateRequest` WHERE 0;

