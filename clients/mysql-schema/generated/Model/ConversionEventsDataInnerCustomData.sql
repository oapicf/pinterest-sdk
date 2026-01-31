--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionEvents_data_inner_custom_data' definition.
--


--
-- SELECT template for table `ConversionEvents_data_inner_custom_data`
--
SELECT `content_brand`, `content_category`, `content_ids`, `content_name`, `contents`, `currency`, `external_measurement_id`, `external_measurement_vendor_id`, `np`, `num_items`, `opt_out_type`, `order_id`, `predicted_ltv`, `search_string`, `value` FROM `ConversionEvents_data_inner_custom_data` WHERE 1;

--
-- INSERT template for table `ConversionEvents_data_inner_custom_data`
--
INSERT INTO `ConversionEvents_data_inner_custom_data`(`content_brand`, `content_category`, `content_ids`, `content_name`, `contents`, `currency`, `external_measurement_id`, `external_measurement_vendor_id`, `np`, `num_items`, `opt_out_type`, `order_id`, `predicted_ltv`, `search_string`, `value`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionEvents_data_inner_custom_data`
--
UPDATE `ConversionEvents_data_inner_custom_data` SET `content_brand` = ?, `content_category` = ?, `content_ids` = ?, `content_name` = ?, `contents` = ?, `currency` = ?, `external_measurement_id` = ?, `external_measurement_vendor_id` = ?, `np` = ?, `num_items` = ?, `opt_out_type` = ?, `order_id` = ?, `predicted_ltv` = ?, `search_string` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `ConversionEvents_data_inner_custom_data`
--
DELETE FROM `ConversionEvents_data_inner_custom_data` WHERE 0;

