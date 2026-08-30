--
-- Pinterest REST API.
-- Prepared SQL queries for 'CustomerListCreate' definition.
--


--
-- SELECT template for table `CustomerListCreate`
--
SELECT `is_nca`, `list_type`, `name`, `records`, `records_v2` FROM `CustomerListCreate` WHERE 1;

--
-- INSERT template for table `CustomerListCreate`
--
INSERT INTO `CustomerListCreate`(`is_nca`, `list_type`, `name`, `records`, `records_v2`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `CustomerListCreate`
--
UPDATE `CustomerListCreate` SET `is_nca` = ?, `list_type` = ?, `name` = ?, `records` = ?, `records_v2` = ? WHERE 1;

--
-- DELETE template for table `CustomerListCreate`
--
DELETE FROM `CustomerListCreate` WHERE 0;

