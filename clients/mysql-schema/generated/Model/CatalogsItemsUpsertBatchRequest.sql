--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemsUpsertBatchRequest' definition.
--


--
-- SELECT template for table `CatalogsItemsUpsertBatchRequest`
--
SELECT `country`, `items`, `language`, `operation` FROM `CatalogsItemsUpsertBatchRequest` WHERE 1;

--
-- INSERT template for table `CatalogsItemsUpsertBatchRequest`
--
INSERT INTO `CatalogsItemsUpsertBatchRequest`(`country`, `items`, `language`, `operation`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsItemsUpsertBatchRequest`
--
UPDATE `CatalogsItemsUpsertBatchRequest` SET `country` = ?, `items` = ?, `language` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemsUpsertBatchRequest`
--
DELETE FROM `CatalogsItemsUpsertBatchRequest` WHERE 0;

