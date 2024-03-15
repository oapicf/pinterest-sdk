--
-- Pinterest REST API.
-- Prepared SQL queries for 'TopVideoPinsAnalyticsResponse' definition.
--


--
-- SELECT template for table `TopVideoPinsAnalyticsResponse`
--
SELECT `date_availability`, `pins`, `sort_by` FROM `TopVideoPinsAnalyticsResponse` WHERE 1;

--
-- INSERT template for table `TopVideoPinsAnalyticsResponse`
--
INSERT INTO `TopVideoPinsAnalyticsResponse`(`date_availability`, `pins`, `sort_by`) VALUES (?, ?, ?);

--
-- UPDATE template for table `TopVideoPinsAnalyticsResponse`
--
UPDATE `TopVideoPinsAnalyticsResponse` SET `date_availability` = ?, `pins` = ?, `sort_by` = ? WHERE 1;

--
-- DELETE template for table `TopVideoPinsAnalyticsResponse`
--
DELETE FROM `TopVideoPinsAnalyticsResponse` WHERE 0;

