--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemsRequest' definition.
--


--
-- SELECT template for table `CatalogsItemsRequest`
--
SELECT `country`, `language`, `filters` FROM `CatalogsItemsRequest` WHERE 1;

--
-- INSERT template for table `CatalogsItemsRequest`
--
INSERT INTO `CatalogsItemsRequest`(`country`, `language`, `filters`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsItemsRequest`
--
UPDATE `CatalogsItemsRequest` SET `country` = ?, `language` = ?, `filters` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemsRequest`
--
DELETE FROM `CatalogsItemsRequest` WHERE 0;

