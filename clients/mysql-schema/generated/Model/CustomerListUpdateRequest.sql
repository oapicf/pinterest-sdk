--
-- Pinterest REST API.
-- Prepared SQL queries for 'CustomerListUpdateRequest' definition.
--


--
-- SELECT template for table `CustomerListUpdateRequest`
--
SELECT `records`, `operation_type`, `exceptions` FROM `CustomerListUpdateRequest` WHERE 1;

--
-- INSERT template for table `CustomerListUpdateRequest`
--
INSERT INTO `CustomerListUpdateRequest`(`records`, `operation_type`, `exceptions`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CustomerListUpdateRequest`
--
UPDATE `CustomerListUpdateRequest` SET `records` = ?, `operation_type` = ?, `exceptions` = ? WHERE 1;

--
-- DELETE template for table `CustomerListUpdateRequest`
--
DELETE FROM `CustomerListUpdateRequest` WHERE 0;

