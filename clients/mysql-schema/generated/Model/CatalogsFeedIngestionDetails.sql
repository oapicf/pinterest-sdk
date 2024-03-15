--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedIngestionDetails' definition.
--


--
-- SELECT template for table `CatalogsFeedIngestionDetails`
--
SELECT `errors`, `info`, `warnings` FROM `CatalogsFeedIngestionDetails` WHERE 1;

--
-- INSERT template for table `CatalogsFeedIngestionDetails`
--
INSERT INTO `CatalogsFeedIngestionDetails`(`errors`, `info`, `warnings`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsFeedIngestionDetails`
--
UPDATE `CatalogsFeedIngestionDetails` SET `errors` = ?, `info` = ?, `warnings` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedIngestionDetails`
--
DELETE FROM `CatalogsFeedIngestionDetails` WHERE 0;

