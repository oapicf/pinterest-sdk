--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedProductCounts' definition.
--


--
-- SELECT template for table `CatalogsFeedProductCounts`
--
SELECT `original`, `ingested` FROM `CatalogsFeedProductCounts` WHERE 1;

--
-- INSERT template for table `CatalogsFeedProductCounts`
--
INSERT INTO `CatalogsFeedProductCounts`(`original`, `ingested`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsFeedProductCounts`
--
UPDATE `CatalogsFeedProductCounts` SET `original` = ?, `ingested` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedProductCounts`
--
DELETE FROM `CatalogsFeedProductCounts` WHERE 0;

