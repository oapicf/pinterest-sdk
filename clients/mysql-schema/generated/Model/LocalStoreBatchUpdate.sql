--
-- Pinterest REST API.
-- Prepared SQL queries for 'LocalStoreBatchUpdate' definition.
--


--
-- SELECT template for table `LocalStoreBatchUpdate`
--
SELECT `address_primary`, `address_secondary`, `city`, `country`, `id`, `latitude`, `longitude`, `name`, `postal_code`, `region`, `store_code` FROM `LocalStoreBatchUpdate` WHERE 1;

--
-- INSERT template for table `LocalStoreBatchUpdate`
--
INSERT INTO `LocalStoreBatchUpdate`(`address_primary`, `address_secondary`, `city`, `country`, `id`, `latitude`, `longitude`, `name`, `postal_code`, `region`, `store_code`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LocalStoreBatchUpdate`
--
UPDATE `LocalStoreBatchUpdate` SET `address_primary` = ?, `address_secondary` = ?, `city` = ?, `country` = ?, `id` = ?, `latitude` = ?, `longitude` = ?, `name` = ?, `postal_code` = ?, `region` = ?, `store_code` = ? WHERE 1;

--
-- DELETE template for table `LocalStoreBatchUpdate`
--
DELETE FROM `LocalStoreBatchUpdate` WHERE 0;

