--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsDeleteRetailItem' definition.
--


--
-- SELECT template for table `CatalogsDeleteRetailItem`
--
SELECT `item_id`, `last_updated_time`, `operation` FROM `CatalogsDeleteRetailItem` WHERE 1;

--
-- INSERT template for table `CatalogsDeleteRetailItem`
--
INSERT INTO `CatalogsDeleteRetailItem`(`item_id`, `last_updated_time`, `operation`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsDeleteRetailItem`
--
UPDATE `CatalogsDeleteRetailItem` SET `item_id` = ?, `last_updated_time` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `CatalogsDeleteRetailItem`
--
DELETE FROM `CatalogsDeleteRetailItem` WHERE 0;

