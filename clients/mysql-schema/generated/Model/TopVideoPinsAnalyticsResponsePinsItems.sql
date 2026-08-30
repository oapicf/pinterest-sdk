--
-- Pinterest REST API.
-- Prepared SQL queries for 'TopVideoPinsAnalyticsResponsePinsItems' definition.
--


--
-- SELECT template for table `TopVideoPinsAnalyticsResponsePinsItems`
--
SELECT `data_status`, `metrics`, `pin_id` FROM `TopVideoPinsAnalyticsResponsePinsItems` WHERE 1;

--
-- INSERT template for table `TopVideoPinsAnalyticsResponsePinsItems`
--
INSERT INTO `TopVideoPinsAnalyticsResponsePinsItems`(`data_status`, `metrics`, `pin_id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TopVideoPinsAnalyticsResponsePinsItems`
--
UPDATE `TopVideoPinsAnalyticsResponsePinsItems` SET `data_status` = ?, `metrics` = ?, `pin_id` = ? WHERE 1;

--
-- DELETE template for table `TopVideoPinsAnalyticsResponsePinsItems`
--
DELETE FROM `TopVideoPinsAnalyticsResponsePinsItems` WHERE 0;

