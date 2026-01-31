--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroupCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsProductGroupCreateRequest`
--
SELECT `description`, `feed_id`, `filters`, `is_featured`, `name` FROM `CatalogsProductGroupCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroupCreateRequest`
--
INSERT INTO `CatalogsProductGroupCreateRequest`(`description`, `feed_id`, `filters`, `is_featured`, `name`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsProductGroupCreateRequest`
--
UPDATE `CatalogsProductGroupCreateRequest` SET `description` = ?, `feed_id` = ?, `filters` = ?, `is_featured` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroupCreateRequest`
--
DELETE FROM `CatalogsProductGroupCreateRequest` WHERE 0;

