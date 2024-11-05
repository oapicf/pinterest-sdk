--
-- Pinterest REST API.
-- Prepared SQL queries for 'UsersForIndividualAssetResponse' definition.
--


--
-- SELECT template for table `UsersForIndividualAssetResponse`
--
SELECT `asset_id`, `member_id`, `permissions` FROM `UsersForIndividualAssetResponse` WHERE 1;

--
-- INSERT template for table `UsersForIndividualAssetResponse`
--
INSERT INTO `UsersForIndividualAssetResponse`(`asset_id`, `member_id`, `permissions`) VALUES (?, ?, ?);

--
-- UPDATE template for table `UsersForIndividualAssetResponse`
--
UPDATE `UsersForIndividualAssetResponse` SET `asset_id` = ?, `member_id` = ?, `permissions` = ? WHERE 1;

--
-- DELETE template for table `UsersForIndividualAssetResponse`
--
DELETE FROM `UsersForIndividualAssetResponse` WHERE 0;

