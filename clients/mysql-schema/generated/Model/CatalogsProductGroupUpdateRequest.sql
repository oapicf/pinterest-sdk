--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroupUpdateRequest' definition.
--


--
-- SELECT template for table `CatalogsProductGroupUpdateRequest`
--
SELECT `name`, `description`, `is_featured`, `filters` FROM `CatalogsProductGroupUpdateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroupUpdateRequest`
--
INSERT INTO `CatalogsProductGroupUpdateRequest`(`name`, `description`, `is_featured`, `filters`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsProductGroupUpdateRequest`
--
UPDATE `CatalogsProductGroupUpdateRequest` SET `name` = ?, `description` = ?, `is_featured` = ?, `filters` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroupUpdateRequest`
--
DELETE FROM `CatalogsProductGroupUpdateRequest` WHERE 0;

