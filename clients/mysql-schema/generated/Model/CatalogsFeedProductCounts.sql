--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedProductCounts' definition.
--


--
-- SELECT template for table `CatalogsFeedProductCounts`
--
SELECT `ingested`, `original` FROM `CatalogsFeedProductCounts` WHERE 1;

--
-- INSERT template for table `CatalogsFeedProductCounts`
--
INSERT INTO `CatalogsFeedProductCounts`(`ingested`, `original`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsFeedProductCounts`
--
UPDATE `CatalogsFeedProductCounts` SET `ingested` = ?, `original` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedProductCounts`
--
DELETE FROM `CatalogsFeedProductCounts` WHERE 0;

