--
-- Pinterest REST API.
-- Prepared SQL queries for 'TopPinsAnalyticsResponse_date_availability' definition.
--


--
-- SELECT template for table `TopPinsAnalyticsResponse_date_availability`
--
SELECT `is_realtime`, `latest_available_timestamp` FROM `TopPinsAnalyticsResponse_date_availability` WHERE 1;

--
-- INSERT template for table `TopPinsAnalyticsResponse_date_availability`
--
INSERT INTO `TopPinsAnalyticsResponse_date_availability`(`is_realtime`, `latest_available_timestamp`) VALUES (?, ?);

--
-- UPDATE template for table `TopPinsAnalyticsResponse_date_availability`
--
UPDATE `TopPinsAnalyticsResponse_date_availability` SET `is_realtime` = ?, `latest_available_timestamp` = ? WHERE 1;

--
-- DELETE template for table `TopPinsAnalyticsResponse_date_availability`
--
DELETE FROM `TopPinsAnalyticsResponse_date_availability` WHERE 0;

