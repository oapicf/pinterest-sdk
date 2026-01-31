--
-- Pinterest REST API.
-- Prepared SQL queries for 'BulkUpsertStatusResponse' definition.
--


--
-- SELECT template for table `BulkUpsertStatusResponse`
--
SELECT `result_url`, `status` FROM `BulkUpsertStatusResponse` WHERE 1;

--
-- INSERT template for table `BulkUpsertStatusResponse`
--
INSERT INTO `BulkUpsertStatusResponse`(`result_url`, `status`) VALUES (?, ?);

--
-- UPDATE template for table `BulkUpsertStatusResponse`
--
UPDATE `BulkUpsertStatusResponse` SET `result_url` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `BulkUpsertStatusResponse`
--
DELETE FROM `BulkUpsertStatusResponse` WHERE 0;

