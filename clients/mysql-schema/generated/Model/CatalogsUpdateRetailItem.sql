--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsUpdateRetailItem' definition.
--


--
-- SELECT template for table `CatalogsUpdateRetailItem`
--
SELECT `item_id`, `operation`, `attributes`, `update_mask` FROM `CatalogsUpdateRetailItem` WHERE 1;

--
-- INSERT template for table `CatalogsUpdateRetailItem`
--
INSERT INTO `CatalogsUpdateRetailItem`(`item_id`, `operation`, `attributes`, `update_mask`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsUpdateRetailItem`
--
UPDATE `CatalogsUpdateRetailItem` SET `item_id` = ?, `operation` = ?, `attributes` = ?, `update_mask` = ? WHERE 1;

--
-- DELETE template for table `CatalogsUpdateRetailItem`
--
DELETE FROM `CatalogsUpdateRetailItem` WHERE 0;

