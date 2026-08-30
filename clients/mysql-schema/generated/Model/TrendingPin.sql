--
-- Pinterest REST API.
-- Prepared SQL queries for 'TrendingPin' definition.
--


--
-- SELECT template for table `TrendingPin`
--
SELECT `color`, `height`, `id`, `src`, `vertical_offset`, `width` FROM `TrendingPin` WHERE 1;

--
-- INSERT template for table `TrendingPin`
--
INSERT INTO `TrendingPin`(`color`, `height`, `id`, `src`, `vertical_offset`, `width`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `TrendingPin`
--
UPDATE `TrendingPin` SET `color` = ?, `height` = ?, `id` = ?, `src` = ?, `vertical_offset` = ?, `width` = ? WHERE 1;

--
-- DELETE template for table `TrendingPin`
--
DELETE FROM `TrendingPin` WHERE 0;

