--
-- Pinterest REST API.
-- Prepared SQL queries for 'DeleteAssetGroupResponse_exceptions_inner' definition.
--


--
-- SELECT template for table `DeleteAssetGroupResponse_exceptions_inner`
--
SELECT `code`, `message`, `asset_group_id` FROM `DeleteAssetGroupResponse_exceptions_inner` WHERE 1;

--
-- INSERT template for table `DeleteAssetGroupResponse_exceptions_inner`
--
INSERT INTO `DeleteAssetGroupResponse_exceptions_inner`(`code`, `message`, `asset_group_id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `DeleteAssetGroupResponse_exceptions_inner`
--
UPDATE `DeleteAssetGroupResponse_exceptions_inner` SET `code` = ?, `message` = ?, `asset_group_id` = ? WHERE 1;

--
-- DELETE template for table `DeleteAssetGroupResponse_exceptions_inner`
--
DELETE FROM `DeleteAssetGroupResponse_exceptions_inner` WHERE 0;

