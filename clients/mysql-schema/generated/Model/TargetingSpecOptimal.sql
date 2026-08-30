--
-- Pinterest REST API.
-- Prepared SQL queries for 'TargetingSpecOptimal' definition.
--


--
-- SELECT template for table `TargetingSpecOptimal`
--
SELECT `AGE_BUCKET`, `APPTYPE`, `AUDIENCE_EXCLUDE`, `AUDIENCE_INCLUDE`, `GENDER`, `GEO`, `GEO_EXCLUDE`, `INTEREST`, `LOCALE`, `LOCATION`, `LOCATION_EXCLUDE`, `MAXIMUM_AGE`, `MINIMUM_AGE`, `SHOPPING_RETARGETING`, `TARGETING_STRATEGY` FROM `TargetingSpecOptimal` WHERE 1;

--
-- INSERT template for table `TargetingSpecOptimal`
--
INSERT INTO `TargetingSpecOptimal`(`AGE_BUCKET`, `APPTYPE`, `AUDIENCE_EXCLUDE`, `AUDIENCE_INCLUDE`, `GENDER`, `GEO`, `GEO_EXCLUDE`, `INTEREST`, `LOCALE`, `LOCATION`, `LOCATION_EXCLUDE`, `MAXIMUM_AGE`, `MINIMUM_AGE`, `SHOPPING_RETARGETING`, `TARGETING_STRATEGY`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TargetingSpecOptimal`
--
UPDATE `TargetingSpecOptimal` SET `AGE_BUCKET` = ?, `APPTYPE` = ?, `AUDIENCE_EXCLUDE` = ?, `AUDIENCE_INCLUDE` = ?, `GENDER` = ?, `GEO` = ?, `GEO_EXCLUDE` = ?, `INTEREST` = ?, `LOCALE` = ?, `LOCATION` = ?, `LOCATION_EXCLUDE` = ?, `MAXIMUM_AGE` = ?, `MINIMUM_AGE` = ?, `SHOPPING_RETARGETING` = ?, `TARGETING_STRATEGY` = ? WHERE 1;

--
-- DELETE template for table `TargetingSpecOptimal`
--
DELETE FROM `TargetingSpecOptimal` WHERE 0;

