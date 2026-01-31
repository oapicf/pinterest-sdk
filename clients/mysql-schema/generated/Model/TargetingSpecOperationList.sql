--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingSpecOperationList' definition.
--


--
-- SELECT template for table `TargetingSpecOperationList`
--
SELECT `field`, `operation`, `values` FROM `TargetingSpecOperationList` WHERE 1;

--
-- INSERT template for table `TargetingSpecOperationList`
--
INSERT INTO `TargetingSpecOperationList`(`field`, `operation`, `values`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TargetingSpecOperationList`
--
UPDATE `TargetingSpecOperationList` SET `field` = ?, `operation` = ?, `values` = ? WHERE 1;

--
-- DELETE template for table `TargetingSpecOperationList`
--
DELETE FROM `TargetingSpecOperationList` WHERE 0;

