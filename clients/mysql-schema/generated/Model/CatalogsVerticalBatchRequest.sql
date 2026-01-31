--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsVerticalBatchRequest' definition.
--


--
-- SELECT template for table `CatalogsVerticalBatchRequest`
--
SELECT `catalog_id`, `catalog_type`, `country`, `items`, `language` FROM `CatalogsVerticalBatchRequest` WHERE 1;

--
-- INSERT template for table `CatalogsVerticalBatchRequest`
--
INSERT INTO `CatalogsVerticalBatchRequest`(`catalog_id`, `catalog_type`, `country`, `items`, `language`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsVerticalBatchRequest`
--
UPDATE `CatalogsVerticalBatchRequest` SET `catalog_id` = ?, `catalog_type` = ?, `country` = ?, `items` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `CatalogsVerticalBatchRequest`
--
DELETE FROM `CatalogsVerticalBatchRequest` WHERE 0;

