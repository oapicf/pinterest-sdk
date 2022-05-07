--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroupCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsProductGroupCreateRequest`
--
SELECT `feed_id`, `name`, `description`, `filters` FROM `CatalogsProductGroupCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroupCreateRequest`
--
INSERT INTO `CatalogsProductGroupCreateRequest`(`feed_id`, `name`, `description`, `filters`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsProductGroupCreateRequest`
--
UPDATE `CatalogsProductGroupCreateRequest` SET `feed_id` = ?, `name` = ?, `description` = ?, `filters` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroupCreateRequest`
--
DELETE FROM `CatalogsProductGroupCreateRequest` WHERE 0;

