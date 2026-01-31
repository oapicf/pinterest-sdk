--
-- Pinterest REST API.
-- Prepared SQL queries for 'CreateAssetInvitesRequestItem' definition.
--


--
-- SELECT template for table `CreateAssetInvitesRequestItem`
--
SELECT `asset_id_to_permissions`, `invite_id`, `invite_type` FROM `CreateAssetInvitesRequestItem` WHERE 1;

--
-- INSERT template for table `CreateAssetInvitesRequestItem`
--
INSERT INTO `CreateAssetInvitesRequestItem`(`asset_id_to_permissions`, `invite_id`, `invite_type`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CreateAssetInvitesRequestItem`
--
UPDATE `CreateAssetInvitesRequestItem` SET `asset_id_to_permissions` = ?, `invite_id` = ?, `invite_type` = ? WHERE 1;

--
-- DELETE template for table `CreateAssetInvitesRequestItem`
--
DELETE FROM `CreateAssetInvitesRequestItem` WHERE 0;

