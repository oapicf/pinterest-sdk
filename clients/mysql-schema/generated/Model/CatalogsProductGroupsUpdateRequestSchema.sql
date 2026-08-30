--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroupsUpdateRequestSchema' definition.
--


--
-- SELECT template for table `CatalogsProductGroupsUpdateRequestSchema`
--
SELECT `description`, `filters`, `is_featured`, `name`, `catalog_type`, `country`, `locale` FROM `CatalogsProductGroupsUpdateRequestSchema` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroupsUpdateRequestSchema`
--
INSERT INTO `CatalogsProductGroupsUpdateRequestSchema`(`description`, `filters`, `is_featured`, `name`, `catalog_type`, `country`, `locale`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsProductGroupsUpdateRequestSchema`
--
UPDATE `CatalogsProductGroupsUpdateRequestSchema` SET `description` = ?, `filters` = ?, `is_featured` = ?, `name` = ?, `catalog_type` = ?, `country` = ?, `locale` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroupsUpdateRequestSchema`
--
DELETE FROM `CatalogsProductGroupsUpdateRequestSchema` WHERE 0;

