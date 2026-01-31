--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsUpsertRetailItem' definition.
--


--
-- SELECT template for table `CatalogsUpsertRetailItem`
--
SELECT `attributes`, `item_id`, `operation` FROM `CatalogsUpsertRetailItem` WHERE 1;

--
-- INSERT template for table `CatalogsUpsertRetailItem`
--
INSERT INTO `CatalogsUpsertRetailItem`(`attributes`, `item_id`, `operation`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsUpsertRetailItem`
--
UPDATE `CatalogsUpsertRetailItem` SET `attributes` = ?, `item_id` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `CatalogsUpsertRetailItem`
--
DELETE FROM `CatalogsUpsertRetailItem` WHERE 0;

