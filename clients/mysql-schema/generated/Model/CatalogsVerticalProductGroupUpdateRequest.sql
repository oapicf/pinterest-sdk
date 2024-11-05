--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsVerticalProductGroupUpdateRequest' definition.
--


--
-- SELECT template for table `CatalogsVerticalProductGroupUpdateRequest`
--
SELECT `catalog_type`, `name`, `description`, `filters`, `country`, `locale` FROM `CatalogsVerticalProductGroupUpdateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsVerticalProductGroupUpdateRequest`
--
INSERT INTO `CatalogsVerticalProductGroupUpdateRequest`(`catalog_type`, `name`, `description`, `filters`, `country`, `locale`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsVerticalProductGroupUpdateRequest`
--
UPDATE `CatalogsVerticalProductGroupUpdateRequest` SET `catalog_type` = ?, `name` = ?, `description` = ?, `filters` = ?, `country` = ?, `locale` = ? WHERE 1;

--
-- DELETE template for table `CatalogsVerticalProductGroupUpdateRequest`
--
DELETE FROM `CatalogsVerticalProductGroupUpdateRequest` WHERE 0;

