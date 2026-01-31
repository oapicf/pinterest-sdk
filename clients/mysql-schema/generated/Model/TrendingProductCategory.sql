--
-- Pinterest REST API.
-- Prepared SQL queries for 'TrendingProductCategory' definition.
--


--
-- SELECT template for table `TrendingProductCategory`
--
SELECT `engagement_type`, `pct_change_mom`, `percent_relative_volume`, `product_category`, `verticals` FROM `TrendingProductCategory` WHERE 1;

--
-- INSERT template for table `TrendingProductCategory`
--
INSERT INTO `TrendingProductCategory`(`engagement_type`, `pct_change_mom`, `percent_relative_volume`, `product_category`, `verticals`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `TrendingProductCategory`
--
UPDATE `TrendingProductCategory` SET `engagement_type` = ?, `pct_change_mom` = ?, `percent_relative_volume` = ?, `product_category` = ?, `verticals` = ? WHERE 1;

--
-- DELETE template for table `TrendingProductCategory`
--
DELETE FROM `TrendingProductCategory` WHERE 0;

