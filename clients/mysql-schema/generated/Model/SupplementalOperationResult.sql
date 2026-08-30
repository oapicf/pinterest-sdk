--
-- Pinterest REST API.
-- Prepared SQL queries for 'SupplementalOperationResult' definition.
--


--
-- SELECT template for table `SupplementalOperationResult`
--
SELECT `errors`, `item_id`, `status`, `store_code`, `supplemental_type`, `warnings` FROM `SupplementalOperationResult` WHERE 1;

--
-- INSERT template for table `SupplementalOperationResult`
--
INSERT INTO `SupplementalOperationResult`(`errors`, `item_id`, `status`, `store_code`, `supplemental_type`, `warnings`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SupplementalOperationResult`
--
UPDATE `SupplementalOperationResult` SET `errors` = ?, `item_id` = ?, `status` = ?, `store_code` = ?, `supplemental_type` = ?, `warnings` = ? WHERE 1;

--
-- DELETE template for table `SupplementalOperationResult`
--
DELETE FROM `SupplementalOperationResult` WHERE 0;

