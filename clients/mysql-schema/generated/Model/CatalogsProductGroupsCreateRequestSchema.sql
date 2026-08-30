--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroupsCreateRequestSchema' definition.
--


--
-- SELECT template for table `CatalogsProductGroupsCreateRequestSchema`
--
SELECT `description`, `feed_id`, `filters`, `is_featured`, `name`, `catalog_id`, `catalog_type`, `country`, `locale` FROM `CatalogsProductGroupsCreateRequestSchema` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroupsCreateRequestSchema`
--
INSERT INTO `CatalogsProductGroupsCreateRequestSchema`(`description`, `feed_id`, `filters`, `is_featured`, `name`, `catalog_id`, `catalog_type`, `country`, `locale`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsProductGroupsCreateRequestSchema`
--
UPDATE `CatalogsProductGroupsCreateRequestSchema` SET `description` = ?, `feed_id` = ?, `filters` = ?, `is_featured` = ?, `name` = ?, `catalog_id` = ?, `catalog_type` = ?, `country` = ?, `locale` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroupsCreateRequestSchema`
--
DELETE FROM `CatalogsProductGroupsCreateRequestSchema` WHERE 0;

