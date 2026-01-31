--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemsBatchRequest' definition.
--


--
-- SELECT template for table `CatalogsItemsBatchRequest`
--
SELECT `country`, `items`, `language`, `operation` FROM `CatalogsItemsBatchRequest` WHERE 1;

--
-- INSERT template for table `CatalogsItemsBatchRequest`
--
INSERT INTO `CatalogsItemsBatchRequest`(`country`, `items`, `language`, `operation`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsItemsBatchRequest`
--
UPDATE `CatalogsItemsBatchRequest` SET `country` = ?, `items` = ?, `language` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemsBatchRequest`
--
DELETE FROM `CatalogsItemsBatchRequest` WHERE 0;

