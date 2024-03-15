--
-- Pinterest REST API.
-- Prepared SQL queries for 'BulkUpsertStatusResponse' definition.
--


--
-- SELECT template for table `BulkUpsertStatusResponse`
--
SELECT `status`, `result_url` FROM `BulkUpsertStatusResponse` WHERE 1;

--
-- INSERT template for table `BulkUpsertStatusResponse`
--
INSERT INTO `BulkUpsertStatusResponse`(`status`, `result_url`) VALUES (?, ?);

--
-- UPDATE template for table `BulkUpsertStatusResponse`
--
UPDATE `BulkUpsertStatusResponse` SET `status` = ?, `result_url` = ? WHERE 1;

--
-- DELETE template for table `BulkUpsertStatusResponse`
--
DELETE FROM `BulkUpsertStatusResponse` WHERE 0;

