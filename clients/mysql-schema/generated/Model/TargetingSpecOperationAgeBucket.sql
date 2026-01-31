--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingSpecOperationAgeBucket' definition.
--


--
-- SELECT template for table `TargetingSpecOperationAgeBucket`
--
SELECT `field`, `operation`, `values` FROM `TargetingSpecOperationAgeBucket` WHERE 1;

--
-- INSERT template for table `TargetingSpecOperationAgeBucket`
--
INSERT INTO `TargetingSpecOperationAgeBucket`(`field`, `operation`, `values`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TargetingSpecOperationAgeBucket`
--
UPDATE `TargetingSpecOperationAgeBucket` SET `field` = ?, `operation` = ?, `values` = ? WHERE 1;

--
-- DELETE template for table `TargetingSpecOperationAgeBucket`
--
DELETE FROM `TargetingSpecOperationAgeBucket` WHERE 0;

