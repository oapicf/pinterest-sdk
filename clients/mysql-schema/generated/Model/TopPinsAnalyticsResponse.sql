--
-- Pinterest REST API.
-- Prepared SQL queries for 'TopPinsAnalyticsResponse' definition.
--


--
-- SELECT template for table `TopPinsAnalyticsResponse`
--
SELECT `date_availability`, `pins`, `sort_by` FROM `TopPinsAnalyticsResponse` WHERE 1;

--
-- INSERT template for table `TopPinsAnalyticsResponse`
--
INSERT INTO `TopPinsAnalyticsResponse`(`date_availability`, `pins`, `sort_by`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TopPinsAnalyticsResponse`
--
UPDATE `TopPinsAnalyticsResponse` SET `date_availability` = ?, `pins` = ?, `sort_by` = ? WHERE 1;

--
-- DELETE template for table `TopPinsAnalyticsResponse`
--
DELETE FROM `TopPinsAnalyticsResponse` WHERE 0;

