--
-- Pinterest REST API.
-- Prepared SQL queries for 'TopVideoPinsAnalyticsResponseDateAvailability' definition.
--


--
-- SELECT template for table `TopVideoPinsAnalyticsResponseDateAvailability`
--
SELECT `is_realtime`, `latest_available_timestamp` FROM `TopVideoPinsAnalyticsResponseDateAvailability` WHERE 1;

--
-- INSERT template for table `TopVideoPinsAnalyticsResponseDateAvailability`
--
INSERT INTO `TopVideoPinsAnalyticsResponseDateAvailability`(`is_realtime`, `latest_available_timestamp`) VALUES (?, ?);

--
-- UPDATE template for table `TopVideoPinsAnalyticsResponseDateAvailability`
--
UPDATE `TopVideoPinsAnalyticsResponseDateAvailability` SET `is_realtime` = ?, `latest_available_timestamp` = ? WHERE 1;

--
-- DELETE template for table `TopVideoPinsAnalyticsResponseDateAvailability`
--
DELETE FROM `TopVideoPinsAnalyticsResponseDateAvailability` WHERE 0;

