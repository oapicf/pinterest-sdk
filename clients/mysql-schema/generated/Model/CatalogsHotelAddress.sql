--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelAddress' definition.
--


--
-- SELECT template for table `CatalogsHotelAddress`
--
SELECT `addr1`, `city`, `country`, `postal_code`, `region` FROM `CatalogsHotelAddress` WHERE 1;

--
-- INSERT template for table `CatalogsHotelAddress`
--
INSERT INTO `CatalogsHotelAddress`(`addr1`, `city`, `country`, `postal_code`, `region`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelAddress`
--
UPDATE `CatalogsHotelAddress` SET `addr1` = ?, `city` = ?, `country` = ?, `postal_code` = ?, `region` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelAddress`
--
DELETE FROM `CatalogsHotelAddress` WHERE 0;

