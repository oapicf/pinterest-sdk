--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelProductGroupFilterKeys' definition.
--


--
-- SELECT template for table `CatalogsHotelProductGroupFilterKeys`
--
SELECT `PRICE`, `HOTEL_ID`, `BRAND`, `CUSTOM_LABEL_0`, `CUSTOM_LABEL_1`, `CUSTOM_LABEL_2`, `CUSTOM_LABEL_3`, `CUSTOM_LABEL_4`, `COUNTRY`, `TITLE_KEYWORDS` FROM `CatalogsHotelProductGroupFilterKeys` WHERE 1;

--
-- INSERT template for table `CatalogsHotelProductGroupFilterKeys`
--
INSERT INTO `CatalogsHotelProductGroupFilterKeys`(`PRICE`, `HOTEL_ID`, `BRAND`, `CUSTOM_LABEL_0`, `CUSTOM_LABEL_1`, `CUSTOM_LABEL_2`, `CUSTOM_LABEL_3`, `CUSTOM_LABEL_4`, `COUNTRY`, `TITLE_KEYWORDS`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelProductGroupFilterKeys`
--
UPDATE `CatalogsHotelProductGroupFilterKeys` SET `PRICE` = ?, `HOTEL_ID` = ?, `BRAND` = ?, `CUSTOM_LABEL_0` = ?, `CUSTOM_LABEL_1` = ?, `CUSTOM_LABEL_2` = ?, `CUSTOM_LABEL_3` = ?, `CUSTOM_LABEL_4` = ?, `COUNTRY` = ?, `TITLE_KEYWORDS` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelProductGroupFilterKeys`
--
DELETE FROM `CatalogsHotelProductGroupFilterKeys` WHERE 0;

