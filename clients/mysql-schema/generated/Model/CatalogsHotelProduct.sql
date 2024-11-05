--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelProduct' definition.
--


--
-- SELECT template for table `CatalogsHotelProduct`
--
SELECT `catalog_type`, `metadata`, `pin` FROM `CatalogsHotelProduct` WHERE 1;

--
-- INSERT template for table `CatalogsHotelProduct`
--
INSERT INTO `CatalogsHotelProduct`(`catalog_type`, `metadata`, `pin`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelProduct`
--
UPDATE `CatalogsHotelProduct` SET `catalog_type` = ?, `metadata` = ?, `pin` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelProduct`
--
DELETE FROM `CatalogsHotelProduct` WHERE 0;

