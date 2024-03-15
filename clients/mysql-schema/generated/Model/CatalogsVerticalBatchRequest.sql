--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsVerticalBatchRequest' definition.
--


--
-- SELECT template for table `CatalogsVerticalBatchRequest`
--
SELECT `catalog_type`, `country`, `language`, `items`, `catalog_id` FROM `CatalogsVerticalBatchRequest` WHERE 1;

--
-- INSERT template for table `CatalogsVerticalBatchRequest`
--
INSERT INTO `CatalogsVerticalBatchRequest`(`catalog_type`, `country`, `language`, `items`, `catalog_id`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsVerticalBatchRequest`
--
UPDATE `CatalogsVerticalBatchRequest` SET `catalog_type` = ?, `country` = ?, `language` = ?, `items` = ?, `catalog_id` = ? WHERE 1;

--
-- DELETE template for table `CatalogsVerticalBatchRequest`
--
DELETE FROM `CatalogsVerticalBatchRequest` WHERE 0;

