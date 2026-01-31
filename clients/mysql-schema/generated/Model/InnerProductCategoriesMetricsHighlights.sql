--
-- Pinterest REST API.
-- Prepared SQL queries for 'InnerProductCategoriesMetricsHighlights' definition.
--


--
-- SELECT template for table `InnerProductCategoriesMetricsHighlights`
--
SELECT `pct_change_mom` FROM `InnerProductCategoriesMetricsHighlights` WHERE 1;

--
-- INSERT template for table `InnerProductCategoriesMetricsHighlights`
--
INSERT INTO `InnerProductCategoriesMetricsHighlights`(`pct_change_mom`) VALUES (?);

--
-- UPDATE template for table `InnerProductCategoriesMetricsHighlights`
--
UPDATE `InnerProductCategoriesMetricsHighlights` SET `pct_change_mom` = ? WHERE 1;

--
-- DELETE template for table `InnerProductCategoriesMetricsHighlights`
--
DELETE FROM `InnerProductCategoriesMetricsHighlights` WHERE 0;

