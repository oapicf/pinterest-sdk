--
-- Pinterest REST API.
-- Prepared SQL queries for 'CustomerListRequest' definition.
--


--
-- SELECT template for table `CustomerListRequest`
--
SELECT `name`, `records`, `list_type`, `exceptions` FROM `CustomerListRequest` WHERE 1;

--
-- INSERT template for table `CustomerListRequest`
--
INSERT INTO `CustomerListRequest`(`name`, `records`, `list_type`, `exceptions`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `CustomerListRequest`
--
UPDATE `CustomerListRequest` SET `name` = ?, `records` = ?, `list_type` = ?, `exceptions` = ? WHERE 1;

--
-- DELETE template for table `CustomerListRequest`
--
DELETE FROM `CustomerListRequest` WHERE 0;

