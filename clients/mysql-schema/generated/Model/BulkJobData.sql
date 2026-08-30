--
-- Pinterest REST API.
-- Prepared SQL queries for 'BulkJobData' definition.
--


--
-- SELECT template for table `BulkJobData`
--
SELECT `result_url`, `status`, `workload_id` FROM `BulkJobData` WHERE 1;

--
-- INSERT template for table `BulkJobData`
--
INSERT INTO `BulkJobData`(`result_url`, `status`, `workload_id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `BulkJobData`
--
UPDATE `BulkJobData` SET `result_url` = ?, `status` = ?, `workload_id` = ? WHERE 1;

--
-- DELETE template for table `BulkJobData`
--
DELETE FROM `BulkJobData` WHERE 0;

