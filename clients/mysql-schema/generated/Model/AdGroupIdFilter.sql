--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupIdFilter' definition.
--


--
-- SELECT template for table `AdGroupIdFilter`
--
SELECT `ad_group_ids` FROM `AdGroupIdFilter` WHERE 1;

--
-- INSERT template for table `AdGroupIdFilter`
--
INSERT INTO `AdGroupIdFilter`(`ad_group_ids`) VALUES (?);

--
-- UPDATE template for table `AdGroupIdFilter`
--
UPDATE `AdGroupIdFilter` SET `ad_group_ids` = ? WHERE 1;

--
-- DELETE template for table `AdGroupIdFilter`
--
DELETE FROM `AdGroupIdFilter` WHERE 0;

