--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsHotelAttributes' definition.
--


--
-- SELECT template for table `CatalogsHotelAttributes`
--
SELECT `name`, `link`, `description`, `brand`, `latitude`, `longitude`, `neighborhood`, `address`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `category`, `base_price`, `sale_price`, `guest_ratings`, `main_image`, `additional_image_link` FROM `CatalogsHotelAttributes` WHERE 1;

--
-- INSERT template for table `CatalogsHotelAttributes`
--
INSERT INTO `CatalogsHotelAttributes`(`name`, `link`, `description`, `brand`, `latitude`, `longitude`, `neighborhood`, `address`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `category`, `base_price`, `sale_price`, `guest_ratings`, `main_image`, `additional_image_link`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsHotelAttributes`
--
UPDATE `CatalogsHotelAttributes` SET `name` = ?, `link` = ?, `description` = ?, `brand` = ?, `latitude` = ?, `longitude` = ?, `neighborhood` = ?, `address` = ?, `custom_label_0` = ?, `custom_label_1` = ?, `custom_label_2` = ?, `custom_label_3` = ?, `custom_label_4` = ?, `category` = ?, `base_price` = ?, `sale_price` = ?, `guest_ratings` = ?, `main_image` = ?, `additional_image_link` = ? WHERE 1;

--
-- DELETE template for table `CatalogsHotelAttributes`
--
DELETE FROM `CatalogsHotelAttributes` WHERE 0;

