--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupTrackingURLs' definition.
--


--
-- SELECT template for table `AdGroupTrackingURLs`
--
SELECT `audience_verification`, `buyable_button`, `click`, `engagement`, `impression` FROM `AdGroupTrackingURLs` WHERE 1;

--
-- INSERT template for table `AdGroupTrackingURLs`
--
INSERT INTO `AdGroupTrackingURLs`(`audience_verification`, `buyable_button`, `click`, `engagement`, `impression`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdGroupTrackingURLs`
--
UPDATE `AdGroupTrackingURLs` SET `audience_verification` = ?, `buyable_button` = ?, `click` = ?, `engagement` = ?, `impression` = ? WHERE 1;

--
-- DELETE template for table `AdGroupTrackingURLs`
--
DELETE FROM `AdGroupTrackingURLs` WHERE 0;

