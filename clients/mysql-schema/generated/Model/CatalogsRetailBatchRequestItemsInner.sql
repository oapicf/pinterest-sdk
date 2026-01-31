--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsRetailBatchRequest_items_inner' definition.
--


--
-- SELECT template for table `CatalogsRetailBatchRequest_items_inner`
--
SELECT `attributes`, `item_id`, `operation`, `update_mask`, `last_updated_time` FROM `CatalogsRetailBatchRequest_items_inner` WHERE 1;

--
-- INSERT template for table `CatalogsRetailBatchRequest_items_inner`
--
INSERT INTO `CatalogsRetailBatchRequest_items_inner`(`attributes`, `item_id`, `operation`, `update_mask`, `last_updated_time`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsRetailBatchRequest_items_inner`
--
UPDATE `CatalogsRetailBatchRequest_items_inner` SET `attributes` = ?, `item_id` = ?, `operation` = ?, `update_mask` = ?, `last_updated_time` = ? WHERE 1;

--
-- DELETE template for table `CatalogsRetailBatchRequest_items_inner`
--
DELETE FROM `CatalogsRetailBatchRequest_items_inner` WHERE 0;

