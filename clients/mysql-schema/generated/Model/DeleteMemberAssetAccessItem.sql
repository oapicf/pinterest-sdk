--
-- Pinterest REST API.
-- Prepared SQL queries for 'DeleteMemberAssetAccessItem' definition.
--


--
-- SELECT template for table `DeleteMemberAssetAccessItem`
--
SELECT `asset_id`, `member_id` FROM `DeleteMemberAssetAccessItem` WHERE 1;

--
-- INSERT template for table `DeleteMemberAssetAccessItem`
--
INSERT INTO `DeleteMemberAssetAccessItem`(`asset_id`, `member_id`) VALUES (?, ?);

--
-- UPDATE template for table `DeleteMemberAssetAccessItem`
--
UPDATE `DeleteMemberAssetAccessItem` SET `asset_id` = ?, `member_id` = ? WHERE 1;

--
-- DELETE template for table `DeleteMemberAssetAccessItem`
--
DELETE FROM `DeleteMemberAssetAccessItem` WHERE 0;

