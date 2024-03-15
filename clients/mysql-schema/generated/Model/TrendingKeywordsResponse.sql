--
-- Pinterest REST API.
-- Prepared SQL queries for 'TrendingKeywordsResponse' definition.
--


--
-- SELECT template for table `TrendingKeywordsResponse`
--
SELECT `trends` FROM `TrendingKeywordsResponse` WHERE 1;

--
-- INSERT template for table `TrendingKeywordsResponse`
--
INSERT INTO `TrendingKeywordsResponse`(`trends`) VALUES (?);

--
-- UPDATE template for table `TrendingKeywordsResponse`
--
UPDATE `TrendingKeywordsResponse` SET `trends` = ? WHERE 1;

--
-- DELETE template for table `TrendingKeywordsResponse`
--
DELETE FROM `TrendingKeywordsResponse` WHERE 0;

