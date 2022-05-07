--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedIngestionInfo' definition.
--


--
-- SELECT template for table `CatalogsFeedIngestionInfo`
--
SELECT `in_stock`, `out_of_stock`, `preorder` FROM `CatalogsFeedIngestionInfo` WHERE 1;

--
-- INSERT template for table `CatalogsFeedIngestionInfo`
--
INSERT INTO `CatalogsFeedIngestionInfo`(`in_stock`, `out_of_stock`, `preorder`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsFeedIngestionInfo`
--
UPDATE `CatalogsFeedIngestionInfo` SET `in_stock` = ?, `out_of_stock` = ?, `preorder` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedIngestionInfo`
--
DELETE FROM `CatalogsFeedIngestionInfo` WHERE 0;

