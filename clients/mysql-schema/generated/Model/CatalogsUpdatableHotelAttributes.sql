--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsUpdatableHotelAttributes' definition.
--


--
-- SELECT template for table `CatalogsUpdatableHotelAttributes`
--
SELECT `address`, `base_price`, `brand`, `category`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `description`, `guest_ratings`, `latitude`, `link`, `longitude`, `name`, `neighborhood`, `sale_price` FROM `CatalogsUpdatableHotelAttributes` WHERE 1;

--
-- INSERT template for table `CatalogsUpdatableHotelAttributes`
--
INSERT INTO `CatalogsUpdatableHotelAttributes`(`address`, `base_price`, `brand`, `category`, `custom_label_0`, `custom_label_1`, `custom_label_2`, `custom_label_3`, `custom_label_4`, `description`, `guest_ratings`, `latitude`, `link`, `longitude`, `name`, `neighborhood`, `sale_price`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CatalogsUpdatableHotelAttributes`
--
UPDATE `CatalogsUpdatableHotelAttributes` SET `address` = ?, `base_price` = ?, `brand` = ?, `category` = ?, `custom_label_0` = ?, `custom_label_1` = ?, `custom_label_2` = ?, `custom_label_3` = ?, `custom_label_4` = ?, `description` = ?, `guest_ratings` = ?, `latitude` = ?, `link` = ?, `longitude` = ?, `name` = ?, `neighborhood` = ?, `sale_price` = ? WHERE 1;

--
-- DELETE template for table `CatalogsUpdatableHotelAttributes`
--
DELETE FROM `CatalogsUpdatableHotelAttributes` WHERE 0;

