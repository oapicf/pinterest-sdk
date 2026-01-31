--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemsDeleteBatchRequest' definition.
--


--
-- SELECT template for table `CatalogsItemsDeleteBatchRequest`
--
SELECT `country`, `items`, `language`, `operation` FROM `CatalogsItemsDeleteBatchRequest` WHERE 1;

--
-- INSERT template for table `CatalogsItemsDeleteBatchRequest`
--
INSERT INTO `CatalogsItemsDeleteBatchRequest`(`country`, `items`, `language`, `operation`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsItemsDeleteBatchRequest`
--
UPDATE `CatalogsItemsDeleteBatchRequest` SET `country` = ?, `items` = ?, `language` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemsDeleteBatchRequest`
--
DELETE FROM `CatalogsItemsDeleteBatchRequest` WHERE 0;

