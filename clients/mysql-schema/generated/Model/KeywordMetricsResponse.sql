--
-- Pinterest REST API.
-- Prepared SQL queries for 'KeywordMetricsResponse' definition.
--


--
-- SELECT template for table `KeywordMetricsResponse`
--
SELECT `keyword`, `metrics` FROM `KeywordMetricsResponse` WHERE 1;

--
-- INSERT template for table `KeywordMetricsResponse`
--
INSERT INTO `KeywordMetricsResponse`(`keyword`, `metrics`) VALUES (?, ?);

--
-- UPDATE template for table `KeywordMetricsResponse`
--
UPDATE `KeywordMetricsResponse` SET `keyword` = ?, `metrics` = ? WHERE 1;

--
-- DELETE template for table `KeywordMetricsResponse`
--
DELETE FROM `KeywordMetricsResponse` WHERE 0;

