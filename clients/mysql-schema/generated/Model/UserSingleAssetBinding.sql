--
-- Pinterest REST API.
-- Prepared SQL queries for 'UserSingleAssetBinding' definition.
--


--
-- SELECT template for table `UserSingleAssetBinding`
--
SELECT `permissions`, `user` FROM `UserSingleAssetBinding` WHERE 1;

--
-- INSERT template for table `UserSingleAssetBinding`
--
INSERT INTO `UserSingleAssetBinding`(`permissions`, `user`) VALUES (?, ?);

--
-- UPDATE template for table `UserSingleAssetBinding`
--
UPDATE `UserSingleAssetBinding` SET `permissions` = ?, `user` = ? WHERE 1;

--
-- DELETE template for table `UserSingleAssetBinding`
--
DELETE FROM `UserSingleAssetBinding` WHERE 0;

