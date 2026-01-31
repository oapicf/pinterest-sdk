--
-- Pinterest REST API.
-- Prepared SQL queries for 'TrendingPin' definition.
--


--
-- SELECT template for table `TrendingPin`
--
SELECT `height`, `id`, `src`, `width` FROM `TrendingPin` WHERE 1;

--
-- INSERT template for table `TrendingPin`
--
INSERT INTO `TrendingPin`(`height`, `id`, `src`, `width`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `TrendingPin`
--
UPDATE `TrendingPin` SET `height` = ?, `id` = ?, `src` = ?, `width` = ? WHERE 1;

--
-- DELETE template for table `TrendingPin`
--
DELETE FROM `TrendingPin` WHERE 0;

