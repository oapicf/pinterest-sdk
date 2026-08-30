--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingSpecOperationLocation' definition.
--


--
-- SELECT template for table `TargetingSpecOperationLocation`
--
SELECT `field`, `operation`, `values` FROM `TargetingSpecOperationLocation` WHERE 1;

--
-- INSERT template for table `TargetingSpecOperationLocation`
--
INSERT INTO `TargetingSpecOperationLocation`(`field`, `operation`, `values`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TargetingSpecOperationLocation`
--
UPDATE `TargetingSpecOperationLocation` SET `field` = ?, `operation` = ?, `values` = ? WHERE 1;

--
-- DELETE template for table `TargetingSpecOperationLocation`
--
DELETE FROM `TargetingSpecOperationLocation` WHERE 0;

