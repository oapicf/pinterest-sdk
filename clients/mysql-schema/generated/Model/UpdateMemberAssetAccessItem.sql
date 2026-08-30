--
-- Pinterest REST API.
-- Prepared SQL queries for 'UpdateMemberAssetAccessItem' definition.
--


--
-- SELECT template for table `UpdateMemberAssetAccessItem`
--
SELECT `asset_id`, `member_id`, `permissions` FROM `UpdateMemberAssetAccessItem` WHERE 1;

--
-- INSERT template for table `UpdateMemberAssetAccessItem`
--
INSERT INTO `UpdateMemberAssetAccessItem`(`asset_id`, `member_id`, `permissions`) VALUES (?, ?, ?);

--
-- UPDATE template for table `UpdateMemberAssetAccessItem`
--
UPDATE `UpdateMemberAssetAccessItem` SET `asset_id` = ?, `member_id` = ?, `permissions` = ? WHERE 1;

--
-- DELETE template for table `UpdateMemberAssetAccessItem`
--
DELETE FROM `UpdateMemberAssetAccessItem` WHERE 0;

