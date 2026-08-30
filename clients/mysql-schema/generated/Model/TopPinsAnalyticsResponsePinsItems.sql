--
-- Pinterest REST API.
-- Prepared SQL queries for 'TopPinsAnalyticsResponsePinsItems' definition.
--


--
-- SELECT template for table `TopPinsAnalyticsResponsePinsItems`
--
SELECT `data_status`, `metrics`, `pin_id` FROM `TopPinsAnalyticsResponsePinsItems` WHERE 1;

--
-- INSERT template for table `TopPinsAnalyticsResponsePinsItems`
--
INSERT INTO `TopPinsAnalyticsResponsePinsItems`(`data_status`, `metrics`, `pin_id`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TopPinsAnalyticsResponsePinsItems`
--
UPDATE `TopPinsAnalyticsResponsePinsItems` SET `data_status` = ?, `metrics` = ?, `pin_id` = ? WHERE 1;

--
-- DELETE template for table `TopPinsAnalyticsResponsePinsItems`
--
DELETE FROM `TopPinsAnalyticsResponsePinsItems` WHERE 0;

