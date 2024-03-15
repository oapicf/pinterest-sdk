--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemsBatchRequest' definition.
--


--
-- SELECT template for table `CatalogsItemsBatchRequest`
--
SELECT `country`, `language`, `operation`, `items` FROM `CatalogsItemsBatchRequest` WHERE 1;

--
-- INSERT template for table `CatalogsItemsBatchRequest`
--
INSERT INTO `CatalogsItemsBatchRequest`(`country`, `language`, `operation`, `items`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsItemsBatchRequest`
--
UPDATE `CatalogsItemsBatchRequest` SET `country` = ?, `language` = ?, `operation` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemsBatchRequest`
--
DELETE FROM `CatalogsItemsBatchRequest` WHERE 0;

