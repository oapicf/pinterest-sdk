--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailBatchRequest_items_inner' definition.
--


--
-- SELECT template for table `CatalogsRetailBatchRequest_items_inner`
--
SELECT `item_id`, `operation`, `attributes`, `update_mask` FROM `CatalogsRetailBatchRequest_items_inner` WHERE 1;

--
-- INSERT template for table `CatalogsRetailBatchRequest_items_inner`
--
INSERT INTO `CatalogsRetailBatchRequest_items_inner`(`item_id`, `operation`, `attributes`, `update_mask`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailBatchRequest_items_inner`
--
UPDATE `CatalogsRetailBatchRequest_items_inner` SET `item_id` = ?, `operation` = ?, `attributes` = ?, `update_mask` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailBatchRequest_items_inner`
--
DELETE FROM `CatalogsRetailBatchRequest_items_inner` WHERE 0;

