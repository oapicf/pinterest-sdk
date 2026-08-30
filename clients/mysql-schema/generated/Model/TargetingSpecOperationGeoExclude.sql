--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingSpecOperationGeoExclude' definition.
--


--
-- SELECT template for table `TargetingSpecOperationGeoExclude`
--
SELECT `field`, `operation`, `values` FROM `TargetingSpecOperationGeoExclude` WHERE 1;

--
-- INSERT template for table `TargetingSpecOperationGeoExclude`
--
INSERT INTO `TargetingSpecOperationGeoExclude`(`field`, `operation`, `values`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TargetingSpecOperationGeoExclude`
--
UPDATE `TargetingSpecOperationGeoExclude` SET `field` = ?, `operation` = ?, `values` = ? WHERE 1;

--
-- DELETE template for table `TargetingSpecOperationGeoExclude`
--
DELETE FROM `TargetingSpecOperationGeoExclude` WHERE 0;

