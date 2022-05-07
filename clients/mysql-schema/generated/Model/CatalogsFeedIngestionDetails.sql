--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedIngestionDetails' definition.
--


--
-- SELECT template for table `CatalogsFeedIngestionDetails`
--
SELECT `errors`, `info` FROM `CatalogsFeedIngestionDetails` WHERE 1;

--
-- INSERT template for table `CatalogsFeedIngestionDetails`
--
INSERT INTO `CatalogsFeedIngestionDetails`(`errors`, `info`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsFeedIngestionDetails`
--
UPDATE `CatalogsFeedIngestionDetails` SET `errors` = ?, `info` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedIngestionDetails`
--
DELETE FROM `CatalogsFeedIngestionDetails` WHERE 0;

