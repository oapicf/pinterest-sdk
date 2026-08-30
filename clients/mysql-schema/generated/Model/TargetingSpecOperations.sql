--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingSpecOperations' definition.
--


--
-- SELECT template for table `TargetingSpecOperations`
--
SELECT `field`, `operation`, `values`, `value` FROM `TargetingSpecOperations` WHERE 1;

--
-- INSERT template for table `TargetingSpecOperations`
--
INSERT INTO `TargetingSpecOperations`(`field`, `operation`, `values`, `value`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `TargetingSpecOperations`
--
UPDATE `TargetingSpecOperations` SET `field` = ?, `operation` = ?, `values` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `TargetingSpecOperations`
--
DELETE FROM `TargetingSpecOperations` WHERE 0;

