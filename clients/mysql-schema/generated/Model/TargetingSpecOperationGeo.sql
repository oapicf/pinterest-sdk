--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingSpecOperationGeo' definition.
--


--
-- SELECT template for table `TargetingSpecOperationGeo`
--
SELECT `field`, `operation`, `values` FROM `TargetingSpecOperationGeo` WHERE 1;

--
-- INSERT template for table `TargetingSpecOperationGeo`
--
INSERT INTO `TargetingSpecOperationGeo`(`field`, `operation`, `values`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TargetingSpecOperationGeo`
--
UPDATE `TargetingSpecOperationGeo` SET `field` = ?, `operation` = ?, `values` = ? WHERE 1;

--
-- DELETE template for table `TargetingSpecOperationGeo`
--
DELETE FROM `TargetingSpecOperationGeo` WHERE 0;

