--
-- Pinterest REST API.
-- Prepared SQL queries for 'TrendingTopic' definition.
--


--
-- SELECT template for table `TrendingTopic`
--
SELECT `description`, `id`, `percent_growth_mom`, `pins`, `related_interests`, `related_searches`, `time_series`, `title` FROM `TrendingTopic` WHERE 1;

--
-- INSERT template for table `TrendingTopic`
--
INSERT INTO `TrendingTopic`(`description`, `id`, `percent_growth_mom`, `pins`, `related_interests`, `related_searches`, `time_series`, `title`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TrendingTopic`
--
UPDATE `TrendingTopic` SET `description` = ?, `id` = ?, `percent_growth_mom` = ?, `pins` = ?, `related_interests` = ?, `related_searches` = ?, `time_series` = ?, `title` = ? WHERE 1;

--
-- DELETE template for table `TrendingTopic`
--
DELETE FROM `TrendingTopic` WHERE 0;

