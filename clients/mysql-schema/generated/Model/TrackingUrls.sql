--
-- Pinterest REST API.
-- Prepared SQL queries for 'TrackingUrls' definition.
--


--
-- SELECT template for table `TrackingUrls`
--
SELECT `impression`, `click`, `engagement`, `buyable_button`, `audience_verification` FROM `TrackingUrls` WHERE 1;

--
-- INSERT template for table `TrackingUrls`
--
INSERT INTO `TrackingUrls`(`impression`, `click`, `engagement`, `buyable_button`, `audience_verification`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `TrackingUrls`
--
UPDATE `TrackingUrls` SET `impression` = ?, `click` = ?, `engagement` = ?, `buyable_button` = ?, `audience_verification` = ? WHERE 1;

--
-- DELETE template for table `TrackingUrls`
--
DELETE FROM `TrackingUrls` WHERE 0;

