--
-- Pinterest REST API.
-- Prepared SQL queries for 'CreateAssetInvitesRequestItem' definition.
--


--
-- SELECT template for table `CreateAssetInvitesRequestItem`
--
SELECT `invite_id`, `invite_type`, `asset_id_to_permissions` FROM `CreateAssetInvitesRequestItem` WHERE 1;

--
-- INSERT template for table `CreateAssetInvitesRequestItem`
--
INSERT INTO `CreateAssetInvitesRequestItem`(`invite_id`, `invite_type`, `asset_id_to_permissions`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CreateAssetInvitesRequestItem`
--
UPDATE `CreateAssetInvitesRequestItem` SET `invite_id` = ?, `invite_type` = ?, `asset_id_to_permissions` = ? WHERE 1;

--
-- DELETE template for table `CreateAssetInvitesRequestItem`
--
DELETE FROM `CreateAssetInvitesRequestItem` WHERE 0;

