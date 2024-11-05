--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsCreateRequest' definition.
--


--
-- SELECT template for table `CatalogsCreateRequest`
--
SELECT `catalog_type`, `name` FROM `CatalogsCreateRequest` WHERE 1;

--
-- INSERT template for table `CatalogsCreateRequest`
--
INSERT INTO `CatalogsCreateRequest`(`catalog_type`, `name`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsCreateRequest`
--
UPDATE `CatalogsCreateRequest` SET `catalog_type` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `CatalogsCreateRequest`
--
DELETE FROM `CatalogsCreateRequest` WHERE 0;

