--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemsUpsertBatchRequest' definition.
--


--
-- SELECT template for table `CatalogsItemsUpsertBatchRequest`
--
SELECT `country`, `language`, `operation`, `items` FROM `CatalogsItemsUpsertBatchRequest` WHERE 1;

--
-- INSERT template for table `CatalogsItemsUpsertBatchRequest`
--
INSERT INTO `CatalogsItemsUpsertBatchRequest`(`country`, `language`, `operation`, `items`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsItemsUpsertBatchRequest`
--
UPDATE `CatalogsItemsUpsertBatchRequest` SET `country` = ?, `language` = ?, `operation` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemsUpsertBatchRequest`
--
DELETE FROM `CatalogsItemsUpsertBatchRequest` WHERE 0;

