--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelMainImage' definition.
--


--
-- SELECT template for table `CatalogsHotelMainImage`
--
SELECT `link`, `tag` FROM `CatalogsHotelMainImage` WHERE 1;

--
-- INSERT template for table `CatalogsHotelMainImage`
--
INSERT INTO `CatalogsHotelMainImage`(`link`, `tag`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsHotelMainImage`
--
UPDATE `CatalogsHotelMainImage` SET `link` = ?, `tag` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelMainImage`
--
DELETE FROM `CatalogsHotelMainImage` WHERE 0;

