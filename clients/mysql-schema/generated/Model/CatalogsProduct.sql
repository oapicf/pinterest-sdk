--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProduct' definition.
--


--
-- SELECT template for table `CatalogsProduct`
--
SELECT `catalog_type`, `metadata`, `pin` FROM `CatalogsProduct` WHERE 1;

--
-- INSERT template for table `CatalogsProduct`
--
INSERT INTO `CatalogsProduct`(`catalog_type`, `metadata`, `pin`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsProduct`
--
UPDATE `CatalogsProduct` SET `catalog_type` = ?, `metadata` = ?, `pin` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProduct`
--
DELETE FROM `CatalogsProduct` WHERE 0;

