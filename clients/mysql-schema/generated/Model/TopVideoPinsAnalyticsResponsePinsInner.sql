--
-- Pinterest REST API.
-- Prepared SQL queries for 'TopVideoPinsAnalyticsResponse_pins_inner' definition.
--


--
-- SELECT template for table `TopVideoPinsAnalyticsResponse_pins_inner`
--
SELECT `data_status`, `metrics`, `pin_id` FROM `TopVideoPinsAnalyticsResponse_pins_inner` WHERE 1;

--
-- INSERT template for table `TopVideoPinsAnalyticsResponse_pins_inner`
--
INSERT INTO `TopVideoPinsAnalyticsResponse_pins_inner`(`data_status`, `metrics`, `pin_id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TopVideoPinsAnalyticsResponse_pins_inner`
--
UPDATE `TopVideoPinsAnalyticsResponse_pins_inner` SET `data_status` = ?, `metrics` = ?, `pin_id` = ? WHERE 1;

--
-- DELETE template for table `TopVideoPinsAnalyticsResponse_pins_inner`
--
DELETE FROM `TopVideoPinsAnalyticsResponse_pins_inner` WHERE 0;

