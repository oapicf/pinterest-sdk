--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingSpecOperationAudienceInclude' definition.
--


--
-- SELECT template for table `TargetingSpecOperationAudienceInclude`
--
SELECT `field`, `operation`, `values` FROM `TargetingSpecOperationAudienceInclude` WHERE 1;

--
-- INSERT template for table `TargetingSpecOperationAudienceInclude`
--
INSERT INTO `TargetingSpecOperationAudienceInclude`(`field`, `operation`, `values`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TargetingSpecOperationAudienceInclude`
--
UPDATE `TargetingSpecOperationAudienceInclude` SET `field` = ?, `operation` = ?, `values` = ? WHERE 1;

--
-- DELETE template for table `TargetingSpecOperationAudienceInclude`
--
DELETE FROM `TargetingSpecOperationAudienceInclude` WHERE 0;

