--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemsDeleteDiscontinuedBatchRequest' definition.
--


--
-- SELECT template for table `CatalogsItemsDeleteDiscontinuedBatchRequest`
--
SELECT `country`, `language`, `operation`, `items` FROM `CatalogsItemsDeleteDiscontinuedBatchRequest` WHERE 1;

--
-- INSERT template for table `CatalogsItemsDeleteDiscontinuedBatchRequest`
--
INSERT INTO `CatalogsItemsDeleteDiscontinuedBatchRequest`(`country`, `language`, `operation`, `items`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsItemsDeleteDiscontinuedBatchRequest`
--
UPDATE `CatalogsItemsDeleteDiscontinuedBatchRequest` SET `country` = ?, `language` = ?, `operation` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemsDeleteDiscontinuedBatchRequest`
--
DELETE FROM `CatalogsItemsDeleteDiscontinuedBatchRequest` WHERE 0;

