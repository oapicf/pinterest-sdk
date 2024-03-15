--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemsCreateBatchRequest' definition.
--


--
-- SELECT template for table `CatalogsItemsCreateBatchRequest`
--
SELECT `country`, `language`, `operation`, `items` FROM `CatalogsItemsCreateBatchRequest` WHERE 1;

--
-- INSERT template for table `CatalogsItemsCreateBatchRequest`
--
INSERT INTO `CatalogsItemsCreateBatchRequest`(`country`, `language`, `operation`, `items`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsItemsCreateBatchRequest`
--
UPDATE `CatalogsItemsCreateBatchRequest` SET `country` = ?, `language` = ?, `operation` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemsCreateBatchRequest`
--
DELETE FROM `CatalogsItemsCreateBatchRequest` WHERE 0;

