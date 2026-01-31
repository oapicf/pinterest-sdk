--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreateRetailItem' definition.
--


--
-- SELECT template for table `CatalogsCreateRetailItem`
--
SELECT `attributes`, `item_id`, `operation` FROM `CatalogsCreateRetailItem` WHERE 1;

--
-- INSERT template for table `CatalogsCreateRetailItem`
--
INSERT INTO `CatalogsCreateRetailItem`(`attributes`, `item_id`, `operation`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsCreateRetailItem`
--
UPDATE `CatalogsCreateRetailItem` SET `attributes` = ?, `item_id` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreateRetailItem`
--
DELETE FROM `CatalogsCreateRetailItem` WHERE 0;

