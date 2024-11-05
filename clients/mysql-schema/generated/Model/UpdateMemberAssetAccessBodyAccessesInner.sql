--
-- Pinterest REST API.
-- Prepared SQL queries for 'UpdateMemberAssetAccessBody_accesses_inner' definition.
--


--
-- SELECT template for table `UpdateMemberAssetAccessBody_accesses_inner`
--
SELECT `asset_id`, `member_id`, `permissions` FROM `UpdateMemberAssetAccessBody_accesses_inner` WHERE 1;

--
-- INSERT template for table `UpdateMemberAssetAccessBody_accesses_inner`
--
INSERT INTO `UpdateMemberAssetAccessBody_accesses_inner`(`asset_id`, `member_id`, `permissions`) VALUES (?, ?, ?);

--
-- UPDATE template for table `UpdateMemberAssetAccessBody_accesses_inner`
--
UPDATE `UpdateMemberAssetAccessBody_accesses_inner` SET `asset_id` = ?, `member_id` = ?, `permissions` = ? WHERE 1;

--
-- DELETE template for table `UpdateMemberAssetAccessBody_accesses_inner`
--
DELETE FROM `UpdateMemberAssetAccessBody_accesses_inner` WHERE 0;

