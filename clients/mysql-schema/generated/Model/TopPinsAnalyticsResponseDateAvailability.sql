--
-- Pinterest REST API.
-- Prepared SQL queries for 'TopPinsAnalyticsResponseDateAvailability' definition.
--


--
-- SELECT template for table `TopPinsAnalyticsResponseDateAvailability`
--
SELECT `is_realtime`, `latest_available_timestamp` FROM `TopPinsAnalyticsResponseDateAvailability` WHERE 1;

--
-- INSERT template for table `TopPinsAnalyticsResponseDateAvailability`
--
INSERT INTO `TopPinsAnalyticsResponseDateAvailability`(`is_realtime`, `latest_available_timestamp`) VALUES (?, ?);

--
-- UPDATE template for table `TopPinsAnalyticsResponseDateAvailability`
--
UPDATE `TopPinsAnalyticsResponseDateAvailability` SET `is_realtime` = ?, `latest_available_timestamp` = ? WHERE 1;

--
-- DELETE template for table `TopPinsAnalyticsResponseDateAvailability`
--
DELETE FROM `TopPinsAnalyticsResponseDateAvailability` WHERE 0;

