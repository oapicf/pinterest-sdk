--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsUpdateRetailItem' definition.
--


--
-- SELECT template for table `CatalogsUpdateRetailItem`
--
SELECT `attributes`, `item_id`, `operation`, `update_mask` FROM `CatalogsUpdateRetailItem` WHERE 1;

--
-- INSERT template for table `CatalogsUpdateRetailItem`
--
INSERT INTO `CatalogsUpdateRetailItem`(`attributes`, `item_id`, `operation`, `update_mask`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsUpdateRetailItem`
--
UPDATE `CatalogsUpdateRetailItem` SET `attributes` = ?, `item_id` = ?, `operation` = ?, `update_mask` = ? WHERE 1;

--
-- DELETE template for table `CatalogsUpdateRetailItem`
--
DELETE FROM `CatalogsUpdateRetailItem` WHERE 0;

