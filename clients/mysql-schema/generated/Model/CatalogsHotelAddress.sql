--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelAddress' definition.
--


--
-- SELECT template for table `CatalogsHotelAddress`
--
SELECT `addr1`, `city`, `region`, `country`, `postal_code` FROM `CatalogsHotelAddress` WHERE 1;

--
-- INSERT template for table `CatalogsHotelAddress`
--
INSERT INTO `CatalogsHotelAddress`(`addr1`, `city`, `region`, `country`, `postal_code`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelAddress`
--
UPDATE `CatalogsHotelAddress` SET `addr1` = ?, `city` = ?, `region` = ?, `country` = ?, `postal_code` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelAddress`
--
DELETE FROM `CatalogsHotelAddress` WHERE 0;

