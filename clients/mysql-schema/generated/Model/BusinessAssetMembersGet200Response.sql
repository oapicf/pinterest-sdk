--
-- Pinterest REST API.
-- Prepared SQL queries for 'business_asset_members_get_200_response' definition.
--


--
-- SELECT template for table `business_asset_members_get_200_response`
--
SELECT `bookmark`, `items` FROM `business_asset_members_get_200_response` WHERE 1;

--
-- INSERT template for table `business_asset_members_get_200_response`
--
INSERT INTO `business_asset_members_get_200_response`(`bookmark`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `business_asset_members_get_200_response`
--
UPDATE `business_asset_members_get_200_response` SET `bookmark` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `business_asset_members_get_200_response`
--
DELETE FROM `business_asset_members_get_200_response` WHERE 0;

