--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemsUpdateBatchRequest' definition.
--


--
-- SELECT template for table `CatalogsItemsUpdateBatchRequest`
--
SELECT `country`, `language`, `operation`, `items` FROM `CatalogsItemsUpdateBatchRequest` WHERE 1;

--
-- INSERT template for table `CatalogsItemsUpdateBatchRequest`
--
INSERT INTO `CatalogsItemsUpdateBatchRequest`(`country`, `language`, `operation`, `items`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsItemsUpdateBatchRequest`
--
UPDATE `CatalogsItemsUpdateBatchRequest` SET `country` = ?, `language` = ?, `operation` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemsUpdateBatchRequest`
--
DELETE FROM `CatalogsItemsUpdateBatchRequest` WHERE 0;

