--
-- Pinterest REST API.
-- Prepared SQL queries for 'AgeBucketMultipliers' definition.
--


--
-- SELECT template for table `AgeBucketMultipliers`
--
SELECT `AGE_BUCKET` FROM `AgeBucketMultipliers` WHERE 1;

--
-- INSERT template for table `AgeBucketMultipliers`
--
INSERT INTO `AgeBucketMultipliers`(`AGE_BUCKET`) VALUES (?);

--
-- UPDATE template for table `AgeBucketMultipliers`
--
UPDATE `AgeBucketMultipliers` SET `AGE_BUCKET` = ? WHERE 1;

--
-- DELETE template for table `AgeBucketMultipliers`
--
DELETE FROM `AgeBucketMultipliers` WHERE 0;

