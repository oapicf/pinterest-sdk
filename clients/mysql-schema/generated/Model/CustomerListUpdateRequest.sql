--
-- Pinterest REST API.
-- Prepared SQL queries for 'CustomerListUpdateRequest' definition.
--


--
-- SELECT template for table `CustomerListUpdateRequest`
--
SELECT `operation_type`, `records` FROM `CustomerListUpdateRequest` WHERE 1;

--
-- INSERT template for table `CustomerListUpdateRequest`
--
INSERT INTO `CustomerListUpdateRequest`(`operation_type`, `records`) VALUES (?, ?);

--
-- UPDATE template for table `CustomerListUpdateRequest`
--
UPDATE `CustomerListUpdateRequest` SET `operation_type` = ?, `records` = ? WHERE 1;

--
-- DELETE template for table `CustomerListUpdateRequest`
--
DELETE FROM `CustomerListUpdateRequest` WHERE 0;

