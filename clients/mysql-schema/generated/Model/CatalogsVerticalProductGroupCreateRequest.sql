--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsVerticalProductGroupCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsVerticalProductGroupCreateRequest`
--
SELECT `catalog_type`, `name`, `description`, `filters`, `catalog_id`, `country`, `locale` FROM `CatalogsVerticalProductGroupCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsVerticalProductGroupCreateRequest`
--
INSERT INTO `CatalogsVerticalProductGroupCreateRequest`(`catalog_type`, `name`, `description`, `filters`, `catalog_id`, `country`, `locale`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsVerticalProductGroupCreateRequest`
--
UPDATE `CatalogsVerticalProductGroupCreateRequest` SET `catalog_type` = ?, `name` = ?, `description` = ?, `filters` = ?, `catalog_id` = ?, `country` = ?, `locale` = ? WHERE 1;

--
-- DELETE template for table `CatalogsVerticalProductGroupCreateRequest`
--
DELETE FROM `CatalogsVerticalProductGroupCreateRequest` WHERE 0;

