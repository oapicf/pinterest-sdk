--
-- Pinterest REST API.
-- Prepared SQL queries for 'TopPinsAnalyticsResponse_pins_inner' definition.
--


--
-- SELECT template for table `TopPinsAnalyticsResponse_pins_inner`
--
SELECT `metrics`, `data_status`, `pin_id` FROM `TopPinsAnalyticsResponse_pins_inner` WHERE 1;

--
-- INSERT template for table `TopPinsAnalyticsResponse_pins_inner`
--
INSERT INTO `TopPinsAnalyticsResponse_pins_inner`(`metrics`, `data_status`, `pin_id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TopPinsAnalyticsResponse_pins_inner`
--
UPDATE `TopPinsAnalyticsResponse_pins_inner` SET `metrics` = ?, `data_status` = ?, `pin_id` = ? WHERE 1;

--
-- DELETE template for table `TopPinsAnalyticsResponse_pins_inner`
--
DELETE FROM `TopPinsAnalyticsResponse_pins_inner` WHERE 0;

