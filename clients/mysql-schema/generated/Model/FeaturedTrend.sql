--
-- Pinterest REST API.
-- Prepared SQL queries for 'FeaturedTrend' definition.
--


--
-- SELECT template for table `FeaturedTrend`
--
SELECT `interest`, `market`, `trends` FROM `FeaturedTrend` WHERE 1;

--
-- INSERT template for table `FeaturedTrend`
--
INSERT INTO `FeaturedTrend`(`interest`, `market`, `trends`) VALUES (?, ?, ?);

--
-- UPDATE template for table `FeaturedTrend`
--
UPDATE `FeaturedTrend` SET `interest` = ?, `market` = ?, `trends` = ? WHERE 1;

--
-- DELETE template for table `FeaturedTrend`
--
DELETE FROM `FeaturedTrend` WHERE 0;

