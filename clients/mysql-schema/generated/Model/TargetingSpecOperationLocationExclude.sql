--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingSpecOperationLocationExclude' definition.
--


--
-- SELECT template for table `TargetingSpecOperationLocationExclude`
--
SELECT `field`, `operation`, `values` FROM `TargetingSpecOperationLocationExclude` WHERE 1;

--
-- INSERT template for table `TargetingSpecOperationLocationExclude`
--
INSERT INTO `TargetingSpecOperationLocationExclude`(`field`, `operation`, `values`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TargetingSpecOperationLocationExclude`
--
UPDATE `TargetingSpecOperationLocationExclude` SET `field` = ?, `operation` = ?, `values` = ? WHERE 1;

--
-- DELETE template for table `TargetingSpecOperationLocationExclude`
--
DELETE FROM `TargetingSpecOperationLocationExclude` WHERE 0;

