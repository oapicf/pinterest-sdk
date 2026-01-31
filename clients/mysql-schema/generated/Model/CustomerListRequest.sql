--
-- Pinterest REST API.
-- Prepared SQL queries for 'CustomerListRequest' definition.
--


--
-- SELECT template for table `CustomerListRequest`
--
SELECT `list_type`, `name`, `records` FROM `CustomerListRequest` WHERE 1;

--
-- INSERT template for table `CustomerListRequest`
--
INSERT INTO `CustomerListRequest`(`list_type`, `name`, `records`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CustomerListRequest`
--
UPDATE `CustomerListRequest` SET `list_type` = ?, `name` = ?, `records` = ? WHERE 1;

--
-- DELETE template for table `CustomerListRequest`
--
DELETE FROM `CustomerListRequest` WHERE 0;

