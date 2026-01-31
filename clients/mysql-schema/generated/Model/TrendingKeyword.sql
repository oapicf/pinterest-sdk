--
-- Pinterest REST API.
-- Prepared SQL queries for 'TrendingKeyword' definition.
--


--
-- SELECT template for table `TrendingKeyword`
--
SELECT `demographics`, `has_prediction`, `keyword`, `pct_growth_mom`, `pct_growth_wow`, `pct_growth_yoy`, `predicted_time_series`, `time_series` FROM `TrendingKeyword` WHERE 1;

--
-- INSERT template for table `TrendingKeyword`
--
INSERT INTO `TrendingKeyword`(`demographics`, `has_prediction`, `keyword`, `pct_growth_mom`, `pct_growth_wow`, `pct_growth_yoy`, `predicted_time_series`, `time_series`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TrendingKeyword`
--
UPDATE `TrendingKeyword` SET `demographics` = ?, `has_prediction` = ?, `keyword` = ?, `pct_growth_mom` = ?, `pct_growth_wow` = ?, `pct_growth_yoy` = ?, `predicted_time_series` = ?, `time_series` = ? WHERE 1;

--
-- DELETE template for table `TrendingKeyword`
--
DELETE FROM `TrendingKeyword` WHERE 0;

