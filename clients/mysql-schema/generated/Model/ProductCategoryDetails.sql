--
-- Pinterest REST API.
-- Prepared SQL queries for 'ProductCategoryDetails' definition.
--


--
-- SELECT template for table `ProductCategoryDetails`
--
SELECT `demographics`, `has_prediction`, `metrics_highlights`, `predicted_time_series`, `product_category`, `related_searches`, `time_series` FROM `ProductCategoryDetails` WHERE 1;

--
-- INSERT template for table `ProductCategoryDetails`
--
INSERT INTO `ProductCategoryDetails`(`demographics`, `has_prediction`, `metrics_highlights`, `predicted_time_series`, `product_category`, `related_searches`, `time_series`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ProductCategoryDetails`
--
UPDATE `ProductCategoryDetails` SET `demographics` = ?, `has_prediction` = ?, `metrics_highlights` = ?, `predicted_time_series` = ?, `product_category` = ?, `related_searches` = ?, `time_series` = ? WHERE 1;

--
-- DELETE template for table `ProductCategoryDetails`
--
DELETE FROM `ProductCategoryDetails` WHERE 0;

