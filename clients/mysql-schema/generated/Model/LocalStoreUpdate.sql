--
-- Pinterest REST API.
-- Prepared SQL queries for 'LocalStoreUpdate' definition.
--


--
-- SELECT template for table `LocalStoreUpdate`
--
SELECT `address_primary`, `address_secondary`, `city`, `country`, `id`, `latitude`, `longitude`, `name`, `postal_code`, `region`, `store_code` FROM `LocalStoreUpdate` WHERE 1;

--
-- INSERT template for table `LocalStoreUpdate`
--
INSERT INTO `LocalStoreUpdate`(`address_primary`, `address_secondary`, `city`, `country`, `id`, `latitude`, `longitude`, `name`, `postal_code`, `region`, `store_code`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LocalStoreUpdate`
--
UPDATE `LocalStoreUpdate` SET `address_primary` = ?, `address_secondary` = ?, `city` = ?, `country` = ?, `id` = ?, `latitude` = ?, `longitude` = ?, `name` = ?, `postal_code` = ?, `region` = ?, `store_code` = ? WHERE 1;

--
-- DELETE template for table `LocalStoreUpdate`
--
DELETE FROM `LocalStoreUpdate` WHERE 0;

