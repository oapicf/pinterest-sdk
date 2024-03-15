--
-- Pinterest REST API.
-- Prepared SQL queries for 'TopVideoPinsAnalyticsResponse_pins_inner' definition.
--


--
-- SELECT template for table `TopVideoPinsAnalyticsResponse_pins_inner`
--
SELECT `metrics`, `data_status`, `pin_id` FROM `TopVideoPinsAnalyticsResponse_pins_inner` WHERE 1;

--
-- INSERT template for table `TopVideoPinsAnalyticsResponse_pins_inner`
--
INSERT INTO `TopVideoPinsAnalyticsResponse_pins_inner`(`metrics`, `data_status`, `pin_id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TopVideoPinsAnalyticsResponse_pins_inner`
--
UPDATE `TopVideoPinsAnalyticsResponse_pins_inner` SET `metrics` = ?, `data_status` = ?, `pin_id` = ? WHERE 1;

--
-- DELETE template for table `TopVideoPinsAnalyticsResponse_pins_inner`
--
DELETE FROM `TopVideoPinsAnalyticsResponse_pins_inner` WHERE 0;

