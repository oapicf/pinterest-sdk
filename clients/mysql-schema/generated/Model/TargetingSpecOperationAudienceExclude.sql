--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingSpecOperationAudienceExclude' definition.
--


--
-- SELECT template for table `TargetingSpecOperationAudienceExclude`
--
SELECT `field`, `operation`, `values` FROM `TargetingSpecOperationAudienceExclude` WHERE 1;

--
-- INSERT template for table `TargetingSpecOperationAudienceExclude`
--
INSERT INTO `TargetingSpecOperationAudienceExclude`(`field`, `operation`, `values`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TargetingSpecOperationAudienceExclude`
--
UPDATE `TargetingSpecOperationAudienceExclude` SET `field` = ?, `operation` = ?, `values` = ? WHERE 1;

--
-- DELETE template for table `TargetingSpecOperationAudienceExclude`
--
DELETE FROM `TargetingSpecOperationAudienceExclude` WHERE 0;

