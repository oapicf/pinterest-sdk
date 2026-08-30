--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupAudienceSizing' definition.
--


--
-- SELECT template for table `AdGroupAudienceSizing`
--
SELECT `audience_size_lower_bound`, `audience_size_upper_bound` FROM `AdGroupAudienceSizing` WHERE 1;

--
-- INSERT template for table `AdGroupAudienceSizing`
--
INSERT INTO `AdGroupAudienceSizing`(`audience_size_lower_bound`, `audience_size_upper_bound`) VALUES (?, ?);

--
-- UPDATE template for table `AdGroupAudienceSizing`
--
UPDATE `AdGroupAudienceSizing` SET `audience_size_lower_bound` = ?, `audience_size_upper_bound` = ? WHERE 1;

--
-- DELETE template for table `AdGroupAudienceSizing`
--
DELETE FROM `AdGroupAudienceSizing` WHERE 0;

