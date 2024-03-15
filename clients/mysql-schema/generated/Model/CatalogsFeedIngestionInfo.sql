--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedIngestionInfo' definition.
--


--
-- SELECT template for table `CatalogsFeedIngestionInfo`
--
SELECT `IN_STOCK`, `OUT_OF_STOCK`, `PREORDER` FROM `CatalogsFeedIngestionInfo` WHERE 1;

--
-- INSERT template for table `CatalogsFeedIngestionInfo`
--
INSERT INTO `CatalogsFeedIngestionInfo`(`IN_STOCK`, `OUT_OF_STOCK`, `PREORDER`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsFeedIngestionInfo`
--
UPDATE `CatalogsFeedIngestionInfo` SET `IN_STOCK` = ?, `OUT_OF_STOCK` = ?, `PREORDER` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedIngestionInfo`
--
DELETE FROM `CatalogsFeedIngestionInfo` WHERE 0;

