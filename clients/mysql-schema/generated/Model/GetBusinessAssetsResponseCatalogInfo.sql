--
-- Pinterest REST API.
-- Prepared SQL queries for 'GetBusinessAssetsResponse_catalog_info' definition.
--


--
-- SELECT template for table `GetBusinessAssetsResponse_catalog_info`
--
SELECT `catalog_type`, `id`, `name` FROM `GetBusinessAssetsResponse_catalog_info` WHERE 1;

--
-- INSERT template for table `GetBusinessAssetsResponse_catalog_info`
--
INSERT INTO `GetBusinessAssetsResponse_catalog_info`(`catalog_type`, `id`, `name`) VALUES (?, ?, ?);

--
-- UPDATE template for table `GetBusinessAssetsResponse_catalog_info`
--
UPDATE `GetBusinessAssetsResponse_catalog_info` SET `catalog_type` = ?, `id` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `GetBusinessAssetsResponse_catalog_info`
--
DELETE FROM `GetBusinessAssetsResponse_catalog_info` WHERE 0;

