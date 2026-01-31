--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelAttributes' definition.
--


--
-- SELECT template for table `CatalogsHotelAttributes`
--
SELECT `address`, `base_price`, `brand`, `category`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `description`, `guest_ratings`, `latitude`, `link`, `longitude`, `name`, `neighborhood`, `sale_price`, `additional_image_link`, `main_image` FROM `CatalogsHotelAttributes` WHERE 1;

--
-- INSERT template for table `CatalogsHotelAttributes`
--
INSERT INTO `CatalogsHotelAttributes`(`address`, `base_price`, `brand`, `category`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `description`, `guest_ratings`, `latitude`, `link`, `longitude`, `name`, `neighborhood`, `sale_price`, `additional_image_link`, `main_image`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelAttributes`
--
UPDATE `CatalogsHotelAttributes` SET `address` = ?, `base_price` = ?, `brand` = ?, `category` = ?, `custom_label_0` = ?, `custom_label_1` = ?, `custom_label_2` = ?, `custom_label_3` = ?, `custom_label_4` = ?, `description` = ?, `guest_ratings` = ?, `latitude` = ?, `link` = ?, `longitude` = ?, `name` = ?, `neighborhood` = ?, `sale_price` = ?, `additional_image_link` = ?, `main_image` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelAttributes`
--
DELETE FROM `CatalogsHotelAttributes` WHERE 0;

