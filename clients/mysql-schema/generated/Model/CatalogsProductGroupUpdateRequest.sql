--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroupUpdateRequest' definition.
--


--
-- SELECT template for table `CatalogsProductGroupUpdateRequest`
--
SELECT `feed_id`, `name`, `description`, `filters` FROM `CatalogsProductGroupUpdateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroupUpdateRequest`
--
INSERT INTO `CatalogsProductGroupUpdateRequest`(`feed_id`, `name`, `description`, `filters`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsProductGroupUpdateRequest`
--
UPDATE `CatalogsProductGroupUpdateRequest` SET `feed_id` = ?, `name` = ?, `description` = ?, `filters` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroupUpdateRequest`
--
DELETE FROM `CatalogsProductGroupUpdateRequest` WHERE 0;

