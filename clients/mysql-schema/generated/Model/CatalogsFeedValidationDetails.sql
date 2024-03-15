--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsFeedValidationDetails' definition.
--


--
-- SELECT template for table `CatalogsFeedValidationDetails`
--
SELECT `errors`, `warnings` FROM `CatalogsFeedValidationDetails` WHERE 1;

--
-- INSERT template for table `CatalogsFeedValidationDetails`
--
INSERT INTO `CatalogsFeedValidationDetails`(`errors`, `warnings`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsFeedValidationDetails`
--
UPDATE `CatalogsFeedValidationDetails` SET `errors` = ?, `warnings` = ? WHERE 1;

--
-- DELETE template for table `CatalogsFeedValidationDetails`
--
DELETE FROM `CatalogsFeedValidationDetails` WHERE 0;

