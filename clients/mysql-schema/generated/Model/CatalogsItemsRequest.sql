--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemsRequest' definition.
--


--
-- SELECT template for table `CatalogsItemsRequest`
--
SELECT `country`, `filters`, `language` FROM `CatalogsItemsRequest` WHERE 1;

--
-- INSERT template for table `CatalogsItemsRequest`
--
INSERT INTO `CatalogsItemsRequest`(`country`, `filters`, `language`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsItemsRequest`
--
UPDATE `CatalogsItemsRequest` SET `country` = ?, `filters` = ?, `language` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemsRequest`
--
DELETE FROM `CatalogsItemsRequest` WHERE 0;

