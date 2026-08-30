--
-- Pinterest REST API.
-- Prepared SQL queries for 'AssetIdWithPermissions' definition.
--


--
-- SELECT template for table `AssetIdWithPermissions`
--
SELECT `id`, `permissions` FROM `AssetIdWithPermissions` WHERE 1;

--
-- INSERT template for table `AssetIdWithPermissions`
--
INSERT INTO `AssetIdWithPermissions`(`id`, `permissions`) VALUES (?, ?);

--
-- UPDATE template for table `AssetIdWithPermissions`
--
UPDATE `AssetIdWithPermissions` SET `id` = ?, `permissions` = ? WHERE 1;

--
-- DELETE template for table `AssetIdWithPermissions`
--
DELETE FROM `AssetIdWithPermissions` WHERE 0;

