--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemsUpdateBatchRequest' definition.
--


--
-- SELECT template for table `CatalogsItemsUpdateBatchRequest`
--
SELECT `country`, `items`, `language`, `operation` FROM `CatalogsItemsUpdateBatchRequest` WHERE 1;

--
-- INSERT template for table `CatalogsItemsUpdateBatchRequest`
--
INSERT INTO `CatalogsItemsUpdateBatchRequest`(`country`, `items`, `language`, `operation`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsItemsUpdateBatchRequest`
--
UPDATE `CatalogsItemsUpdateBatchRequest` SET `country` = ?, `items` = ?, `language` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemsUpdateBatchRequest`
--
DELETE FROM `CatalogsItemsUpdateBatchRequest` WHERE 0;

