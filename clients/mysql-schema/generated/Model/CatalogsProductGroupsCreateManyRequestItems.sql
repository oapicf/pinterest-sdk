--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroupsCreateManyRequestItems' definition.
--


--
-- SELECT template for table `CatalogsProductGroupsCreateManyRequestItems`
--
SELECT `description`, `feed_id`, `filters`, `is_featured`, `name`, `catalog_id`, `catalog_type`, `country`, `locale` FROM `CatalogsProductGroupsCreateManyRequestItems` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroupsCreateManyRequestItems`
--
INSERT INTO `CatalogsProductGroupsCreateManyRequestItems`(`description`, `feed_id`, `filters`, `is_featured`, `name`, `catalog_id`, `catalog_type`, `country`, `locale`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsProductGroupsCreateManyRequestItems`
--
UPDATE `CatalogsProductGroupsCreateManyRequestItems` SET `description` = ?, `feed_id` = ?, `filters` = ?, `is_featured` = ?, `name` = ?, `catalog_id` = ?, `catalog_type` = ?, `country` = ?, `locale` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroupsCreateManyRequestItems`
--
DELETE FROM `CatalogsProductGroupsCreateManyRequestItems` WHERE 0;

