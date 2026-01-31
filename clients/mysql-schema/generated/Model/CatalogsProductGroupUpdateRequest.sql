--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroupUpdateRequest' definition.
--


--
-- SELECT template for table `CatalogsProductGroupUpdateRequest`
--
SELECT `description`, `filters`, `is_featured`, `name` FROM `CatalogsProductGroupUpdateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroupUpdateRequest`
--
INSERT INTO `CatalogsProductGroupUpdateRequest`(`description`, `filters`, `is_featured`, `name`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsProductGroupUpdateRequest`
--
UPDATE `CatalogsProductGroupUpdateRequest` SET `description` = ?, `filters` = ?, `is_featured` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroupUpdateRequest`
--
DELETE FROM `CatalogsProductGroupUpdateRequest` WHERE 0;

