--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsUpdatableHotelAttributes' definition.
--


--
-- SELECT template for table `CatalogsUpdatableHotelAttributes`
--
SELECT `name`, `link`, `description`, `brand`, `latitude`, `longitude`, `neighborhood`, `address`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `category`, `base_price`, `sale_price`, `guest_ratings` FROM `CatalogsUpdatableHotelAttributes` WHERE 1;

--
-- INSERT template for table `CatalogsUpdatableHotelAttributes`
--
INSERT INTO `CatalogsUpdatableHotelAttributes`(`name`, `link`, `description`, `brand`, `latitude`, `longitude`, `neighborhood`, `address`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `category`, `base_price`, `sale_price`, `guest_ratings`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsUpdatableHotelAttributes`
--
UPDATE `CatalogsUpdatableHotelAttributes` SET `name` = ?, `link` = ?, `description` = ?, `brand` = ?, `latitude` = ?, `longitude` = ?, `neighborhood` = ?, `address` = ?, `custom_label_0` = ?, `custom_label_1` = ?, `custom_label_2` = ?, `custom_label_3` = ?, `custom_label_4` = ?, `category` = ?, `base_price` = ?, `sale_price` = ?, `guest_ratings` = ? WHERE 1;

--
-- DELETE template for table `CatalogsUpdatableHotelAttributes`
--
DELETE FROM `CatalogsUpdatableHotelAttributes` WHERE 0;

