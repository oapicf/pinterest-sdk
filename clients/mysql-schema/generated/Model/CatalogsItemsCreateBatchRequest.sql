--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemsCreateBatchRequest' definition.
--


--
-- SELECT template for table `CatalogsItemsCreateBatchRequest`
--
SELECT `country`, `items`, `language`, `operation` FROM `CatalogsItemsCreateBatchRequest` WHERE 1;

--
-- INSERT template for table `CatalogsItemsCreateBatchRequest`
--
INSERT INTO `CatalogsItemsCreateBatchRequest`(`country`, `items`, `language`, `operation`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsItemsCreateBatchRequest`
--
UPDATE `CatalogsItemsCreateBatchRequest` SET `country` = ?, `items` = ?, `language` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemsCreateBatchRequest`
--
DELETE FROM `CatalogsItemsCreateBatchRequest` WHERE 0;

