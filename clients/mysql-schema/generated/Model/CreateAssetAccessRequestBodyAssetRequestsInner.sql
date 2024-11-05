--
-- Pinterest REST API.
-- Prepared SQL queries for 'CreateAssetAccessRequestBody_asset_requests_inner' definition.
--


--
-- SELECT template for table `CreateAssetAccessRequestBody_asset_requests_inner`
--
SELECT `partner_id`, `asset_id_to_permissions` FROM `CreateAssetAccessRequestBody_asset_requests_inner` WHERE 1;

--
-- INSERT template for table `CreateAssetAccessRequestBody_asset_requests_inner`
--
INSERT INTO `CreateAssetAccessRequestBody_asset_requests_inner`(`partner_id`, `asset_id_to_permissions`) VALUES (?, ?);

--
-- UPDATE template for table `CreateAssetAccessRequestBody_asset_requests_inner`
--
UPDATE `CreateAssetAccessRequestBody_asset_requests_inner` SET `partner_id` = ?, `asset_id_to_permissions` = ? WHERE 1;

--
-- DELETE template for table `CreateAssetAccessRequestBody_asset_requests_inner`
--
DELETE FROM `CreateAssetAccessRequestBody_asset_requests_inner` WHERE 0;

