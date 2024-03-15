--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemsDeleteBatchRequest' definition.
--


--
-- SELECT template for table `CatalogsItemsDeleteBatchRequest`
--
SELECT `country`, `language`, `operation`, `items` FROM `CatalogsItemsDeleteBatchRequest` WHERE 1;

--
-- INSERT template for table `CatalogsItemsDeleteBatchRequest`
--
INSERT INTO `CatalogsItemsDeleteBatchRequest`(`country`, `language`, `operation`, `items`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsItemsDeleteBatchRequest`
--
UPDATE `CatalogsItemsDeleteBatchRequest` SET `country` = ?, `language` = ?, `operation` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemsDeleteBatchRequest`
--
DELETE FROM `CatalogsItemsDeleteBatchRequest` WHERE 0;

