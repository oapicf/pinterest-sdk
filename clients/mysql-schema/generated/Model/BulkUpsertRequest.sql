--
-- Pinterest REST API.
-- Prepared SQL queries for 'BulkUpsertRequest' definition.
--


--
-- SELECT template for table `BulkUpsertRequest`
--
SELECT `create`, `update` FROM `BulkUpsertRequest` WHERE 1;

--
-- INSERT template for table `BulkUpsertRequest`
--
INSERT INTO `BulkUpsertRequest`(`create`, `update`) VALUES (?, ?);

--
-- UPDATE template for table `BulkUpsertRequest`
--
UPDATE `BulkUpsertRequest` SET `create` = ?, `update` = ? WHERE 1;

--
-- DELETE template for table `BulkUpsertRequest`
--
DELETE FROM `BulkUpsertRequest` WHERE 0;

