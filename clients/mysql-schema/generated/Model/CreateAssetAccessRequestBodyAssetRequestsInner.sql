--
-- Pinterest REST API.
-- Prepared SQL queries for 'CreateAssetAccessRequestBody_asset_requests_inner' definition.
--


--
-- SELECT template for table `CreateAssetAccessRequestBody_asset_requests_inner`
--
SELECT `asset_id_to_permissions`, `partner_id` FROM `CreateAssetAccessRequestBody_asset_requests_inner` WHERE 1;

--
-- INSERT template for table `CreateAssetAccessRequestBody_asset_requests_inner`
--
INSERT INTO `CreateAssetAccessRequestBody_asset_requests_inner`(`asset_id_to_permissions`, `partner_id`) VALUES (?, ?);

--
-- UPDATE template for table `CreateAssetAccessRequestBody_asset_requests_inner`
--
UPDATE `CreateAssetAccessRequestBody_asset_requests_inner` SET `asset_id_to_permissions` = ?, `partner_id` = ? WHERE 1;

--
-- DELETE template for table `CreateAssetAccessRequestBody_asset_requests_inner`
--
DELETE FROM `CreateAssetAccessRequestBody_asset_requests_inner` WHERE 0;

