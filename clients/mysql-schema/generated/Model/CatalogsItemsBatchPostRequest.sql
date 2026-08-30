--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsItemsBatchPostRequest' definition.
--


--
-- SELECT template for table `CatalogsItemsBatchPostRequest`
--
SELECT `catalog_id`, `catalog_type`, `country`, `items`, `language`, `operation` FROM `CatalogsItemsBatchPostRequest` WHERE 1;

--
-- INSERT template for table `CatalogsItemsBatchPostRequest`
--
INSERT INTO `CatalogsItemsBatchPostRequest`(`catalog_id`, `catalog_type`, `country`, `items`, `language`, `operation`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsItemsBatchPostRequest`
--
UPDATE `CatalogsItemsBatchPostRequest` SET `catalog_id` = ?, `catalog_type` = ?, `country` = ?, `items` = ?, `language` = ?, `operation` = ? WHERE 1;

--
-- DELETE template for table `CatalogsItemsBatchPostRequest`
--
DELETE FROM `CatalogsItemsBatchPostRequest` WHERE 0;

