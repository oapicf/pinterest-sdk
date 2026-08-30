--
-- Pinterest REST API.
-- Prepared SQL queries for 'LocalStore' definition.
--


--
-- SELECT template for table `LocalStore`
--
SELECT `address_primary`, `address_secondary`, `city`, `country`, `created_at`, `id`, `latitude`, `longitude`, `name`, `postal_code`, `region`, `store_code`, `updated_at` FROM `LocalStore` WHERE 1;

--
-- INSERT template for table `LocalStore`
--
INSERT INTO `LocalStore`(`address_primary`, `address_secondary`, `city`, `country`, `created_at`, `id`, `latitude`, `longitude`, `name`, `postal_code`, `region`, `store_code`, `updated_at`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LocalStore`
--
UPDATE `LocalStore` SET `address_primary` = ?, `address_secondary` = ?, `city` = ?, `country` = ?, `created_at` = ?, `id` = ?, `latitude` = ?, `longitude` = ?, `name` = ?, `postal_code` = ?, `region` = ?, `store_code` = ?, `updated_at` = ? WHERE 1;

--
-- DELETE template for table `LocalStore`
--
DELETE FROM `LocalStore` WHERE 0;

