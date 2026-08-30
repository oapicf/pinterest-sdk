--
-- Pinterest REST API.
-- Prepared SQL queries for 'CreateAssetAccessRequestItem' definition.
--


--
-- SELECT template for table `CreateAssetAccessRequestItem`
--
SELECT `asset_id_to_permissions`, `partner_id` FROM `CreateAssetAccessRequestItem` WHERE 1;

--
-- INSERT template for table `CreateAssetAccessRequestItem`
--
INSERT INTO `CreateAssetAccessRequestItem`(`asset_id_to_permissions`, `partner_id`) VALUES (?, ?);

--
-- UPDATE template for table `CreateAssetAccessRequestItem`
--
UPDATE `CreateAssetAccessRequestItem` SET `asset_id_to_permissions` = ?, `partner_id` = ? WHERE 1;

--
-- DELETE template for table `CreateAssetAccessRequestItem`
--
DELETE FROM `CreateAssetAccessRequestItem` WHERE 0;

