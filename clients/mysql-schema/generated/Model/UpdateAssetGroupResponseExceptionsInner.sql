--
-- Pinterest REST API.
-- Prepared SQL queries for 'UpdateAssetGroupResponse_exceptions_inner' definition.
--


--
-- SELECT template for table `UpdateAssetGroupResponse_exceptions_inner`
--
SELECT `code`, `message`, `asset_group_id` FROM `UpdateAssetGroupResponse_exceptions_inner` WHERE 1;

--
-- INSERT template for table `UpdateAssetGroupResponse_exceptions_inner`
--
INSERT INTO `UpdateAssetGroupResponse_exceptions_inner`(`code`, `message`, `asset_group_id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `UpdateAssetGroupResponse_exceptions_inner`
--
UPDATE `UpdateAssetGroupResponse_exceptions_inner` SET `code` = ?, `message` = ?, `asset_group_id` = ? WHERE 1;

--
-- DELETE template for table `UpdateAssetGroupResponse_exceptions_inner`
--
DELETE FROM `UpdateAssetGroupResponse_exceptions_inner` WHERE 0;

