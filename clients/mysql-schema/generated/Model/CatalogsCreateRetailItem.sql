--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreateRetailItem' definition.
--


--
-- SELECT template for table `CatalogsCreateRetailItem`
--
SELECT `item_id`, `operation`, `attributes` FROM `CatalogsCreateRetailItem` WHERE 1;

--
-- INSERT template for table `CatalogsCreateRetailItem`
--
INSERT INTO `CatalogsCreateRetailItem`(`item_id`, `operation`, `attributes`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsCreateRetailItem`
--
UPDATE `CatalogsCreateRetailItem` SET `item_id` = ?, `operation` = ?, `attributes` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreateRetailItem`
--
DELETE FROM `CatalogsCreateRetailItem` WHERE 0;

