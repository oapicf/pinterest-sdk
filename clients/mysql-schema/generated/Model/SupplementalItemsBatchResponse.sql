--
-- Pinterest REST API.
-- Prepared SQL queries for 'SupplementalItemsBatchResponse' definition.
--


--
-- SELECT template for table `SupplementalItemsBatchResponse`
--
SELECT `batch_id`, `completed_time`, `created_time`, `operation_results`, `status` FROM `SupplementalItemsBatchResponse` WHERE 1;

--
-- INSERT template for table `SupplementalItemsBatchResponse`
--
INSERT INTO `SupplementalItemsBatchResponse`(`batch_id`, `completed_time`, `created_time`, `operation_results`, `status`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `SupplementalItemsBatchResponse`
--
UPDATE `SupplementalItemsBatchResponse` SET `batch_id` = ?, `completed_time` = ?, `created_time` = ?, `operation_results` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `SupplementalItemsBatchResponse`
--
DELETE FROM `SupplementalItemsBatchResponse` WHERE 0;

