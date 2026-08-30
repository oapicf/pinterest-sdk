--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelFilterValuesMap' definition.
--


--
-- SELECT template for table `CatalogsHotelFilterValuesMap`
--
SELECT `brand`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4` FROM `CatalogsHotelFilterValuesMap` WHERE 1;

--
-- INSERT template for table `CatalogsHotelFilterValuesMap`
--
INSERT INTO `CatalogsHotelFilterValuesMap`(`brand`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelFilterValuesMap`
--
UPDATE `CatalogsHotelFilterValuesMap` SET `brand` = ?, `custom_label_0` = ?, `custom_label_1` = ?, `custom_label_2` = ?, `custom_label_3` = ?, `custom_label_4` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelFilterValuesMap`
--
DELETE FROM `CatalogsHotelFilterValuesMap` WHERE 0;

