--
-- Pinterest REST API.
-- Prepared SQL queries for 'CustomerListUpdateWithRequiredBody' definition.
--


--
-- SELECT template for table `CustomerListUpdateWithRequiredBody`
--
SELECT `operation_type`, `records`, `records_v2` FROM `CustomerListUpdateWithRequiredBody` WHERE 1;

--
-- INSERT template for table `CustomerListUpdateWithRequiredBody`
--
INSERT INTO `CustomerListUpdateWithRequiredBody`(`operation_type`, `records`, `records_v2`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CustomerListUpdateWithRequiredBody`
--
UPDATE `CustomerListUpdateWithRequiredBody` SET `operation_type` = ?, `records` = ?, `records_v2` = ? WHERE 1;

--
-- DELETE template for table `CustomerListUpdateWithRequiredBody`
--
DELETE FROM `CustomerListUpdateWithRequiredBody` WHERE 0;

