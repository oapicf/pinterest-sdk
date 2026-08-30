--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdgroupTrackingFeatures' definition.
--


--
-- SELECT template for table `AdgroupTrackingFeatures`
--
SELECT `enabled` FROM `AdgroupTrackingFeatures` WHERE 1;

--
-- INSERT template for table `AdgroupTrackingFeatures`
--
INSERT INTO `AdgroupTrackingFeatures`(`enabled`) VALUES (?);

--
-- UPDATE template for table `AdgroupTrackingFeatures`
--
UPDATE `AdgroupTrackingFeatures` SET `enabled` = ? WHERE 1;

--
-- DELETE template for table `AdgroupTrackingFeatures`
--
DELETE FROM `AdgroupTrackingFeatures` WHERE 0;

