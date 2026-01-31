--
-- Pinterest REST API.
-- Prepared SQL queries for 'KeywordMetrics' definition.
--


--
-- SELECT template for table `KeywordMetrics`
--
SELECT `keyword_query_volume` FROM `KeywordMetrics` WHERE 1;

--
-- INSERT template for table `KeywordMetrics`
--
INSERT INTO `KeywordMetrics`(`keyword_query_volume`) VALUES (?);

--
-- UPDATE template for table `KeywordMetrics`
--
UPDATE `KeywordMetrics` SET `keyword_query_volume` = ? WHERE 1;

--
-- DELETE template for table `KeywordMetrics`
--
DELETE FROM `KeywordMetrics` WHERE 0;

