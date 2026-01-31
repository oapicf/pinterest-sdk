--
-- Pinterest REST API.
-- Prepared SQL queries for 'TrackingUrls' definition.
--


--
-- SELECT template for table `TrackingUrls`
--
SELECT `audience_verification`, `buyable_button`, `click`, `engagement`, `impression` FROM `TrackingUrls` WHERE 1;

--
-- INSERT template for table `TrackingUrls`
--
INSERT INTO `TrackingUrls`(`audience_verification`, `buyable_button`, `click`, `engagement`, `impression`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `TrackingUrls`
--
UPDATE `TrackingUrls` SET `audience_verification` = ?, `buyable_button` = ?, `click` = ?, `engagement` = ?, `impression` = ? WHERE 1;

--
-- DELETE template for table `TrackingUrls`
--
DELETE FROM `TrackingUrls` WHERE 0;

