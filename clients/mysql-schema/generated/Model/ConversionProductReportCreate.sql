--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionProductReportCreate' definition.
--


--
-- SELECT template for table `ConversionProductReportCreate`
--
SELECT `ad_group_ids`, `campaign_ids`, `campaign_objective_types`, `click_window_days`, `columns`, `conversion_product_attribution_type`, `conversion_product_breakdown`, `conversion_report_time`, `end_date`, `granularity`, `level`, `product_sku_ids`, `report_name`, `start_date`, `view_window_days` FROM `ConversionProductReportCreate` WHERE 1;

--
-- INSERT template for table `ConversionProductReportCreate`
--
INSERT INTO `ConversionProductReportCreate`(`ad_group_ids`, `campaign_ids`, `campaign_objective_types`, `click_window_days`, `columns`, `conversion_product_attribution_type`, `conversion_product_breakdown`, `conversion_report_time`, `end_date`, `granularity`, `level`, `product_sku_ids`, `report_name`, `start_date`, `view_window_days`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionProductReportCreate`
--
UPDATE `ConversionProductReportCreate` SET `ad_group_ids` = ?, `campaign_ids` = ?, `campaign_objective_types` = ?, `click_window_days` = ?, `columns` = ?, `conversion_product_attribution_type` = ?, `conversion_product_breakdown` = ?, `conversion_report_time` = ?, `end_date` = ?, `granularity` = ?, `level` = ?, `product_sku_ids` = ?, `report_name` = ?, `start_date` = ?, `view_window_days` = ? WHERE 1;

--
-- DELETE template for table `ConversionProductReportCreate`
--
DELETE FROM `ConversionProductReportCreate` WHERE 0;

