--
-- Pinterest REST API.
-- Prepared SQL queries for 'business_members_asset_access_delete_request_accesses_inner' definition.
--


--
-- SELECT template for table `business_members_asset_access_delete_request_accesses_inner`
--
SELECT `asset_id`, `member_id` FROM `business_members_asset_access_delete_request_accesses_inner` WHERE 1;

--
-- INSERT template for table `business_members_asset_access_delete_request_accesses_inner`
--
INSERT INTO `business_members_asset_access_delete_request_accesses_inner`(`asset_id`, `member_id`) VALUES (?, ?);

--
-- UPDATE template for table `business_members_asset_access_delete_request_accesses_inner`
--
UPDATE `business_members_asset_access_delete_request_accesses_inner` SET `asset_id` = ?, `member_id` = ? WHERE 1;

--
-- DELETE template for table `business_members_asset_access_delete_request_accesses_inner`
--
DELETE FROM `business_members_asset_access_delete_request_accesses_inner` WHERE 0;

