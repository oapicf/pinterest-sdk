--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroupUpdateManyRequestItemsOneOfItems0' definition.
--


--
-- SELECT template for table `CatalogsProductGroupUpdateManyRequestItemsOneOfItems0`
--
SELECT `description`, `filters`, `is_featured`, `name`, `id` FROM `CatalogsProductGroupUpdateManyRequestItemsOneOfItems0` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroupUpdateManyRequestItemsOneOfItems0`
--
INSERT INTO `CatalogsProductGroupUpdateManyRequestItemsOneOfItems0`(`description`, `filters`, `is_featured`, `name`, `id`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsProductGroupUpdateManyRequestItemsOneOfItems0`
--
UPDATE `CatalogsProductGroupUpdateManyRequestItemsOneOfItems0` SET `description` = ?, `filters` = ?, `is_featured` = ?, `name` = ?, `id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroupUpdateManyRequestItemsOneOfItems0`
--
DELETE FROM `CatalogsProductGroupUpdateManyRequestItemsOneOfItems0` WHERE 0;

