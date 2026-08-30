--
-- Pinterest REST API.
-- Prepared SQL queries for 'AttributionWindows' definition.
--


--
-- SELECT template for table `AttributionWindows`
--
SELECT `click_window_days`, `engagement_window_days`, `view_window_days` FROM `AttributionWindows` WHERE 1;

--
-- INSERT template for table `AttributionWindows`
--
INSERT INTO `AttributionWindows`(`click_window_days`, `engagement_window_days`, `view_window_days`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AttributionWindows`
--
UPDATE `AttributionWindows` SET `click_window_days` = ?, `engagement_window_days` = ?, `view_window_days` = ? WHERE 1;

--
-- DELETE template for table `AttributionWindows`
--
DELETE FROM `AttributionWindows` WHERE 0;

