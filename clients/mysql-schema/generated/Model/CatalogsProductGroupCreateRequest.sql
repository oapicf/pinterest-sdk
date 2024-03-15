--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroupCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsProductGroupCreateRequest`
--
SELECT `name`, `description`, `is_featured`, `filters`, `feed_id` FROM `CatalogsProductGroupCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroupCreateRequest`
--
INSERT INTO `CatalogsProductGroupCreateRequest`(`name`, `description`, `is_featured`, `filters`, `feed_id`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsProductGroupCreateRequest`
--
UPDATE `CatalogsProductGroupCreateRequest` SET `name` = ?, `description` = ?, `is_featured` = ?, `filters` = ?, `feed_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroupCreateRequest`
--
DELETE FROM `CatalogsProductGroupCreateRequest` WHERE 0;

