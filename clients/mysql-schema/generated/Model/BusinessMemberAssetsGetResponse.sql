--
-- Pinterest REST API.
-- Prepared SQL queries for 'BusinessMemberAssetsGetResponse' definition.
--


--
-- SELECT template for table `BusinessMemberAssetsGetResponse`
--
SELECT `bookmark`, `items`, `total_data_count`, `total_data_count_by_status` FROM `BusinessMemberAssetsGetResponse` WHERE 1;

--
-- INSERT template for table `BusinessMemberAssetsGetResponse`
--
INSERT INTO `BusinessMemberAssetsGetResponse`(`bookmark`, `items`, `total_data_count`, `total_data_count_by_status`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `BusinessMemberAssetsGetResponse`
--
UPDATE `BusinessMemberAssetsGetResponse` SET `bookmark` = ?, `items` = ?, `total_data_count` = ?, `total_data_count_by_status` = ? WHERE 1;

--
-- DELETE template for table `BusinessMemberAssetsGetResponse`
--
DELETE FROM `BusinessMemberAssetsGetResponse` WHERE 0;

