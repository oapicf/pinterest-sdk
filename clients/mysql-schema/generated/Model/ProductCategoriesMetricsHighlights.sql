--
-- Pinterest REST API.
-- Prepared SQL queries for 'ProductCategoriesMetricsHighlights' definition.
--


--
-- SELECT template for table `ProductCategoriesMetricsHighlights`
--
SELECT `engagement`, `outbound_clicks`, `pin_saves` FROM `ProductCategoriesMetricsHighlights` WHERE 1;

--
-- INSERT template for table `ProductCategoriesMetricsHighlights`
--
INSERT INTO `ProductCategoriesMetricsHighlights`(`engagement`, `outbound_clicks`, `pin_saves`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ProductCategoriesMetricsHighlights`
--
UPDATE `ProductCategoriesMetricsHighlights` SET `engagement` = ?, `outbound_clicks` = ?, `pin_saves` = ? WHERE 1;

--
-- DELETE template for table `ProductCategoriesMetricsHighlights`
--
DELETE FROM `ProductCategoriesMetricsHighlights` WHERE 0;

