--
-- Pinterest REST API.
-- Prepared SQL queries for 'TopPinsAnalyticsResponse_date_availability' definition.
--


--
-- SELECT template for table `TopPinsAnalyticsResponse_date_availability`
--
SELECT `latest_available_timestamp`, `is_realtime` FROM `TopPinsAnalyticsResponse_date_availability` WHERE 1;

--
-- INSERT template for table `TopPinsAnalyticsResponse_date_availability`
--
INSERT INTO `TopPinsAnalyticsResponse_date_availability`(`latest_available_timestamp`, `is_realtime`) VALUES (?, ?);

--
-- UPDATE template for table `TopPinsAnalyticsResponse_date_availability`
--
UPDATE `TopPinsAnalyticsResponse_date_availability` SET `latest_available_timestamp` = ?, `is_realtime` = ? WHERE 1;

--
-- DELETE template for table `TopPinsAnalyticsResponse_date_availability`
--
DELETE FROM `TopPinsAnalyticsResponse_date_availability` WHERE 0;

