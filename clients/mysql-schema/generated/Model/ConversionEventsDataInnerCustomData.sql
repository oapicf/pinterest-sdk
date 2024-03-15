--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionEvents_data_inner_custom_data' definition.
--


--
-- SELECT template for table `ConversionEvents_data_inner_custom_data`
--
SELECT `currency`, `value`, `content_ids`, `content_name`, `content_category`, `content_brand`, `contents`, `num_items`, `order_id`, `search_string`, `opt_out_type`, `np` FROM `ConversionEvents_data_inner_custom_data` WHERE 1;

--
-- INSERT template for table `ConversionEvents_data_inner_custom_data`
--
INSERT INTO `ConversionEvents_data_inner_custom_data`(`currency`, `value`, `content_ids`, `content_name`, `content_category`, `content_brand`, `contents`, `num_items`, `order_id`, `search_string`, `opt_out_type`, `np`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionEvents_data_inner_custom_data`
--
UPDATE `ConversionEvents_data_inner_custom_data` SET `currency` = ?, `value` = ?, `content_ids` = ?, `content_name` = ?, `content_category` = ?, `content_brand` = ?, `contents` = ?, `num_items` = ?, `order_id` = ?, `search_string` = ?, `opt_out_type` = ?, `np` = ? WHERE 1;

--
-- DELETE template for table `ConversionEvents_data_inner_custom_data`
--
DELETE FROM `ConversionEvents_data_inner_custom_data` WHERE 0;

