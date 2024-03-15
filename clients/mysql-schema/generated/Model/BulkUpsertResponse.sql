--
-- Pinterest REST API.
-- Prepared SQL queries for 'BulkUpsertResponse' definition.
--


--
-- SELECT template for table `BulkUpsertResponse`
--
SELECT `request_id` FROM `BulkUpsertResponse` WHERE 1;

--
-- INSERT template for table `BulkUpsertResponse`
--
INSERT INTO `BulkUpsertResponse`(`request_id`) VALUES (?);

--
-- UPDATE template for table `BulkUpsertResponse`
--
UPDATE `BulkUpsertResponse` SET `request_id` = ? WHERE 1;

--
-- DELETE template for table `BulkUpsertResponse`
--
DELETE FROM `BulkUpsertResponse` WHERE 0;

