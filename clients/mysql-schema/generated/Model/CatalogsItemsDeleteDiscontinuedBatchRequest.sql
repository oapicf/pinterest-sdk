--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemsDeleteDiscontinuedBatchRequest' definition.
--


--
-- SELECT template for table `CatalogsItemsDeleteDiscontinuedBatchRequest`
--
SELECT `country`, `items`, `language`, `operation` FROM `CatalogsItemsDeleteDiscontinuedBatchRequest` WHERE 1;

--
-- INSERT template for table `CatalogsItemsDeleteDiscontinuedBatchRequest`
--
INSERT INTO `CatalogsItemsDeleteDiscontinuedBatchRequest`(`country`, `items`, `language`, `operation`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsItemsDeleteDiscontinuedBatchRequest`
--
UPDATE `CatalogsItemsDeleteDiscontinuedBatchRequest` SET `country` = ?, `items` = ?, `language` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemsDeleteDiscontinuedBatchRequest`
--
DELETE FROM `CatalogsItemsDeleteDiscontinuedBatchRequest` WHERE 0;

