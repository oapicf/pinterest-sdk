--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedCredentials' definition.
--


--
-- SELECT template for table `CatalogsFeedCredentials`
--
SELECT `password`, `username` FROM `CatalogsFeedCredentials` WHERE 1;

--
-- INSERT template for table `CatalogsFeedCredentials`
--
INSERT INTO `CatalogsFeedCredentials`(`password`, `username`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsFeedCredentials`
--
UPDATE `CatalogsFeedCredentials` SET `password` = ?, `username` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedCredentials`
--
DELETE FROM `CatalogsFeedCredentials` WHERE 0;

