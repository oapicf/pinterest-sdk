--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingSpecOperationString' definition.
--


--
-- SELECT template for table `TargetingSpecOperationString`
--
SELECT `field`, `operation`, `value` FROM `TargetingSpecOperationString` WHERE 1;

--
-- INSERT template for table `TargetingSpecOperationString`
--
INSERT INTO `TargetingSpecOperationString`(`field`, `operation`, `value`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TargetingSpecOperationString`
--
UPDATE `TargetingSpecOperationString` SET `field` = ?, `operation` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `TargetingSpecOperationString`
--
DELETE FROM `TargetingSpecOperationString` WHERE 0;

