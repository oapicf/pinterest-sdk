--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionProductReportRequest' definition.
--


--
-- SELECT template for table `ConversionProductReportRequest`
--
SELECT `ad_group_ids`, `campaign_ids`, `campaign_objective_types`, `click_window_days`, `columns`, `conversion_product_attribution_type`, `conversion_product_breakdown`, `conversion_report_time`, `end_date`, `granularity`, `level`, `product_sku_ids`, `report_name`, `start_date`, `view_window_days` FROM `ConversionProductReportRequest` WHERE 1;

--
-- INSERT template for table `ConversionProductReportRequest`
--
INSERT INTO `ConversionProductReportRequest`(`ad_group_ids`, `campaign_ids`, `campaign_objective_types`, `click_window_days`, `columns`, `conversion_product_attribution_type`, `conversion_product_breakdown`, `conversion_report_time`, `end_date`, `granularity`, `level`, `product_sku_ids`, `report_name`, `start_date`, `view_window_days`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionProductReportRequest`
--
UPDATE `ConversionProductReportRequest` SET `ad_group_ids` = ?, `campaign_ids` = ?, `campaign_objective_types` = ?, `click_window_days` = ?, `columns` = ?, `conversion_product_attribution_type` = ?, `conversion_product_breakdown` = ?, `conversion_report_time` = ?, `end_date` = ?, `granularity` = ?, `level` = ?, `product_sku_ids` = ?, `report_name` = ?, `start_date` = ?, `view_window_days` = ? WHERE 1;

--
-- DELETE template for table `ConversionProductReportRequest`
--
DELETE FROM `ConversionProductReportRequest` WHERE 0;

