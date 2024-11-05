--
-- Pinterest REST API.
-- Prepared SQL queries for 'business_members_asset_access_delete_request' definition.
--


--
-- SELECT template for table `business_members_asset_access_delete_request`
--
SELECT `accesses` FROM `business_members_asset_access_delete_request` WHERE 1;

--
-- INSERT template for table `business_members_asset_access_delete_request`
--
INSERT INTO `business_members_asset_access_delete_request`(`accesses`) VALUES (?);

--
-- UPDATE template for table `business_members_asset_access_delete_request`
--
UPDATE `business_members_asset_access_delete_request` SET `accesses` = ? WHERE 1;

--
-- DELETE template for table `business_members_asset_access_delete_request`
--
DELETE FROM `business_members_asset_access_delete_request` WHERE 0;

