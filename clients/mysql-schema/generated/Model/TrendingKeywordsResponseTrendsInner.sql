--
-- Pinterest REST API.
-- Prepared SQL queries for 'TrendingKeywordsResponse_trends_inner' definition.
--


--
-- SELECT template for table `TrendingKeywordsResponse_trends_inner`
--
SELECT `keyword`, `pct_growth_wow`, `pct_growth_mom`, `pct_growth_yoy`, `time_series` FROM `TrendingKeywordsResponse_trends_inner` WHERE 1;

--
-- INSERT template for table `TrendingKeywordsResponse_trends_inner`
--
INSERT INTO `TrendingKeywordsResponse_trends_inner`(`keyword`, `pct_growth_wow`, `pct_growth_mom`, `pct_growth_yoy`, `time_series`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `TrendingKeywordsResponse_trends_inner`
--
UPDATE `TrendingKeywordsResponse_trends_inner` SET `keyword` = ?, `pct_growth_wow` = ?, `pct_growth_mom` = ?, `pct_growth_yoy` = ?, `time_series` = ? WHERE 1;

--
-- DELETE template for table `TrendingKeywordsResponse_trends_inner`
--
DELETE FROM `TrendingKeywordsResponse_trends_inner` WHERE 0;

