--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsVerticalProductGroupCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsVerticalProductGroupCreateRequest`
--
SELECT `catalog_id`, `catalog_type`, `country`, `description`, `filters`, `locale`, `name` FROM `CatalogsVerticalProductGroupCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsVerticalProductGroupCreateRequest`
--
INSERT INTO `CatalogsVerticalProductGroupCreateRequest`(`catalog_id`, `catalog_type`, `country`, `description`, `filters`, `locale`, `name`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsVerticalProductGroupCreateRequest`
--
UPDATE `CatalogsVerticalProductGroupCreateRequest` SET `catalog_id` = ?, `catalog_type` = ?, `country` = ?, `description` = ?, `filters` = ?, `locale` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `CatalogsVerticalProductGroupCreateRequest`
--
DELETE FROM `CatalogsVerticalProductGroupCreateRequest` WHERE 0;

