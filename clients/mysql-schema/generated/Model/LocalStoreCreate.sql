--
-- Pinterest REST API.
-- Prepared SQL queries for 'LocalStoreCreate' definition.
--


--
-- SELECT template for table `LocalStoreCreate`
--
SELECT `address_primary`, `address_secondary`, `city`, `country`, `latitude`, `longitude`, `name`, `postal_code`, `region`, `store_code` FROM `LocalStoreCreate` WHERE 1;

--
-- INSERT template for table `LocalStoreCreate`
--
INSERT INTO `LocalStoreCreate`(`address_primary`, `address_secondary`, `city`, `country`, `latitude`, `longitude`, `name`, `postal_code`, `region`, `store_code`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LocalStoreCreate`
--
UPDATE `LocalStoreCreate` SET `address_primary` = ?, `address_secondary` = ?, `city` = ?, `country` = ?, `latitude` = ?, `longitude` = ?, `name` = ?, `postal_code` = ?, `region` = ?, `store_code` = ? WHERE 1;

--
-- DELETE template for table `LocalStoreCreate`
--
DELETE FROM `LocalStoreCreate` WHERE 0;

