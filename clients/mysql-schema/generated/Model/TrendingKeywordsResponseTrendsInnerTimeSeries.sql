--
-- Pinterest REST API.
-- Prepared SQL queries for 'TrendingKeywordsResponse_trends_inner_time_series' definition.
--


--
-- SELECT template for table `TrendingKeywordsResponse_trends_inner_time_series`
--
SELECT `date` FROM `TrendingKeywordsResponse_trends_inner_time_series` WHERE 1;

--
-- INSERT template for table `TrendingKeywordsResponse_trends_inner_time_series`
--
INSERT INTO `TrendingKeywordsResponse_trends_inner_time_series`(`date`) VALUES (?);

--
-- UPDATE template for table `TrendingKeywordsResponse_trends_inner_time_series`
--
UPDATE `TrendingKeywordsResponse_trends_inner_time_series` SET `date` = ? WHERE 1;

--
-- DELETE template for table `TrendingKeywordsResponse_trends_inner_time_series`
--
DELETE FROM `TrendingKeywordsResponse_trends_inner_time_series` WHERE 0;

