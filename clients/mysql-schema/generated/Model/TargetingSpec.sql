--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingSpec' definition.
--


--
-- SELECT template for table `TargetingSpec`
--
SELECT `AGE_BUCKET`, `APPTYPE`, `AUDIENCE_EXCLUDE`, `AUDIENCE_INCLUDE`, `GENDER`, `GEO`, `INTEREST`, `LOCALE`, `LOCATION`, `SHOPPING_RETARGETING`, `TARGETING_STRATEGY` FROM `TargetingSpec` WHERE 1;

--
-- INSERT template for table `TargetingSpec`
--
INSERT INTO `TargetingSpec`(`AGE_BUCKET`, `APPTYPE`, `AUDIENCE_EXCLUDE`, `AUDIENCE_INCLUDE`, `GENDER`, `GEO`, `INTEREST`, `LOCALE`, `LOCATION`, `SHOPPING_RETARGETING`, `TARGETING_STRATEGY`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TargetingSpec`
--
UPDATE `TargetingSpec` SET `AGE_BUCKET` = ?, `APPTYPE` = ?, `AUDIENCE_EXCLUDE` = ?, `AUDIENCE_INCLUDE` = ?, `GENDER` = ?, `GEO` = ?, `INTEREST` = ?, `LOCALE` = ?, `LOCATION` = ?, `SHOPPING_RETARGETING` = ?, `TARGETING_STRATEGY` = ? WHERE 1;

--
-- DELETE template for table `TargetingSpec`
--
DELETE FROM `TargetingSpec` WHERE 0;

