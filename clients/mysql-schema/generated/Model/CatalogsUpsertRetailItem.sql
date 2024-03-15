--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsUpsertRetailItem' definition.
--


--
-- SELECT template for table `CatalogsUpsertRetailItem`
--
SELECT `item_id`, `operation`, `attributes` FROM `CatalogsUpsertRetailItem` WHERE 1;

--
-- INSERT template for table `CatalogsUpsertRetailItem`
--
INSERT INTO `CatalogsUpsertRetailItem`(`item_id`, `operation`, `attributes`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsUpsertRetailItem`
--
UPDATE `CatalogsUpsertRetailItem` SET `item_id` = ?, `operation` = ?, `attributes` = ? WHERE 1;

--
-- DELETE template for table `CatalogsUpsertRetailItem`
--
DELETE FROM `CatalogsUpsertRetailItem` WHERE 0;

