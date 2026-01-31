--
-- Pinterest REST API.
-- Prepared SQL queries for 'UpdateAssetGroupResponse_exceptions_inner' definition.
--


--
-- SELECT template for table `UpdateAssetGroupResponse_exceptions_inner`
--
SELECT `asset_group_id`, `code`, `message` FROM `UpdateAssetGroupResponse_exceptions_inner` WHERE 1;

--
-- INSERT template for table `UpdateAssetGroupResponse_exceptions_inner`
--
INSERT INTO `UpdateAssetGroupResponse_exceptions_inner`(`asset_group_id`, `code`, `message`) VALUES (?, ?, ?);

--
-- UPDATE template for table `UpdateAssetGroupResponse_exceptions_inner`
--
UPDATE `UpdateAssetGroupResponse_exceptions_inner` SET `asset_group_id` = ?, `code` = ?, `message` = ? WHERE 1;

--
-- DELETE template for table `UpdateAssetGroupResponse_exceptions_inner`
--
DELETE FROM `UpdateAssetGroupResponse_exceptions_inner` WHERE 0;

